package com.xiaoyu.provider.common;

import com.xiaoyu.common.base.config.MyImportConfig;
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
@MapperScan(basePackages = {"com.xiaoyu.provider.common.dao"})
public class XiaoYuProviderCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoYuProviderCommonApplication.class, args);
    }
}
