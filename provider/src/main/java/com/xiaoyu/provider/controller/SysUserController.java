package com.xiaoyu.provider.controller;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.provider.req.SysUserUpdatePasswordReq;
import com.xiaoyu.provider.resp.SysUserUpdatePasswordResp;
import com.xiaoyu.provider.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * WJY
 */
@RestController
@RequestMapping("/sys/xiaoyu/user")
@Api(tags = "系统人员控制器",description = "主要提供系统人员控制器相关接口")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @PostMapping(value = "/sysUserUpdatePassword")
    @ApiOperation(value = "系统人员修改密码请求接口", httpMethod = "POST",notes = "系统人员修改密码请求接口")
    public CommonResult<SysUserUpdatePasswordResp> sysUserUpdatePassword(@RequestBody @Valid SysUserUpdatePasswordReq req, HttpServletRequest request, HttpServletResponse response){
        return sysUserService.sysUserUpdatePassword(req,request);
    }
}
