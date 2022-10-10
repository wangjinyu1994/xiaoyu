package com.xiaoyu.oss;

import com.xiaoyu.common.base.config.MyImportConfig;
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
public class XiaoYuOssApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoYuOssApplication.class,args);
    }

}
