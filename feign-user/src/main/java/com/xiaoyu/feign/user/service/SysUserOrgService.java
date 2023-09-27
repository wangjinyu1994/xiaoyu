package com.xiaoyu.feign.user.service;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.feign.user.req.AddUserOrgInfoReq;
import com.xiaoyu.feign.user.req.DeleteUserOrgInfoReq;
import com.xiaoyu.feign.user.req.SelectUserByOrgIdReq;
import com.xiaoyu.feign.user.req.UpdateUserOrgInfoReq;
import com.xiaoyu.feign.user.resp.AddUserOrgInfoResp;
import com.xiaoyu.feign.user.resp.DeleteUserOrgInfoResp;
import com.xiaoyu.feign.user.resp.SelectUserByOrgIdResp;
import com.xiaoyu.feign.user.resp.UpdateUserOrgInfoResp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;


import javax.servlet.http.HttpServletRequest;

/**
 * WJY
 */
@FeignClient(value = "xiaoyu-provider-user")
public interface SysUserOrgService {

    @PostMapping(value = "/sys/xiaoyu/user/selectUserByOrgIdResp")
    TableResult<SelectUserByOrgIdResp> selectUserByOrgIdResp(SelectUserByOrgIdReq req);

    @PostMapping(value = "/sys/xiaoyu/user/addUserOrgInfo")
    CommonResult<AddUserOrgInfoResp> addUserOrgInfo(AddUserOrgInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/updateUserOrgInfo")
    CommonResult<UpdateUserOrgInfoResp> updateUserOrgInfo(UpdateUserOrgInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/deleteUserOrgInfo")
    CommonResult<DeleteUserOrgInfoResp> deleteUserOrgInfo(DeleteUserOrgInfoReq req, HttpServletRequest request);
}
