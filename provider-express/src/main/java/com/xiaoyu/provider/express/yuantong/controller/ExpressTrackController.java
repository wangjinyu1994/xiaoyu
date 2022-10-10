package com.xiaoyu.provider.express.yuantong.controller;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.provider.express.yuantong.req.GetExpressMessageReq;
import com.xiaoyu.provider.express.yuantong.req.GetVerificationCodeByOrderReq;
import com.xiaoyu.provider.express.yuantong.resp.GetVerificationCodeByOrderResp;
import com.xiaoyu.provider.express.yuantong.service.ExpressTrackService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * WJY
 */
@RestController
@RequestMapping("/yuantong")
@Api(tags = "圆通快递信息查询控制器",description = "主要提供圆通快递信息查询相关接口")
public class ExpressTrackController {

    @Autowired
    private ExpressTrackService expressTrackService;

    @PostMapping(value = "/getVerificationCodeByOrder")
    @ApiOperation(value = "根据快递单号获取验证码请求入参", httpMethod = "POST",notes = "根据快递单号获取验证码请求入参")
    public CommonResult<GetVerificationCodeByOrderResp> getVerificationCodeByOrder(@RequestBody GetVerificationCodeByOrderReq req, HttpServletRequest request, HttpServletResponse response){
        return expressTrackService.getVerificationCodeByOrder(req);
    }

    @PostMapping(value = "/getExpressMessage")
    @ApiOperation(value = "根据快递信息请求入参", httpMethod = "POST",notes = "根据快递信息请求入参")
    public CommonResult getExpressMessage(@RequestBody GetExpressMessageReq req, HttpServletRequest request, HttpServletResponse response){
        return expressTrackService.getExpressMessage(req);
    }

}
