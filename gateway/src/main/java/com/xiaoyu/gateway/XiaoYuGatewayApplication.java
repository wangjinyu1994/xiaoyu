package com.xiaoyu.gateway;

import com.xiaoyu.common.base.config.RedisConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

/**
 * WJY
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.xiaoyu.gateway.dao"})
@Import(value = {RedisConfig.class})
public class XiaoYuGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoYuGatewayApplication.class,args);
    }

}
