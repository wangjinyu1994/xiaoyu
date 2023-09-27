package com.xiaoyu.provider.user.controller;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.provider.user.req.*;
import com.xiaoyu.provider.user.resp.*;
import com.xiaoyu.provider.user.service.ResourcesService;
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
@RequestMapping("/sys/xiaoyu/resources")
@Api(tags = "系统资源控制器",description = "主要提供系统资源相关接口")
public class ResourcesController {

    @Autowired
    private ResourcesService resourcesService;

    @PostMapping(value = "/selectResourcesTable")
    @ApiOperation(value = "分页查询资源请求接口", httpMethod = "POST",notes = "分页查询资源请求接口")
    public TableResult<SelectResourcesTableResp> selectResourcesTable(@RequestBody @Valid SelectResourcesTableReq req, HttpServletRequest request, HttpServletResponse response){
        return resourcesService.selectResourcesTable(req);
    }

    @PostMapping(value = "/selectAllResourcesList")
    @ApiOperation(value = "查询所有资源请求接口", httpMethod = "POST",notes = "查询所有资源请求接口")
    public CommonResult<List<SelectAllResourcesResp>> selectAllResourcesList(@RequestBody @Valid SelectAllResourcesReq req, HttpServletRequest request, HttpServletResponse response){
        return resourcesService.selectAllResourcesList(req);
    }

    @PostMapping(value = "/selectResourcesById")
    @ApiOperation(value = "根据主键查询资源请求接口", httpMethod = "POST",notes = "根据主键查询资源请求接口")
    public CommonResult<SelectResourcesByIdResp> selectResourcesById(@RequestBody @Valid SelectResourcesByIdReq req, HttpServletRequest request, HttpServletResponse response){
        return resourcesService.selectResourcesById(req);
    }

    @PostMapping(value = "/addResourcesInfo")
    @ApiOperation(value = "添加资源详情请求接口", httpMethod = "POST",notes = "添加资源详情请求接口")
    public CommonResult<AddResourcesInfoResp> addResourcesInfo(@RequestBody @Valid AddResourcesInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return resourcesService.addResourcesInfo(req,request);
    }

    @PostMapping(value = "/updateResourcesInfo")
    @ApiOperation(value = "修改资源详情请求接口", httpMethod = "POST",notes = "修改资源详情请求接口")
    public CommonResult<UpdateResourcesInfoResp> updateResourcesInfo(@RequestBody @Valid UpdateResourcesInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return resourcesService.updateResourcesInfo(req,request);
    }

    @PostMapping(value = "/deleteResourcesInfo")
    @ApiOperation(value = "删除资源详情请求接口", httpMethod = "POST",notes = "删除资源详情请求接口")
    public CommonResult<DeleteResourcesInfoResp> deleteResourcesInfo(@RequestBody @Valid DeleteResourcesInfoReq req, HttpServletRequest request, HttpServletResponse response) {
        return resourcesService.deleteResourcesInfo(req, request);
    }
}
