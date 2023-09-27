package com.xiaoyu.feign.order.controller;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.feign.order.req.*;
import com.xiaoyu.feign.order.resp.AddPreOrderInfoResp;
import com.xiaoyu.feign.order.resp.SelectPreOrderByIdResp;
import com.xiaoyu.feign.order.resp.SelectPreOrderTableResp;
import com.xiaoyu.feign.order.resp.UpdatePreOrderInfoResp;
import com.xiaoyu.feign.order.service.PreOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * WJY
 */
@RestController
@RequestMapping("/sys/xiaoyu/order/preOrder")
@Api(tags = "系统预处理订单控制器",description = "主要提供预处理订单相关接口")
public class PreOrderController {
    
    @Autowired
    private PreOrderService preOrderService;

    @PostMapping(value = "/selectPreOrderTable")
    @ApiOperation(value = "分页查询预处理订单请求接口", httpMethod = "POST",notes = "分页查询预处理订单请求接口")
    public TableResult<SelectPreOrderTableResp> selectPreOrderTable(@RequestBody @Valid SelectPreOrderTableReq req, HttpServletRequest request, HttpServletResponse response){
        return preOrderService.selectPreOrderTable(req);
    }

    @PostMapping(value = "/selectPreOrderById")
    @ApiOperation(value = "根据主键查询预处理订单请求接口", httpMethod = "POST",notes = "根据主键查询预处理订单请求接口")
    public CommonResult<SelectPreOrderByIdResp> selectPreOrderById(@RequestBody @Valid SelectPreOrderByIdReq req, HttpServletRequest request, HttpServletResponse response){
        return preOrderService.selectPreOrderById(req);
    }

    @PostMapping(value = "/addPreOrderInfo")
    @ApiOperation(value = "添加预处理订单详情请求接口", httpMethod = "POST",notes = "添加预处理订单详情请求接口")
    public CommonResult<AddPreOrderInfoResp> addPreOrderInfo(@RequestBody @Valid AddPreOrderInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return preOrderService.addPreOrderInfo(req,request);
    }

    @PostMapping(value = "/updatePreOrderInfo")
    @ApiOperation(value = "修改预处理订单详情请求接口", httpMethod = "POST",notes = "修改预处理订单详情请求接口")
    public CommonResult<UpdatePreOrderInfoResp> updatePreOrderInfo(@RequestBody @Valid UpdatePreOrderInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return preOrderService.updatePreOrderInfo(req,request);
    }

    @PostMapping(value = "/deletePreOrderInfo")
    @ApiOperation(value = "删除预处理订单详情请求接口", httpMethod = "POST",notes = "删除预处理订单详情请求接口")
    public CommonResult deletePreOrderInfo(@RequestBody @Valid DeletePreOrderInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return preOrderService.deletePreOrderInfo(req,request);
    }

    @PostMapping(value = "/examProOrderInfo")
    @ApiOperation(value = "审核预处理订单详情请求接口", httpMethod = "POST",notes = "审核预处理订单详情请求接口")
    public CommonResult examProOrderInfo(@RequestBody @Valid ExamProOrderInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return preOrderService.examProOrderInfo(req,request);
    }
    
}
