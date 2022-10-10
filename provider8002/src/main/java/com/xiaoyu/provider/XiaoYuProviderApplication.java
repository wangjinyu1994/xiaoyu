package com.xiaoyu.provider;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * WJY
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableAutoDataSourceProxy
public class XiaoYuProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoYuProviderApplication.class, args);
    }
}
