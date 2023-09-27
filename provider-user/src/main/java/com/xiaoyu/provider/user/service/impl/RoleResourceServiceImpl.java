package com.xiaoyu.provider.user.service.impl;

import com.xiaoyu.common.base.constants.ResponseEnum;
import com.xiaoyu.common.base.req.LoginUserInfo;
import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.common.base.util.HttpServletRequestUtil;
import com.xiaoyu.provider.user.dao.XtjszyxxbMapper;
import com.xiaoyu.provider.user.dao.ex.XtjszyxxbMapperEx;
import com.xiaoyu.provider.user.entity.Xtjszyxxb;
import com.xiaoyu.provider.user.req.*;
import com.xiaoyu.provider.user.resp.*;
import com.xiaoyu.provider.user.service.RoleResourceService;
import com.xiaoyu.provider.user.util.ReqParamToEntityUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Objects;

/**
 * WJY
 */
@Service
@Slf4j
public class RoleResourceServiceImpl implements RoleResourceService {

    @Autowired
    private XtjszyxxbMapper xtjszyxxbMapper;
    @Autowired
    private XtjszyxxbMapperEx xtjszyxxbMapperEx;

    @Override
    public CommonResult<List<SelectRoleResourceResp>> selectRoleResourceList(SelectRoleResourceReq req) {
        List<SelectRoleResourceResp> resps = xtjszyxxbMapperEx.selectRoleResourceList(req);
        return CommonResult.success(resps);
    }

    @Override
    public TableResult<SelectRoleResourceTableResp> selectRoleResourceTable(SelectRoleResourceTableReq req) {
        List<SelectRoleResourceTableResp> rows = xtjszyxxbMapperEx.selectRoleResourceTable(req);
        Integer total = xtjszyxxbMapperEx.countSelectRoleResourceTable(req);
        return TableResult.success(rows,total);
    }

    @Override
    public CommonResult<SelectRoleResourceByIdResp> selectRoleResourceById(SelectRoleResourceByIdReq req) {
        SelectRoleResourceByIdResp resp = xtjszyxxbMapperEx.selectRoleResourceById(req);
        return CommonResult.success(resp);
    }

    @Override
    public CommonResult<AddRoleResourceResp> addRoleResourceInfo(AddRoleResourceReq req, HttpServletRequest request) {
        Xtjszyxxb yz = xtjszyxxbMapperEx.selectXtjszyxxbByRoleIdAndResourceId(req.getRoleId(),req.getResourceId());
        if (Objects.nonNull(yz)){
            return CommonResult.build(ResponseEnum.FAIL.getCode(),"该角色已有该资源，不可重复添加！");
        }
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtjszyxxb xtjszyxxb = ReqParamToEntityUtils.addRoleResourceInfo(req,loginUserInfo.getUserId());
        xtjszyxxbMapperEx.insertXtjszyxxb(xtjszyxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<UpdateRoleResourceResp> updateRoleResourceInfo(UpdateRoleResourceReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtjszyxxb xtjszyxxb = ReqParamToEntityUtils.updateRoleResourceInfo(req,loginUserInfo.getUserId());
        xtjszyxxbMapper.updateByPrimaryKeySelective(xtjszyxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<DeleteRoleResourceResp> deleteRoleResourceInfo(DeleteRoleResourceReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtjszyxxb xtjszyxxb = ReqParamToEntityUtils.deleteRoleResourceInfo(req,loginUserInfo.getUserId());
        xtjszyxxbMapper.updateByPrimaryKeySelective(xtjszyxxb);
        return CommonResult.success();
    }
}
