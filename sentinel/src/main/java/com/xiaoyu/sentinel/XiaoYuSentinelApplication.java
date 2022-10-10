package com.xiaoyu.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * WJY
 */
@SpringBootApplication
@EnableDiscoveryClient
public class XiaoYuSentinelApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoYuSentinelApplication.class,args);
    }

}
