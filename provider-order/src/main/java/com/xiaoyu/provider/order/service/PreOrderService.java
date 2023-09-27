package com.xiaoyu.provider.order.service;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.provider.order.req.*;
import com.xiaoyu.provider.order.resp.AddPreOrderInfoResp;
import com.xiaoyu.provider.order.resp.SelectPreOrderByIdResp;
import com.xiaoyu.provider.order.resp.SelectPreOrderTableResp;
import com.xiaoyu.provider.order.resp.UpdatePreOrderInfoResp;

import javax.servlet.http.HttpServletRequest;

/**
 * WJY
 */
public interface PreOrderService {
    TableResult<SelectPreOrderTableResp> selectPreOrderTable(SelectPreOrderTableReq req);

    CommonResult<SelectPreOrderByIdResp> selectPreOrderById(SelectPreOrderByIdReq req);

    CommonResult<AddPreOrderInfoResp> addPreOrderInfo(AddPreOrderInfoReq req, HttpServletRequest request);

    CommonResult<UpdatePreOrderInfoResp> updatePreOrderInfo(UpdatePreOrderInfoReq req, HttpServletRequest request);

    CommonResult deletePreOrderInfo(DeletePreOrderInfoReq req, HttpServletRequest request);

    CommonResult examProOrderInfo(ExamProOrderInfoReq req, HttpServletRequest request);
}
