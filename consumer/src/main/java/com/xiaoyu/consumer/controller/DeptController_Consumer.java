package com.xiaoyu.consumer.controller;

import com.xiaoyu.common.base.resp.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * WJY
 */
@RestController
@Slf4j
public class DeptController_Consumer {

    @Resource
    private RestTemplate restTemplate;
    @Value("${service-url.nacos-user-service}")
    private String serverURL; //服务提供者的服务名


    @GetMapping("/consumer/dept/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Long id) {
        return restTemplate.getForObject(serverURL + "/dept/nacos/" + id, String.class);
    }

    @GetMapping("/test")
    public CommonResult test(){
        return restTemplate.getForObject(serverURL + "/test" , CommonResult.class);
    }

}
