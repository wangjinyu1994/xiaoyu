package com.xiaoyu.provider.order.service;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.provider.order.req.*;
import com.xiaoyu.provider.order.resp.AddOrderInfoResp;
import com.xiaoyu.provider.order.resp.SelectOrderByIdResp;
import com.xiaoyu.provider.order.resp.SelectOrderTableResp;
import com.xiaoyu.provider.order.resp.UpdateOrderInfoResp;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;

/**
 * WJY
 */
public interface OrderService {
    TableResult<SelectOrderTableResp> selectOrderTable(SelectOrderTableReq req);

    CommonResult<SelectOrderByIdResp> selectOrderById(SelectOrderByIdReq req);

    CommonResult<AddOrderInfoResp> addOrderInfo(AddOrderInfoReq req, HttpServletRequest request) throws ParseException;

    CommonResult<UpdateOrderInfoResp> updateOrderInfo(UpdateOrderInfoReq req, HttpServletRequest request) throws ParseException;

    CommonResult deleteOrderInfo(DeleteOrderInfoReq req, HttpServletRequest request);
}
