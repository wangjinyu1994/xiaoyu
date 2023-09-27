package com.xiaoyu.feign.order.service;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.feign.order.req.*;
import com.xiaoyu.feign.order.resp.AddOrderInfoResp;
import com.xiaoyu.feign.order.resp.SelectOrderByIdResp;
import com.xiaoyu.feign.order.resp.SelectOrderTableResp;
import com.xiaoyu.feign.order.resp.UpdateOrderInfoResp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;


import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;

/**
 * WJY
 */
@FeignClient(value = "xiaoyu-provider-order")
public interface OrderService {

    @PostMapping(value = "/sys/xiaoyu/order/selectOrderTable")
    TableResult<SelectOrderTableResp> selectOrderTable(SelectOrderTableReq req);

    @PostMapping(value = "/sys/xiaoyu/order/selectOrderById")
    CommonResult<SelectOrderByIdResp> selectOrderById(SelectOrderByIdReq req);

    @PostMapping(value = "/sys/xiaoyu/order/addOrderInfo")
    CommonResult<AddOrderInfoResp> addOrderInfo(AddOrderInfoReq req, HttpServletRequest request) throws ParseException;

    @PostMapping(value = "/sys/xiaoyu/order/updateOrderInfo")
    CommonResult<UpdateOrderInfoResp> updateOrderInfo(UpdateOrderInfoReq req, HttpServletRequest request) throws ParseException;

    @PostMapping(value = "/sys/xiaoyu/order/deleteOrderInfo")
    CommonResult deleteOrderInfo(DeleteOrderInfoReq req, HttpServletRequest request);
}
