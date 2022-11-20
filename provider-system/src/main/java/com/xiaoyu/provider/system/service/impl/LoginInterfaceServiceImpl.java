package com.xiaoyu.provider.system.service.impl;

import com.xiaoyu.common.base.req.LoginUserInfo;
import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.common.base.util.HttpServletRequestUtil;
import com.xiaoyu.provider.system.dao.XtdljkxxbMapper;
import com.xiaoyu.provider.system.dao.ex.XtdljkxxbMapperEx;
import com.xiaoyu.provider.system.entity.Xtdljkxxb;
import com.xiaoyu.provider.system.req.*;
import com.xiaoyu.provider.system.resp.*;
import com.xiaoyu.provider.system.service.LoginInterfaceService;
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
public class LoginInterfaceServiceImpl implements LoginInterfaceService {

    @Autowired
    private XtdljkxxbMapper xtdljkxxbMapper;
    @Autowired
    private XtdljkxxbMapperEx xtdljkxxbMapperEx;

    /**
     * 获取所有登录放行请求接口
     */
    @Override
    public CommonResult<List<SelectLoginInterlistListResp>> selectLoginInterfaceList(SelectLoginInterListReq req) {
        List<SelectLoginInterlistListResp> list = xtdljkxxbMapperEx.selectLoginInterfaceList(req);
        return CommonResult.success(list);
    }

    /**
     * 获取所有登录放行请求接口分页
     */
    @Override
    public TableResult<SelectLoginInterTableResp> selectLoginInterfacelistTable(SelectLoginInterTableReq req) {
        List<SelectLoginInterTableResp> rows = xtdljkxxbMapperEx.selectLoginInterfacelistTable(req);
        Integer total = xtdljkxxbMapperEx.countSelectLoginInterfacelistTable(req);
        return TableResult.success(rows,total);
    }

    /**
     * 根据主键修改登录放行请求接口
     */
    @Override
    public CommonResult<UpdateLoginInterByIdResp> updateLoginInterfaceById(UpdateLoginInterByIdReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtdljkxxb xtdljkxxb = SysReqParamToEntityUtils.updateLoginInterfaceById(req,loginUserInfo.getUserId());
        xtdljkxxbMapper.updateByPrimaryKeySelective(xtdljkxxb);
        return CommonResult.success();
    }

    /**
     * 根据主键删除登录放行请求接口
     */
    @Override
    public CommonResult<DeleteLoginInterByIdResp> deleteLoginInterfaceById(DeleteLoginInterByIdReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtdljkxxb xtdljkxxb = SysReqParamToEntityUtils.deleteLoginInterfaceById(req,loginUserInfo.getUserId());
        xtdljkxxbMapper.updateByPrimaryKeySelective(xtdljkxxb);
        return CommonResult.success();
    }

    /**
     * 添加登录放行请求接口
     */
    @Override
    public CommonResult<AddLoginInterInfoResp> addLoginInterfaceInfo(AddLoginInterInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtdljkxxb xtdljkxxb = SysReqParamToEntityUtils.addLoginInterfaceInfo(req,loginUserInfo.getUserId());
        xtdljkxxbMapper.insertSelective(xtdljkxxb);
        return CommonResult.success();
    }

    /**
     * 批量添加登录放行请求接口
     */
    @Override
    public CommonResult<AddLoginInterListInfoResp> addLoginInterfaceListInfo(AddLoginInterListInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        List<Xtdljkxxb> list = SysReqParamToEntityUtils.addLoginInterfaceListInfo(req.getBody(),loginUserInfo.getUserId());
        xtdljkxxbMapperEx.insertXtdljkxxbBath(list);
        return CommonResult.success();
    }
}
