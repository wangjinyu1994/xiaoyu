package com.xiaoyu.provider.user.service;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.provider.user.req.AddUserOrgInfoReq;
import com.xiaoyu.provider.user.req.DeleteUserOrgInfoReq;
import com.xiaoyu.provider.user.req.SelectUserByOrgIdReq;
import com.xiaoyu.provider.user.req.UpdateUserOrgInfoReq;
import com.xiaoyu.provider.user.resp.AddUserOrgInfoResp;
import com.xiaoyu.provider.user.resp.DeleteUserOrgInfoResp;
import com.xiaoyu.provider.user.resp.SelectUserByOrgIdResp;
import com.xiaoyu.provider.user.resp.UpdateUserOrgInfoResp;

import javax.servlet.http.HttpServletRequest;

/**
 * WJY
 */
public interface SysUserOrgService {
    TableResult<SelectUserByOrgIdResp> selectUserByOrgIdResp(SelectUserByOrgIdReq req);

    CommonResult<AddUserOrgInfoResp> addUserOrgInfo(AddUserOrgInfoReq req, HttpServletRequest request);

    CommonResult<UpdateUserOrgInfoResp> updateUserOrgInfo(UpdateUserOrgInfoReq req, HttpServletRequest request);

    CommonResult<DeleteUserOrgInfoResp> deleteUserOrgInfo(DeleteUserOrgInfoReq req, HttpServletRequest request);
}
