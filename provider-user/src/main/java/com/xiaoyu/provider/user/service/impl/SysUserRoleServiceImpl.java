package com.xiaoyu.provider.user.service.impl;

import com.xiaoyu.common.base.constants.ResponseEnum;
import com.xiaoyu.common.base.req.LoginUserInfo;
import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.util.HttpServletRequestUtil;
import com.xiaoyu.provider.user.dao.XtryjsxxbMapper;
import com.xiaoyu.provider.user.dao.ex.XtryjsxxbMapperEx;
import com.xiaoyu.provider.user.entity.Xtryjsxxb;
import com.xiaoyu.provider.user.req.*;
import com.xiaoyu.provider.user.resp.*;
import com.xiaoyu.provider.user.service.SysUserRoleService;
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
public class SysUserRoleServiceImpl implements SysUserRoleService {

    @Autowired
    private XtryjsxxbMapper xtryjsxxbMapper;
    @Autowired
    private XtryjsxxbMapperEx xtryjsxxbMapperEx;

    @Override
    public CommonResult<AddUserRoleInfoResp> addUserRoleInfo(AddUserRoleInfoReq req, HttpServletRequest request) {
        // 先判断是否已有该角色
        Xtryjsxxb sfzt = xtryjsxxbMapperEx.selectXtryjsxxbByUserIdAndJsId(req.getUserId(),req.getRoleId());
        if (Objects.nonNull(sfzt)){
            return CommonResult.build(ResponseEnum.FAIL.getCode(),"该用户已有该角色不可重复添加！");
        }
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtryjsxxb xtryjsxxb = ReqParamToEntityUtils.addUserRoleInfo(req,loginUserInfo.getUserId());
        xtryjsxxbMapperEx.insertXtryjsxxb(xtryjsxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<UpdateUserRoleInfoResp> updateUserRoleInfo(UpdateUserRoleInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtryjsxxb xtryjsxxb = ReqParamToEntityUtils.updateUserRoleInfo(req,loginUserInfo.getUserId());
        xtryjsxxbMapper.updateByPrimaryKeySelective(xtryjsxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<DeleteUserRoleInfoResp> deleteUserRoleInfo(DeleteUserRoleInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtryjsxxb xtryjsxxb = ReqParamToEntityUtils.deleteUserRoleInfo(req,loginUserInfo.getUserId());
        xtryjsxxbMapper.updateByPrimaryKeySelective(xtryjsxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<List<SelectUserRoleByUserIdResp>> selectUserRoleByUserId(SelectUserRoleByUserIdReq req) {
        List<SelectUserRoleByUserIdResp> resps = xtryjsxxbMapperEx.selectUserRoleByUserId(req);
        return CommonResult.success(resps);
    }

}
