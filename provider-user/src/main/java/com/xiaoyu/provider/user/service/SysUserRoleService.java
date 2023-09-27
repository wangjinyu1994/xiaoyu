package com.xiaoyu.provider.user.service;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.provider.user.req.*;
import com.xiaoyu.provider.user.resp.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * WJY
 */
public interface SysUserRoleService {
    CommonResult<AddUserRoleInfoResp> addUserRoleInfo(AddUserRoleInfoReq req, HttpServletRequest request);

    CommonResult<UpdateUserRoleInfoResp> updateUserRoleInfo(UpdateUserRoleInfoReq req, HttpServletRequest request);

    CommonResult<DeleteUserRoleInfoResp> deleteUserRoleInfo(DeleteUserRoleInfoReq req, HttpServletRequest request);

    CommonResult<List<SelectUserRoleByUserIdResp>> selectUserRoleByUserId(SelectUserRoleByUserIdReq req);
}
