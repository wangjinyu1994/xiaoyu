package com.xiaoyu.provider.user.service.impl;

import com.xiaoyu.common.base.req.LoginUserInfo;
import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.common.base.util.HttpServletRequestUtil;
import com.xiaoyu.provider.user.dao.XtjgxxbMapper;
import com.xiaoyu.provider.user.dao.ex.XtjgxxbMapperEx;
import com.xiaoyu.provider.user.entity.Xtjgxxb;
import com.xiaoyu.provider.user.req.*;
import com.xiaoyu.provider.user.resp.*;
import com.xiaoyu.provider.user.service.SysOrgService;
import com.xiaoyu.provider.user.util.ReqParamToEntityUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * WJY
 */
@Service
@Slf4j
public class SysOrgServiceImpl implements SysOrgService {

    @Autowired
    private XtjgxxbMapper xtjgxxbMapper;
    @Autowired
    private XtjgxxbMapperEx xtjgxxbMapperEx;

    @Override
    public TableResult<SelectOrgTableResp> selectOrgTable(SelectOrgTableReq req) {
        List<SelectOrgTableResp> rows = xtjgxxbMapperEx.selectOrgTable(req);
        Integer total = xtjgxxbMapperEx.countSelectOrgTable(req);
        return TableResult.success(rows,total);
    }

    @Override
    public CommonResult<List<SelectAllOrgResp>> selectAllOrgList(SelectAllOrgReq req) {
        List<SelectAllOrgResp> resps = xtjgxxbMapperEx.selectAllOrgList(req);
        return CommonResult.success(resps);
    }

    @Override
    public CommonResult<SelectOrgByIdResp> selectOrgById(SelectOrgByIdReq req) {
        SelectOrgByIdResp resp = xtjgxxbMapperEx.selectOrgById(req);
        return CommonResult.success(resp);
    }

    @Override
    public CommonResult<AddOrgInfoResp> addOrgInfo(AddOrgInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtjgxxb xtjgxxb = ReqParamToEntityUtils.addOrgInfo(req,loginUserInfo.getUserId());
        xtjgxxbMapperEx.insertXtjgxxb(xtjgxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<UpdateOrgInfoResp> updateOrgInfo(UpdateOrgInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtjgxxb xtjgxxb = ReqParamToEntityUtils.updateOrgInfo(req,loginUserInfo.getUserId());
        xtjgxxbMapper.updateByPrimaryKeySelective(xtjgxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<DeleteOrgInfoResp> deleteOrgInfo(DeleteOrgInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtjgxxb xtjgxxb = ReqParamToEntityUtils.deleteOrgInfo(req,loginUserInfo.getUserId());
        xtjgxxbMapper.updateByPrimaryKeySelective(xtjgxxb);
        return CommonResult.success();
    }
}
