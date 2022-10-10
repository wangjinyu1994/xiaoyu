package com.xiaoyu.provider.service;

import com.xiaoyu.common.base.resp.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * WJY
 */
@FeignClient(value = "spring-cloud-alibaba-seata-storage-8006")
public interface StorageService {

    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
