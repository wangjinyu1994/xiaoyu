package com.xiaoyu.common.base.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * WJY
 */
@Component
public class ApplicationContextUtil implements ApplicationContextAware , InitializingBean {

    private static ApplicationContext applicationContext;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("========================");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ApplicationContextUtil.applicationContext = applicationContext;
    }

    /**
     * 获取applicationContext
     */
    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }

    /**
     * 通过name获取bean
     */
    public static Object getBean(String name){
        return getApplicationContext().getBean(name);
    }

    /**
     * 通过class获取bean
     */
    public static <T> T getBean(Class<T> clazz){
        return getApplicationContext().getBean(clazz);
    }

    /**
     *  通过name和class获取指定的bean
     * @param name
     * @param clazz
     * @param <T>
     */
    public static <T> T getBean(String name,Class<T> clazz){
        return getApplicationContext().getBean(name,clazz);
    }

}
