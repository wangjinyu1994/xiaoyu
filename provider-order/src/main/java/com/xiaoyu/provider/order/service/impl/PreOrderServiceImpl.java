package com.xiaoyu.provider.order.service.impl;

import com.xiaoyu.common.base.constants.ResponseEnum;
import com.xiaoyu.common.base.constants.TgxmShztEnum;
import com.xiaoyu.common.base.req.LoginUserInfo;
import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.common.base.util.HttpServletRequestUtil;
import com.xiaoyu.provider.order.dao.XttgxmddyspxxbMapper;
import com.xiaoyu.provider.order.dao.ex.XttgxmddxxbMapperEx;
import com.xiaoyu.provider.order.dao.ex.XttgxmddyspxxbMapperEx;
import com.xiaoyu.provider.order.entity.Xttgxmddxxb;
import com.xiaoyu.provider.order.entity.Xttgxmddyspxxb;
import com.xiaoyu.provider.order.req.*;
import com.xiaoyu.provider.order.resp.AddPreOrderInfoResp;
import com.xiaoyu.provider.order.resp.SelectPreOrderByIdResp;
import com.xiaoyu.provider.order.resp.SelectPreOrderTableResp;
import com.xiaoyu.provider.order.resp.UpdatePreOrderInfoResp;
import com.xiaoyu.provider.order.service.PreOrderService;
import com.xiaoyu.provider.order.util.ReqParamToEntityUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * WJY
 */
@Service
@Slf4j
public class PreOrderServiceImpl implements PreOrderService {

    @Autowired
    private XttgxmddyspxxbMapper xttgxmddyspxxbMapper;
    @Autowired
    private XttgxmddyspxxbMapperEx xttgxmddyspxxbMapperEx;
    @Autowired
    private XttgxmddxxbMapperEx xttgxmddxxbMapperEx;

    @Override
    public TableResult<SelectPreOrderTableResp> selectPreOrderTable(SelectPreOrderTableReq req) {
        List<SelectPreOrderTableResp> rows = xttgxmddyspxxbMapperEx.selectPreOrderTable(req);
        Integer total = xttgxmddyspxxbMapperEx.countSelectPreOrderTable(req);
        return TableResult.success(rows,total);
    }

    @Override
    public CommonResult<SelectPreOrderByIdResp> selectPreOrderById(SelectPreOrderByIdReq req) {
        SelectPreOrderByIdResp resp = xttgxmddyspxxbMapperEx.selectPreOrderById(req);
        return CommonResult.success(resp);
    }

    @Override
    public CommonResult<AddPreOrderInfoResp> addPreOrderInfo(AddPreOrderInfoReq req, HttpServletRequest request) {
        // 根据流水号查找是否有添加过
        List<Xttgxmddyspxxb> xttgxmddyspxxbs = xttgxmddyspxxbMapperEx.selectXttgxmddyspxxbByLsh(req.getSerialNumber());
        boolean yzlsh = ReqParamToEntityUtils.addPreOrderInfoLshjy(xttgxmddyspxxbs);
        if (! yzlsh){
            return CommonResult.build(ResponseEnum.FAIL.getCode(),"当前流水号已注册不可重复添加！");
        }
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xttgxmddyspxxb xttgxmddyspxxb = ReqParamToEntityUtils.addPreOrderInfo(req,loginUserInfo.getUserId());
        xttgxmddyspxxbMapperEx.insertXttgxmddyspxxb(xttgxmddyspxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<UpdatePreOrderInfoResp> updatePreOrderInfo(UpdatePreOrderInfoReq req, HttpServletRequest request) {
        // 根据主键查找当前状态
        Xttgxmddyspxxb info = xttgxmddyspxxbMapper.selectByPrimaryKey(req.getZj());
        if (Objects.isNull(info)){
            return CommonResult.build(ResponseEnum.FAIL.getCode(),"当前信息查无记录！");
        }
        if (! TgxmShztEnum.TGXM_SHZ.getCode().equals(info.getShzt())){
            return CommonResult.build(ResponseEnum.FAIL.getCode(),"当前订单已审核，无法修改！");
        }
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xttgxmddyspxxb xttgxmddyspxxb = ReqParamToEntityUtils.updatePreOrderInfo(req,loginUserInfo.getUserId());
        xttgxmddyspxxbMapper.updateByPrimaryKeySelective(xttgxmddyspxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult deletePreOrderInfo(DeletePreOrderInfoReq req, HttpServletRequest request) {
        // 根据主键查找当前状态
        Xttgxmddyspxxb info = xttgxmddyspxxbMapper.selectByPrimaryKey(req.getZj());
        if (Objects.isNull(info)){
            return CommonResult.build(ResponseEnum.FAIL.getCode(),"当前信息查无记录！");
        }
        if (! TgxmShztEnum.TGXM_SHZ.getCode().equals(info.getShzt())){
            return CommonResult.build(ResponseEnum.FAIL.getCode(),"当前订单已审核，无法删除！");
        }
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xttgxmddyspxxb xttgxmddyspxxb = ReqParamToEntityUtils.deletePreOrderInfo(req,loginUserInfo.getUserId());
        xttgxmddyspxxbMapper.updateByPrimaryKeySelective(xttgxmddyspxxb);
        return CommonResult.success();
    }

    @Transactional
    @Override
    public CommonResult examProOrderInfo(ExamProOrderInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Date now = new Date();
        if (TgxmShztEnum.TGXM_TG.getCode().equals(req.getExamStatus())){
            Xttgxmddyspxxb xttgxmddyspxxb = xttgxmddyspxxbMapper.selectByPrimaryKey(req.getZj());
            Xttgxmddxxb xttgxmddxxb = ReqParamToEntityUtils.initXttgxmddxxbEamxPass(xttgxmddyspxxb,loginUserInfo.getUserId());
            xttgxmddxxbMapperEx.insertXttgxmddxxb(xttgxmddxxb);
        }
        Xttgxmddyspxxb xttgxmddyspxxb = ReqParamToEntityUtils.examProOrderInfo(req,loginUserInfo.getUserId(),now);
        xttgxmddyspxxbMapper.updateByPrimaryKeySelective(xttgxmddyspxxb);
        return CommonResult.success();
    }
}
