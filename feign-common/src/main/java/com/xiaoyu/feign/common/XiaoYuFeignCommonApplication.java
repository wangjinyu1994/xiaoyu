package com.xiaoyu.feign.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * WJY
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class XiaoYuFeignCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoYuFeignCommonApplication.class,args);
    }

}
