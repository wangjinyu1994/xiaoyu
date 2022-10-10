package com.xiaoyu.sentinel.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * WJY
 */
@RestController
@Slf4j
public class SentinelFlowLimitController {

    @Value("${server.port}")
    private String serverPort;


    @GetMapping("/testA")
    public String testA() {
        return "c语言中文网提醒您，服务访问成功------testA";
    }
    @GetMapping("/testB")
    public String testB() {
        return "c语言中文网提醒您，服务访问成功------testB";
    }

}
