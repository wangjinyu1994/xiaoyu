package com.xiaoyu.common.base.util;

import com.alibaba.fastjson.JSON;
import com.xiaoyu.common.base.constants.ResponseEnum;
import com.xiaoyu.common.base.constants.SysConstantsEnum;
import com.xiaoyu.common.base.exception.CommonServiceException;
import com.xiaoyu.common.base.req.BaseReqBean;
import com.xiaoyu.common.base.req.LoginUserInfo;
import io.jsonwebtoken.ExpiredJwtException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * WJY
 */
@Slf4j
public class HttpServletRequestUtil {


    public static LoginUserInfo getLoginUserInfo(BaseReqBean reqBean, HttpServletRequest request){
        if (Objects.isNull(reqBean)){
            throw new CommonServiceException(ResponseEnum.FAIL.getCode(),"获取登录人员信息的入参为空");
        }
        String token =  request.getHeader(SysConstantsEnum.LOGIN_TOKEN.getValue());
        if (StringUtils.isBlank(token)){
            throw new CommonServiceException(ResponseEnum.PARAM_EMPTY, "验证参数为空");
        }
        LoginUserInfo loginUserInfo;
        try {
            loginUserInfo = JwtUtil.parseToken(token);
        } catch (ExpiredJwtException e) {
            log.error("获取登录人员信息token超时，token：{}，错误信息：{}", token, e);
            throw new CommonServiceException(ResponseEnum.TOKEN_TIMEOUT);
        } catch (Exception e){
            log.error("获取登录人员信息解析token数据异常，token：{}，错误信息：{}", token, e);
            throw new CommonServiceException(ResponseEnum.FAIL, "token解析失败");
        }
        if (loginUserInfo == null || loginUserInfo.getUserId() == null || loginUserInfo.getUserId().longValue() <= 0L) {
            log.info("获取登录人员信息解析token验证结果为未登录，或者登录解析token中登录信息不合法，token：{}，登录数据：{}", token, JSON.toJSONString(loginUserInfo));
            throw new CommonServiceException(ResponseEnum.NOT_LOGIN);
        }
        return loginUserInfo;
    }

    public static Map<String, String> parseParamMap(HttpServletRequest request) {
        String submitMode = request.getHeader(SysConstantsEnum.XTCCBZ.getValue());
        if (SysConstantsEnum.QQFS_GET.getCode().equals(submitMode)){
            return parseUrlReqParam(request);
        }
        if (SysConstantsEnum.QQFS_POST.equals(submitMode)){
            return parseBodyReqParam(request);
        }
        log.info("传参标志不合法，submitMode：{}", submitMode);
        throw new CommonServiceException(ResponseEnum.FAIL.getCode(), "传参标志不合法");
    }

    public static Map<String, String> parseUrlReqParam(HttpServletRequest request) {
        Map<String, String> reqParamMap = new HashMap<>();
        Enumeration<?> enumeration = request.getParameterNames();
        if (null == enumeration) return null;
        while (enumeration.hasMoreElements()) {
            String key = (String) enumeration.nextElement();
            String value = request.getParameter(key);
            // 如果字段的值为空，判断若值为空，则删除这个字段
            if (StringUtils.isNotBlank(value)) reqParamMap.put(key, value);
        }
        return reqParamMap;
    }

    public static Map<String, String> parseBodyReqParam(HttpServletRequest request) {
        BufferedReader reader = null;
        StringBuilder buf = new StringBuilder();
        try {
            reader = request.getReader();
            String str;
            while ((str = reader.readLine()) != null) {
                buf.append(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
            log.error("读取请求中的body入参异常，异常信息：{}", e);
        } finally {
            if (!Objects.isNull(reader)) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return JSON.parseObject(buf.toString(), Map.class);
    }

}
