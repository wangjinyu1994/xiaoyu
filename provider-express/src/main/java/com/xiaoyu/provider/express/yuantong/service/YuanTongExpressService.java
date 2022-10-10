package com.xiaoyu.provider.express.yuantong.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * WJY
 */
@FeignClient(url = "https://www.yto.net.cn/api/trace",name = "yuanTongExpress")
public interface YuanTongExpressService {

    @PostMapping(value = "/captchaVcode")
    String captchaVcode();

    @PostMapping(value = "/waybill")
    String waybill(@RequestHeader MultiValueMap<String,String> headers, @RequestParam("waybillNo") String code);
}
