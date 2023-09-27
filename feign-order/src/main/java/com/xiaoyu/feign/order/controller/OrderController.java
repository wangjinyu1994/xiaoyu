package com.xiaoyu.feign.order.controller;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.feign.order.req.*;
import com.xiaoyu.feign.order.resp.AddOrderInfoResp;
import com.xiaoyu.feign.order.resp.SelectOrderByIdResp;
import com.xiaoyu.feign.order.resp.SelectOrderTableResp;
import com.xiaoyu.feign.order.resp.UpdateOrderInfoResp;
import com.xiaoyu.feign.order.service.OrderService;
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
import java.text.ParseException;

/**
 * WJY
 */
@RestController
@RequestMapping("/sys/xiaoyu/order")
@Api(tags = "系统团订单控制器",description = "主要提供订单相关接口")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @PostMapping(value = "/selectOrderTable")
    @ApiOperation(value = "分页查询订单请求接口", httpMethod = "POST",notes = "分页查询订单请求接口")
    public TableResult<SelectOrderTableResp> selectOrderTable(@RequestBody @Valid SelectOrderTableReq req, HttpServletRequest request, HttpServletResponse response){
        return orderService.selectOrderTable(req);
    }

    @PostMapping(value = "/selectOrderById")
    @ApiOperation(value = "根据主键查询订单请求接口", httpMethod = "POST",notes = "根据主键查询订单请求接口")
    public CommonResult<SelectOrderByIdResp> selectOrderById(@RequestBody @Valid SelectOrderByIdReq req, HttpServletRequest request, HttpServletResponse response){
        return orderService.selectOrderById(req);
    }

    @PostMapping(value = "/addOrderInfo")
    @ApiOperation(value = "添加订单详情请求接口", httpMethod = "POST",notes = "添加订单详情请求接口")
    public CommonResult<AddOrderInfoResp> addOrderInfo(@RequestBody @Valid AddOrderInfoReq req, HttpServletRequest request, HttpServletResponse response) throws ParseException {
        return orderService.addOrderInfo(req,request);
    }

    @PostMapping(value = "/updateOrderInfo")
    @ApiOperation(value = "修改订单详情请求接口", httpMethod = "POST",notes = "修改订单详情请求接口")
    public CommonResult<UpdateOrderInfoResp> updateOrderInfo(@RequestBody @Valid UpdateOrderInfoReq req, HttpServletRequest request, HttpServletResponse response) throws ParseException {
        return orderService.updateOrderInfo(req,request);
    }

    @PostMapping(value = "/deleteOrderInfo")
    @ApiOperation(value = "删除订单详情请求接口", httpMethod = "POST",notes = "删除订单详情请求接口")
    public CommonResult deleteOrderInfo(@RequestBody @Valid DeleteOrderInfoReq req, HttpServletRequest request, HttpServletResponse response) {
        return orderService.deleteOrderInfo(req, request);
    }

}
