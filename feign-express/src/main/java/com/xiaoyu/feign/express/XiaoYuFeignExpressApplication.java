package com.xiaoyu.feign.express;

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
public class XiaoYuFeignExpressApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoYuFeignExpressApplication.class,args);
    }
}
