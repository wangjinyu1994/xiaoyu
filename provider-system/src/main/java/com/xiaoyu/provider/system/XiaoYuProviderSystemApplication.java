package com.xiaoyu.provider.system;

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
@MapperScan(basePackages = {"com.xiaoyu.provider.system.dao"})
@Import(value = {MyImportConfig.class})
public class XiaoYuProviderSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoYuProviderSystemApplication.class, args);
    }
}
