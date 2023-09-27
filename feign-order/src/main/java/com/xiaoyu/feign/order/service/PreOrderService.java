package com.xiaoyu.feign.order.service;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.feign.order.req.*;
import com.xiaoyu.feign.order.resp.AddPreOrderInfoResp;
import com.xiaoyu.feign.order.resp.SelectPreOrderByIdResp;
import com.xiaoyu.feign.order.resp.SelectPreOrderTableResp;
import com.xiaoyu.feign.order.resp.UpdatePreOrderInfoResp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;


import javax.servlet.http.HttpServletRequest;

/**
 * WJY
 */
@FeignClient(value = "xiaoyu-provider-order")
public interface PreOrderService {

    @PostMapping(value = "/sys/xiaoyu/order/preOrder/selectPreOrderTable")
    TableResult<SelectPreOrderTableResp> selectPreOrderTable(SelectPreOrderTableReq req);

    @PostMapping(value = "/sys/xiaoyu/order/preOrder/selectPreOrderById")
    CommonResult<SelectPreOrderByIdResp> selectPreOrderById(SelectPreOrderByIdReq req);

    @PostMapping(value = "/sys/xiaoyu/order/preOrder/addPreOrderInfo")
    CommonResult<AddPreOrderInfoResp> addPreOrderInfo(AddPreOrderInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/order/preOrder/updatePreOrderInfo")
    CommonResult<UpdatePreOrderInfoResp> updatePreOrderInfo(UpdatePreOrderInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/order/preOrder/deletePreOrderInfo")
    CommonResult deletePreOrderInfo(DeletePreOrderInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/order/preOrder/examProOrderInfo")
    CommonResult examProOrderInfo(ExamProOrderInfoReq req, HttpServletRequest request);
}
