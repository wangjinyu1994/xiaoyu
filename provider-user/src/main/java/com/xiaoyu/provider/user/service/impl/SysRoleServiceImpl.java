package com.xiaoyu.provider.user.service.impl;

import com.xiaoyu.common.base.req.LoginUserInfo;
import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.common.base.util.HttpServletRequestUtil;
import com.xiaoyu.provider.user.dao.XtjsxxbMapper;
import com.xiaoyu.provider.user.dao.ex.XtjsxxbMapperEx;
import com.xiaoyu.provider.user.entity.Xtjsxxb;
import com.xiaoyu.provider.user.req.*;
import com.xiaoyu.provider.user.resp.*;
import com.xiaoyu.provider.user.service.SysRoleService;
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
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private XtjsxxbMapper xtjsxxbMapper;
    @Autowired
    private XtjsxxbMapperEx xtjsxxbMapperEx;

    @Override
    public TableResult<SelectRoleTableResp> selectRoleTable(SelectRoleTableReq req) {
        List<SelectRoleTableResp> rows = xtjsxxbMapperEx.selectRoleTable(req);
        Integer total = xtjsxxbMapperEx.countSelectRoleTable(req);
        return TableResult.success(rows,total);
    }

    @Override
    public CommonResult<List<SelectAllRoleResp>> selectAllRoleList(SelectAllRoleReq req) {
        List<SelectAllRoleResp> resps = xtjsxxbMapperEx.selectAllRoleList(req);
        return CommonResult.success(resps);
    }

    @Override
    public CommonResult<SelectRoleByIdResp> selectRoleById(SelectRoleByIdReq req) {
        SelectRoleByIdResp resp = xtjsxxbMapperEx.selectRoleById(req);
        return CommonResult.success(resp);
    }

    @Override
    public CommonResult<AddRoleInfoResp> addRoleInfo(AddRoleInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtjsxxb xtjgxxb = ReqParamToEntityUtils.addRoleInfo(req,loginUserInfo.getUserId());
        xtjsxxbMapperEx.insertXtjsxxb(xtjgxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<UpdateRoleInfoResp> updateRoleInfo(UpdateRoleInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtjsxxb xtjgxxb = ReqParamToEntityUtils.updateRoleInfo(req,loginUserInfo.getUserId());
        xtjsxxbMapper.updateByPrimaryKeySelective(xtjgxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<DeleteRoleInfoResp> deleteRoleInfo(DeleteRoleInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtjsxxb xtjgxxb = ReqParamToEntityUtils.deleteRoleInfo(req,loginUserInfo.getUserId());
        xtjsxxbMapper.updateByPrimaryKeySelective(xtjgxxb);
        return CommonResult.success();
    }

}
