package com.xiaoyu.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * WJY
 */
@SpringBootApplication
@EnableDiscoveryClient
public class XiaoYuRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoYuRibbonApplication.class,args);
    }

}
