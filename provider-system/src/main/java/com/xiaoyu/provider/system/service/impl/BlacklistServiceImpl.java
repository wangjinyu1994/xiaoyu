package com.xiaoyu.provider.system.service.impl;


import com.xiaoyu.common.base.req.LoginUserInfo;
import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.common.base.util.HttpServletRequestUtil;
import com.xiaoyu.provider.system.dao.XthbmdxxbMapper;
import com.xiaoyu.provider.system.dao.ex.XthbmdxxbMapperEx;
import com.xiaoyu.provider.system.entity.Xthbmdxxb;
import com.xiaoyu.provider.system.req.*;
import com.xiaoyu.provider.system.resp.*;
import com.xiaoyu.provider.system.service.BlacklistService;
import com.xiaoyu.provider.system.utils.SysReqParamToEntityUtils;
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
public class BlacklistServiceImpl implements BlacklistService {

    @Autowired
    private XthbmdxxbMapper xthbmdxxbMapper;
    @Autowired
    private XthbmdxxbMapperEx xthbmdxxbMapperEx;


    /**
     * 获取所有黑名单请求接口
     */
    @Override
    public CommonResult<List<SelectBlacklistListResp>> selectDictionaryType(SelectBlacklistListReq req) {
        List<SelectBlacklistListResp> resps = xthbmdxxbMapperEx.selectDictionaryType(req);
        return CommonResult.success(resps);
    }

    /**
     * 获取所有黑名单请求接口分页
     */
    @Override
    public TableResult<SelectBlacklistTableResp> selectBlacklistTable(SelectBlacklistTableReq req) {
        List<SelectBlacklistTableResp> rows = xthbmdxxbMapperEx.selectBlacklistTable(req);
        Integer count = xthbmdxxbMapperEx.countSelectBlacklistTable(req);
        return TableResult.success(rows,count);
    }

    /**
     * 根据主键修改黑名单请求接口
     */
    @Override
    public CommonResult<UpdateBlackByIdResp> updateBlackById(UpdateBlackByIdReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xthbmdxxb xthbmdxxb = SysReqParamToEntityUtils.updateBlackById(req,loginUserInfo.getUserId());
        xthbmdxxbMapper.updateByPrimaryKeySelective(xthbmdxxb);
        return CommonResult.success();
    }

    /**
     * 根据主键删除黑名单请求接口
     */
    @Override
    public CommonResult<DeleteBlackByIdResp> deleteBlackById(DeleteBlackByIdReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xthbmdxxb xthbmdxxb = SysReqParamToEntityUtils.deleteBlackById(req,loginUserInfo.getUserId());
        xthbmdxxbMapper.updateByPrimaryKeySelective(xthbmdxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<AddBlackInfoResp> addBlackInfo(AddBlackInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xthbmdxxb xthbmdxxb = SysReqParamToEntityUtils.addBlackInfo(req,loginUserInfo.getUserId());
        xthbmdxxbMapper.insertSelective(xthbmdxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<AddBlackListInfoResp> addBlackListInfo(AddBlackListInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        List<Xthbmdxxb> list = SysReqParamToEntityUtils.addBlackListInfo(req.getBody(),loginUserInfo.getUserId());
        xthbmdxxbMapperEx.insertXthbmdxxbBath(list);
        return CommonResult.success();
    }
}
