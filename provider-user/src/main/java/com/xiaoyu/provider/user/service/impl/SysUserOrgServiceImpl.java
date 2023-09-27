package com.xiaoyu.provider.user.service.impl;

import com.xiaoyu.common.base.req.LoginUserInfo;
import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.common.base.util.HttpServletRequestUtil;
import com.xiaoyu.provider.user.dao.XtryjgxxbMapper;
import com.xiaoyu.provider.user.dao.ex.XtryjgxxbMapperEx;
import com.xiaoyu.provider.user.entity.Xtryjgxxb;
import com.xiaoyu.provider.user.req.AddUserOrgInfoReq;
import com.xiaoyu.provider.user.req.DeleteUserOrgInfoReq;
import com.xiaoyu.provider.user.req.SelectUserByOrgIdReq;
import com.xiaoyu.provider.user.req.UpdateUserOrgInfoReq;
import com.xiaoyu.provider.user.resp.AddUserOrgInfoResp;
import com.xiaoyu.provider.user.resp.DeleteUserOrgInfoResp;
import com.xiaoyu.provider.user.resp.SelectUserByOrgIdResp;
import com.xiaoyu.provider.user.resp.UpdateUserOrgInfoResp;
import com.xiaoyu.provider.user.service.SysUserOrgService;
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
public class SysUserOrgServiceImpl implements SysUserOrgService {

    @Autowired
    private XtryjgxxbMapper xtryjgxxbMapper;
    @Autowired
    private XtryjgxxbMapperEx xtryjgxxbMapperEx;

    @Override
    public TableResult<SelectUserByOrgIdResp> selectUserByOrgIdResp(SelectUserByOrgIdReq req) {
        List<SelectUserByOrgIdResp> rows = xtryjgxxbMapperEx.selectUserByOrgIdResp(req);
        Integer total = xtryjgxxbMapperEx.countSelectUserByOrgIdResp(req);
        return TableResult.success(rows,total);
    }

    @Override
    public CommonResult<AddUserOrgInfoResp> addUserOrgInfo(AddUserOrgInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtryjgxxb xtryjgxxb = ReqParamToEntityUtils.addUserOrgInfo(req,loginUserInfo.getUserId());
        xtryjgxxbMapperEx.insertXtryjgxxb(xtryjgxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<UpdateUserOrgInfoResp> updateUserOrgInfo(UpdateUserOrgInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtryjgxxb xtryjgxxb = ReqParamToEntityUtils.updateUserOrgInfo(req,loginUserInfo.getUserId());
        xtryjgxxbMapper.updateByPrimaryKeySelective(xtryjgxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<DeleteUserOrgInfoResp> deleteUserOrgInfo(DeleteUserOrgInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtryjgxxb xtryjgxxb = ReqParamToEntityUtils.deleteUserOrgInfo(req,loginUserInfo.getUserId());
        xtryjgxxbMapper.updateByPrimaryKeySelective(xtryjgxxb);
        return CommonResult.success();
    }
}
