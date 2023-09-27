package com.xiaoyu.feign.user.service;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.feign.user.req.AddUserRoleInfoReq;
import com.xiaoyu.feign.user.req.DeleteUserRoleInfoReq;
import com.xiaoyu.feign.user.req.SelectUserRoleByUserIdReq;
import com.xiaoyu.feign.user.req.UpdateUserRoleInfoReq;
import com.xiaoyu.feign.user.resp.AddUserRoleInfoResp;
import com.xiaoyu.feign.user.resp.DeleteUserRoleInfoResp;
import com.xiaoyu.feign.user.resp.SelectUserRoleByUserIdResp;
import com.xiaoyu.feign.user.resp.UpdateUserRoleInfoResp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * WJY
 */
@FeignClient(value = "xiaoyu-provider-user")
public interface SysUserRoleService {

    @PostMapping(value = "/sys/xiaoyu/user/addUserRoleInfo")
    CommonResult<AddUserRoleInfoResp> addUserRoleInfo(AddUserRoleInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/updateUserRoleInfo")
    CommonResult<UpdateUserRoleInfoResp> updateUserRoleInfo(UpdateUserRoleInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/deleteUserRoleInfo")
    CommonResult<DeleteUserRoleInfoResp> deleteUserRoleInfo(DeleteUserRoleInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/selectUserRoleByUserId")
    CommonResult<List<SelectUserRoleByUserIdResp>> selectUserRoleByUserId(SelectUserRoleByUserIdReq req);
}
