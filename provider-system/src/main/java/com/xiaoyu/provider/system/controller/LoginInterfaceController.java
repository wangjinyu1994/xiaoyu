package com.xiaoyu.provider.system.controller;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.provider.system.req.*;
import com.xiaoyu.provider.system.resp.*;
import com.xiaoyu.provider.system.service.LoginInterfaceService;
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
import java.util.List;

/**
 * WJY
 */
@RestController
@RequestMapping("/sys/xiaoyu/system/loginInterface")
@Api(tags = "系统登录放行控制器",description = "主要提供登录放行相关接口")
public class LoginInterfaceController {

    @Autowired
    private LoginInterfaceService loginInterfaceService;

    @PostMapping(value = "/selectLoginInterfaceList")
    @ApiOperation(value = "获取所有登录放行请求接口", httpMethod = "POST",notes = "获取所有登录放行请求接口")
    public CommonResult<List<SelectLoginInterlistListResp>> selectLoginInterfaceList(@RequestBody @Valid SelectLoginInterListReq req, HttpServletRequest request, HttpServletResponse response){
        return loginInterfaceService.selectLoginInterfaceList(req);
    }

    @PostMapping(value = "/selectLoginInterfacelistTable")
    @ApiOperation(value = "获取所有登录放行请求接口分页", httpMethod = "POST",notes = "获取所有登录放行请求接口分页")
    public TableResult<SelectLoginInterTableResp> selectLoginInterfacelistTable(@RequestBody @Valid SelectLoginInterTableReq req, HttpServletRequest request, HttpServletResponse response){
        return loginInterfaceService.selectLoginInterfacelistTable(req);
    }

    @PostMapping(value = "/updateLoginInterfaceById")
    @ApiOperation(value = "根据主键修改登录放行请求接口", httpMethod = "POST",notes = "根据主键修改登录放行请求接口")
    public CommonResult<UpdateLoginInterByIdResp> updateLoginInterfaceById(@RequestBody @Valid UpdateLoginInterByIdReq req, HttpServletRequest request, HttpServletResponse response){
        return loginInterfaceService.updateLoginInterfaceById(req,request);
    }

    @PostMapping(value = "/deleteLoginInterfaceById")
    @ApiOperation(value = "根据主键删除登录放行请求接口", httpMethod = "POST",notes = "根据主键删除登录放行请求接口")
    public CommonResult<DeleteLoginInterByIdResp> deleteLoginInterfaceById(@RequestBody @Valid DeleteLoginInterByIdReq req, HttpServletRequest request, HttpServletResponse response){
        return loginInterfaceService.deleteLoginInterfaceById(req,request);
    }

    @PostMapping(value = "/addLoginInterfaceInfo")
    @ApiOperation(value = "添加登录放行请求接口", httpMethod = "POST",notes = "添加登录放行请求接口")
    public CommonResult<AddLoginInterInfoResp> addLoginInterfaceInfo(@RequestBody @Valid AddLoginInterInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return loginInterfaceService.addLoginInterfaceInfo(req,request);
    }

    @PostMapping(value = "/addLoginInterfaceListInfo")
    @ApiOperation(value = "批量添加登录放行请求接口", httpMethod = "POST",notes = "批量添加登录放行请求接口")
    public CommonResult<AddLoginInterListInfoResp> addLoginInterfaceListInfo(@RequestBody @Valid AddLoginInterListInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return loginInterfaceService.addLoginInterfaceListInfo(req,request);
    }

}
