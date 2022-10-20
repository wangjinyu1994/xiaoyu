package com.xiaoyu.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * WJY
 */
@SpringBootApplication
@EnableDiscoveryClient
/*@ComponentScan(basePackages = {"com.xiaoyu.provider.service.impl"})*/
@MapperScan(basePackages = {"com.xiaoyu.provider.dao"})
public class XiaoYuProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoYuProviderApplication.class, args);
    }
}
