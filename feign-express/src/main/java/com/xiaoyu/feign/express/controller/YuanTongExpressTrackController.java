package com.xiaoyu.feign.express.controller;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.feign.express.req.GetExpressMessageReq;
import com.xiaoyu.feign.express.req.GetVerificationCodeByOrderReq;
import com.xiaoyu.feign.express.resp.GetVerificationCodeByOrderResp;
import com.xiaoyu.feign.express.service.YuanTongExpressTrackService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * WJY
 */
@RestController
@RequestMapping("/sys/xiaoyu/express/yuantong")
@Api(tags = "系统圆通快递订单控制器",description = "主要提供圆通快递订单相关接口")
public class YuanTongExpressTrackController {

    @Autowired
    private YuanTongExpressTrackService yuanTongExpressTrackService;

    @PostMapping(value = "/getVerificationCodeByOrder")
    @ApiOperation(value = "根据快递单号获取验证码请求入参", httpMethod = "POST",notes = "根据快递单号获取验证码请求入参")
    public CommonResult<GetVerificationCodeByOrderResp> getVerificationCodeByOrder(@RequestBody GetVerificationCodeByOrderReq req, HttpServletRequest request, HttpServletResponse response){
        return yuanTongExpressTrackService.getVerificationCodeByOrder(req);
    }

    @PostMapping(value = "/getExpressMessage")
    @ApiOperation(value = "根据快递信息请求入参", httpMethod = "POST",notes = "根据快递信息请求入参")
    public CommonResult getExpressMessage(@RequestBody GetExpressMessageReq req, HttpServletRequest request, HttpServletResponse response){
        return yuanTongExpressTrackService.getExpressMessage(req);
    }

}
