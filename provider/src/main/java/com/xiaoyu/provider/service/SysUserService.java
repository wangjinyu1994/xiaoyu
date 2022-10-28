package com.xiaoyu.provider.service;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.provider.req.SysUserUpdatePasswordReq;
import com.xiaoyu.provider.resp.SysUserUpdatePasswordResp;

import javax.servlet.http.HttpServletRequest;

/**
 * WJY
 */
public interface SysUserService {

    CommonResult<SysUserUpdatePasswordResp> sysUserUpdatePassword(SysUserUpdatePasswordReq req, HttpServletRequest request);
}
