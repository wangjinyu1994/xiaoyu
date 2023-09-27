package com.xiaoyu.feign.express.service;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.feign.express.req.GetExpressMessageReq;
import com.xiaoyu.feign.express.req.GetVerificationCodeByOrderReq;
import com.xiaoyu.feign.express.resp.GetVerificationCodeByOrderResp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;


/**
 * WJY
 */
@FeignClient(value = "xiaoyu-provider-express")
public interface YuanTongExpressTrackService {

    @PostMapping(value = "/sys/xiaoyu/express/yuantong/getVerificationCodeByOrder")
    CommonResult<GetVerificationCodeByOrderResp> getVerificationCodeByOrder(GetVerificationCodeByOrderReq req);

    @PostMapping(value = "/sys/xiaoyu/express/yuantong/getExpressMessage")
    CommonResult getExpressMessage(GetExpressMessageReq req);

}
