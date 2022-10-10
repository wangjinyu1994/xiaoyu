package com.xiaoyu.provider.express;

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
public class XiaoYuProviderExpressApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoYuProviderExpressApplication.class,args);
    }

}
