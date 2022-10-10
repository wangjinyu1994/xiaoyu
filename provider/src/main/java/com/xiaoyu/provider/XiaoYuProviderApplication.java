package com.xiaoyu.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * WJY
 */
@SpringBootApplication
@EnableDiscoveryClient
public class XiaoYuProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoYuProviderApplication.class, args);
    }
}
