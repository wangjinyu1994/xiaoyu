package com.xiaoyu.provider.user.controller;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.provider.user.req.*;
import com.xiaoyu.provider.user.resp.*;
import com.xiaoyu.provider.user.service.SysOrgService;
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
@RequestMapping("/sys/xiaoyu/user/org")
@Api(tags = "系统机构控制器",description = "主要提供系统机构相关接口")
public class SysOrgColtroller {

    @Autowired
    private SysOrgService sysOrgService;

    @PostMapping(value = "/selectOrgTable")
    @ApiOperation(value = "分页查询机构请求接口", httpMethod = "POST",notes = "分页查询机构请求接口")
    public TableResult<SelectOrgTableResp> selectOrgTable(@RequestBody @Valid SelectOrgTableReq req, HttpServletRequest request, HttpServletResponse response){
        return sysOrgService.selectOrgTable(req);
    }

    @PostMapping(value = "/selectAllOrgList")
    @ApiOperation(value = "查询所有机构请求接口", httpMethod = "POST",notes = "查询所有机构请求接口")
    public CommonResult<List<SelectAllOrgResp>> selectAllOrgList(@RequestBody @Valid SelectAllOrgReq req, HttpServletRequest request, HttpServletResponse response){
        return sysOrgService.selectAllOrgList(req);
    }

    @PostMapping(value = "/selectOrgById")
    @ApiOperation(value = "根据主键查询机构请求接口", httpMethod = "POST",notes = "根据主键查询机构请求接口")
    public CommonResult<SelectOrgByIdResp> selectOrgById(@RequestBody @Valid SelectOrgByIdReq req, HttpServletRequest request, HttpServletResponse response){
        return sysOrgService.selectOrgById(req);
    }

    @PostMapping(value = "/addOrgInfo")
    @ApiOperation(value = "添加机构详情请求接口", httpMethod = "POST",notes = "添加机构详情请求接口")
    public CommonResult<AddOrgInfoResp> addOrgInfo(@RequestBody @Valid AddOrgInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return sysOrgService.addOrgInfo(req,request);
    }

    @PostMapping(value = "/updateOrgInfo")
    @ApiOperation(value = "修改机构详情请求接口", httpMethod = "POST",notes = "修改机构详情请求接口")
    public CommonResult<UpdateOrgInfoResp> updateOrgInfo(@RequestBody @Valid UpdateOrgInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return sysOrgService.updateOrgInfo(req,request);
    }

    @PostMapping(value = "/deleteOrgInfo")
    @ApiOperation(value = "删除机构详情请求接口", httpMethod = "POST",notes = "删除机构详情请求接口")
    public CommonResult<DeleteOrgInfoResp> deleteOrgInfo(@RequestBody @Valid DeleteOrgInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return sysOrgService.deleteOrgInfo(req,request);
    }

}
