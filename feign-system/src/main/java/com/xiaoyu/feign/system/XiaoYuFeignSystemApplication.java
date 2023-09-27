package com.xiaoyu.feign.system;

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
public class XiaoYuFeignSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoYuFeignSystemApplication.class,args);
    }
}
