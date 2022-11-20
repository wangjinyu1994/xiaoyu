package com.xiaoyu.provider.user.interceptor;

import com.xiaoyu.api.util.UUIDUtil;
import com.xiaoyu.common.base.constants.SysConstantsEnum;
import org.slf4j.MDC;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * WJY
 */
public class ReqLogTraceInterceptor implements HandlerInterceptor {

    /**
     * 在业务处理器处理请求之前被调用
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        MDC.put(SysConstantsEnum.RZBS.getValue(), UUIDUtil.getUUIDShort());
        return true;
    }

    /**
     * 在业务处理器处理请求执行完成后，生成视图之前执行
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
    }

    /**
     * 在DispatcherServlet完全处理完请求后被调用
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        MDC.remove(SysConstantsEnum.RZBS.getValue());
    }
}
