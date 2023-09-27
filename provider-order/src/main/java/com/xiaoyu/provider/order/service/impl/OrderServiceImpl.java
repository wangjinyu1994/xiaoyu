package com.xiaoyu.provider.order.service.impl;

import com.xiaoyu.common.base.req.LoginUserInfo;
import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.common.base.util.HttpServletRequestUtil;
import com.xiaoyu.provider.order.dao.XttgxmddxxbMapper;
import com.xiaoyu.provider.order.dao.ex.XttgxmddxxbMapperEx;
import com.xiaoyu.provider.order.entity.Xttgxmddxxb;
import com.xiaoyu.provider.order.entity.Xttgxmddyspxxb;
import com.xiaoyu.provider.order.req.*;
import com.xiaoyu.provider.order.resp.AddOrderInfoResp;
import com.xiaoyu.provider.order.resp.SelectOrderByIdResp;
import com.xiaoyu.provider.order.resp.SelectOrderTableResp;
import com.xiaoyu.provider.order.resp.UpdateOrderInfoResp;
import com.xiaoyu.provider.order.service.OrderService;
import com.xiaoyu.provider.order.util.ReqParamToEntityUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.List;

/**
 * WJY
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    private XttgxmddxxbMapper xttgxmddxxbMapper;
    @Autowired
    private XttgxmddxxbMapperEx xttgxmddxxbMapperEx;

    @Override
    public TableResult<SelectOrderTableResp> selectOrderTable(SelectOrderTableReq req) {
        List<SelectOrderTableResp> rows = xttgxmddxxbMapperEx.selectOrderTable(req);
        Integer total = xttgxmddxxbMapperEx.countSelectOrderTable(req);
        return TableResult.success(rows,total);
    }

    @Override
    public CommonResult<SelectOrderByIdResp> selectOrderById(SelectOrderByIdReq req) {
        SelectOrderByIdResp resp = xttgxmddxxbMapperEx.selectOrderById(req);
        return CommonResult.success(resp);
    }

    @Override
    public CommonResult<AddOrderInfoResp> addOrderInfo(AddOrderInfoReq req, HttpServletRequest request) throws ParseException {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xttgxmddxxb xttgxmddxxb = ReqParamToEntityUtils.addOrderInfo(req,loginUserInfo.getUserId());
        xttgxmddxxbMapperEx.insertXttgxmddxxb(xttgxmddxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<UpdateOrderInfoResp> updateOrderInfo(UpdateOrderInfoReq req, HttpServletRequest request) throws ParseException {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xttgxmddxxb xttgxmddxxb = ReqParamToEntityUtils.updateOrderInfo(req,loginUserInfo.getUserId());
        xttgxmddxxbMapper.updateByPrimaryKeySelective(xttgxmddxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult deleteOrderInfo(DeleteOrderInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xttgxmddxxb xttgxmddxxb = ReqParamToEntityUtils.deleteOrderInfo(req,loginUserInfo.getUserId());
        xttgxmddxxbMapper.updateByPrimaryKeySelective(xttgxmddxxb);
        return CommonResult.success();
    }
}
