package com.xiaoyu.provider.util;

import com.alibaba.fastjson.JSON;
import com.xiaoyu.common.base.constants.ResponseEnum;
import com.xiaoyu.common.base.constants.SysConstantsEnum;
import com.xiaoyu.common.base.exception.CommonServiceException;
import com.xiaoyu.common.base.req.BaseReqBean;
import com.xiaoyu.common.base.req.LoginUserInfo;
import com.xiaoyu.common.base.util.JwtUtil;
import io.jsonwebtoken.ExpiredJwtException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
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

}
