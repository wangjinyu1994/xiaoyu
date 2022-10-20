package com.xiaoyu.provider.controller;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.provider.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * WJY
 */
@RestController
@Slf4j
public class DeptController {

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private TestService testService;

    @GetMapping(value = "/dept/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return "<h2>c语言中文网提醒您，服务访问成功！</h2>服务名：spring-cloud-alibaba-provider<br /> 端口号： " + serverPort + "<br /> 传入的参数：" + id;
    }

    @GetMapping(value = "/test")
    public CommonResult test(){
        return testService.testInsert();
    }
}
