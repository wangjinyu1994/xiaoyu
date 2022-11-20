package com.xiaoyu.provider.user.interceptor;

import com.alibaba.fastjson.JSON;
import com.xiaoyu.common.base.constants.ResponseEnum;
import com.xiaoyu.common.base.constants.SysConstantsEnum;
import com.xiaoyu.common.base.constants.SysDisableIpSigEnum;
import com.xiaoyu.common.base.exception.CommonServiceException;
import com.xiaoyu.common.base.req.LoginUserInfo;
import com.xiaoyu.common.base.util.JwtUtil;
import com.xiaoyu.common.base.util.RedisUtils;
import io.jsonwebtoken.ExpiredJwtException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * WJY
 * 登录拦截器
 */
@Slf4j
public class ReqLoginInterceptor implements HandlerInterceptor {

    @Autowired
    private RedisUtils redisUtils;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURI();
        if (redisUtils.hasKey(SysDisableIpSigEnum.XIAOYU_DLJK.getCode() + url)){
            return true;
        }
        String token = request.getHeader(SysConstantsEnum.LOGIN_TOKEN.getValue());
        LoginUserInfo loginUserInfo;
        try {
            loginUserInfo = JwtUtil.parseToken(token);
        } catch (ExpiredJwtException e){
            log.error("登录超时，token：{}，错误信息：{}", token, e);
            throw new CommonServiceException(ResponseEnum.TOKEN_TIMEOUT);
        } catch (Exception e) {
            e.printStackTrace();
            log.info("token不合法不能放行");
            throw new CommonServiceException(ResponseEnum.AUTH_CODE_INVALID);
        }
        if (ObjectUtils.isEmpty(loginUserInfo)){
            log.info("未登录，或者登录解析token中登录信息不合法，token：{}，登录数据：{}", token, JSON.toJSONString(loginUserInfo));
            throw new CommonServiceException(ResponseEnum.NOT_LOGIN);
        }
        response.setHeader(SysConstantsEnum.LOGIN_TOKEN.getValue(),JwtUtil.createToken(loginUserInfo));
        // 获取参数，判断参数中的tonken和从header中取到的token是否一致如果不一致不能放行
        Map<String, String> reqParamMap = HttpServletRequestUtil.parseParamMap(request);
        if (! reqParamMap.containsKey(SysConstantsEnum.XTRCTOKEN.getValue())){
            log.info("入参中不存在xiaoyutoken，入参：{}", JSON.toJSONString(reqParamMap));
            throw new CommonServiceException(ResponseEnum.PARAM_EMPTY);
        }
        if (! reqParamMap.get(SysConstantsEnum.XTRCTOKEN.getValue()).equals(token)){
            log.info("入参中的xiaoyutoken与header中的token不一致，入参：{}，入参token：{}", JSON.toJSONString(reqParamMap), token);
            throw new CommonServiceException(ResponseEnum.PARAM_INVALID);
        }
        return true;
    }
}
