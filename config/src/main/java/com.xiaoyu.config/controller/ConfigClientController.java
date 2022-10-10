package com.xiaoyu.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * WJY
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.bucketName}")
    private String ConfigInfo;

    @GetMapping("/config/info")
    public String getConfigInfo(){
        return ConfigInfo;
    }

}
