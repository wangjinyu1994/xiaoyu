package com.xiaoyu.feign.express.config;

import com.xiaoyu.common.base.constants.SysConstantsEnum;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * WJY
 */
@Component
public class MyRequestInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate template) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest servletRequest = attributes.getRequest();
        Enumeration<String> headerNames = servletRequest.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = headerNames.nextElement();
            if (key.equals(SysConstantsEnum.FEIGN_QC.getValue())){
                continue;
            }
            String value = servletRequest.getHeader(key);
            // 如果字段的值为空，判断若值为空，则删除这个字段
            if (StringUtils.isNotBlank(value)){
                template.header(key,value);
            }
        }
    }
}
