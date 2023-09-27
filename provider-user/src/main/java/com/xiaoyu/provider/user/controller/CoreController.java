package com.xiaoyu.provider.user.controller;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.provider.user.req.*;
import com.xiaoyu.provider.user.resp.*;
import com.xiaoyu.provider.user.service.CoreService;
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
@RequestMapping("/sys/xiaoyu/user/core")
@Api(tags = "系统中心简介控制器",description = "主要提供系统中心简介相关接口")
public class CoreController {

    @Autowired
    private CoreService coreService;

    @PostMapping(value = "/selectCoreInfo")
    @ApiOperation(value = "查询中心简介请求接口", httpMethod = "POST",notes = "查询中心简介请求接口")
    public TableResult<SelectCoreDataResp> selectCoreInfo(@RequestBody @Valid SelectCoreInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return coreService.selectCoreInfo(req);
    }

    @PostMapping(value = "/selectCoreContentInfo")
    @ApiOperation(value = "查询中心简介内容请求接口", httpMethod = "POST",notes = "查询中心简介内容请求接口")
    public CommonResult<SelectCoreContentInfoResp> selectCoreContentById(@RequestBody @Valid SelectCoreContentInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return coreService.selectCoreContentById(req);
    }

    @PostMapping(value = "/selectCoreDetailsInfo")
    @ApiOperation(value = "查询中心简介详情请求接口", httpMethod = "POST",notes = "查询中心简介详情请求接口")
    public CommonResult<SelectCoreDetailsInfoResp> selectCoreDetailsById(@RequestBody @Valid SelectCoreDetailsInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return coreService.selectCoreDetailsById(req);
    }

    @PostMapping(value = "/addCoreContentInfo")
    @ApiOperation(value = "添加中心简介内容请求接口", httpMethod = "POST",notes = "添加中心简介内容请求接口")
    public CommonResult<AddCoreContentInfoResp> addCoreContentInfo(@RequestBody @Valid AddCoreContentInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return coreService.addCoreContentInfo(req,request);
    }

    @PostMapping(value = "/updateCoreContentInfo")
    @ApiOperation(value = "修改中心简介内容请求接口", httpMethod = "POST",notes = "修改中心简介内容请求接口")
    public CommonResult<UpdateCoreContentInfoResp> updateCoreContentInfo(@RequestBody @Valid UpdateCoreContentInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return coreService.updateCoreContentInfo(req,request);
    }

    @PostMapping(value = "/deleteCoreContentInfo")
    @ApiOperation(value = "删除中心简介内容请求接口", httpMethod = "POST",notes = "删除中心简介内容请求接口")
    public CommonResult<DeleteCoreContentInfoResp> deleteCoreContentInfo(@RequestBody @Valid DeleteCoreContentInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return coreService.deleteCoreContentInfo(req,request);
    }

    @PostMapping(value = "/addCoreDetailsInfo")
    @ApiOperation(value = "添加中心简介详情请求接口", httpMethod = "POST",notes = "添加中心简介详情请求接口")
    public CommonResult<AddCoreDetailsInfoResp> addCoreDetailsInfo(@RequestBody @Valid AddCoreDetailsInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return coreService.addCoreDetailsInfo(req,request);
    }

    @PostMapping(value = "/updateCoreDetailsInfo")
    @ApiOperation(value = "修改中心简介详情请求接口", httpMethod = "POST",notes = "修改中心简介详情请求接口")
    public CommonResult<UpdateCoreDetailsInfoResp> updateCoreDetailsInfo(@RequestBody @Valid UpdateCoreDetailsInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return coreService.updateCoreDetailsInfo(req,request);
    }

    @PostMapping(value = "/deleteCoreDetailsInfo")
    @ApiOperation(value = "删除中心简介详情请求接口", httpMethod = "POST",notes = "删除中心简介详情请求接口")
    public CommonResult<DeleteCoreDetailsInfoResp> deleteCoreDetailsInfo(@RequestBody @Valid DeleteCoreDetailsInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return coreService.deleteCoreDetailsInfo(req,request);
    }

}
