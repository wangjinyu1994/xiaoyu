package com.xiaoyu.provider.controller;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.provider.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * WJY
 */
@RestController
@Slf4j
public class StorageController {

    @Resource
    private StorageService storageService;
    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count) {
        int decrease = storageService.decrease(productId, count);
        CommonResult result;
        if (decrease > 0) {
            result = new CommonResult(200 + "", "from mysql,serverPort:  " + serverPort + "；decrease：" + decrease);
        } else {
            result = new CommonResult(505+ "", "from mysql,serverPort:  " + serverPort + "库存扣减失败" );
        }
        return result;
    }


}
