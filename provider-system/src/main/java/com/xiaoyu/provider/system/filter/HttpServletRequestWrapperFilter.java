package com.xiaoyu.provider.system.filter;

import com.xiaoyu.common.base.constants.SysConstantsEnum;
import com.xiaoyu.provider.system.interceptor.HttpRequestRepeatReadBodyWrapper;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * WJY
 */
public class HttpServletRequestWrapperFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String method = httpServletRequest.getMethod();
        if (method.toUpperCase().equals(SysConstantsEnum.QQFS_POST.getValue())){
            ServletRequest repeatReadReqWrapper = null;
            if (request instanceof HttpServletRequest) {
                repeatReadReqWrapper = new HttpRequestRepeatReadBodyWrapper((HttpServletRequest) request);
            }
            if (repeatReadReqWrapper == null) {
                filterChain.doFilter(request,response);
            } else {
                filterChain.doFilter(repeatReadReqWrapper,response);
            }
        } else {
            filterChain.doFilter(request,response);
        }
    }

    @Override
    public void destroy() {

    }
}
