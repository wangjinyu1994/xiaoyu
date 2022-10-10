package com.xiaoyu.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * WJY
 */
@SpringBootApplication
@EnableDiscoveryClient
public class XiaoYuConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoYuConfigApplication.class,args);
    }

}
