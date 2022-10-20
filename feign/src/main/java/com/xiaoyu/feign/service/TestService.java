package com.xiaoyu.feign.service;

import com.xiaoyu.common.base.resp.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * WJY
 */
// 服务提供者提供的服务名称，即 application.name
@FeignClient(value = "xiaoyu-consumer")
public interface TestService {

    @GetMapping(value = "/test")
    CommonResult test();
}
