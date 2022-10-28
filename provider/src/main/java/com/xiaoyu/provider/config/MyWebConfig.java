package com.xiaoyu.provider.config;

import com.xiaoyu.provider.filter.HttpServletRequestWrapperFilter;
import com.xiaoyu.provider.interceptor.ReqLogTraceInterceptor;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * WJY
 */
@Configuration
public class MyWebConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(logInterceptor()).excludePathPatterns("/swagger-resources/**", "/webjars/**", "/v2/**", "/swagger-ui.html/**", "/js/**", "/css/**", "/image/**", "/bootstrap-3.3.7/**", "/bootstrap-table/**", "/datetimepicker/**", "/datetimepicker/**", "/layer/**,", "/null/api-docs", "/api-docs", "/null/swagger-resources/configuration/ui", "/swagger-resources/configuration/ui", "/null/swagger-resources/configuration/security", "/swagger-resources/configuration/security", "/null/swagger-resources", "/swagger-resources");
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

    @Bean
    public ReqLogTraceInterceptor logInterceptor(){
        return new ReqLogTraceInterceptor();
    }

    @Bean
    public FilterRegistrationBean filterConfig(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new HttpServletRequestWrapperFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }

}
