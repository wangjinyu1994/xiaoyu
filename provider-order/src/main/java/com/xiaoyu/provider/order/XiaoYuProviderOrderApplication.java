package com.xiaoyu.provider.order;

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
@Import(value = {MyImportConfig.class})
@MapperScan(basePackages = {"com.xiaoyu.provider.order.dao"})
public class XiaoYuProviderOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoYuProviderOrderApplication.class, args);
    }
}
