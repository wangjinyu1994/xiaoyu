package com.xiaoyu.feign.user.controller;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.feign.user.req.*;
import com.xiaoyu.feign.user.resp.*;
import com.xiaoyu.feign.user.service.LinksService;
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
@RequestMapping("/sys/xiaoyu/user/links")
@Api(tags = "系统友情链接控制器",description = "主要提供系统友情链接相关接口")
public class LinksController {

    @Autowired
    private LinksService linksService;

    @PostMapping(value = "/selectLinksInfo")
    @ApiOperation(value = "查询友情链接请求接口", httpMethod = "POST",notes = "查询友情链接请求接口")
    public CommonResult<List<SelectLinksDataResp>> selectLinksInfo(@RequestBody @Valid SelectLinksInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return linksService.selectLinksInfo(req);
    }

    @PostMapping(value = "/selectLinksTable")
    @ApiOperation(value = "分页查询友情链接请求接口", httpMethod = "POST",notes = "分页查询友情链接请求接口")
    public TableResult<SelectLinksTableResp> selectLinksTable(@RequestBody @Valid SelectLinksTableInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return linksService.selectLinksTable(req);
    }

    @PostMapping(value = "/addLinksInfo")
    @ApiOperation(value = "添加友情链接详情请求接口", httpMethod = "POST",notes = "添加友情链接详情请求接口")
    public CommonResult<AddLinksInfoResp> addLinksInfo(@RequestBody @Valid AddLinksInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return linksService.addLinksInfo(req,request);
    }

    @PostMapping(value = "/updateLinksInfo")
    @ApiOperation(value = "修改友情链接详情请求接口", httpMethod = "POST",notes = "修改友情链接详情请求接口")
    public CommonResult<UpdateLinksInfoResp> updateLinksInfo(@RequestBody @Valid UpdateLinksInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return linksService.updateLinksInfo(req,request);
    }

    @PostMapping(value = "/deleteLinksInfo")
    @ApiOperation(value = "删除友情链接详情请求接口", httpMethod = "POST",notes = "删除友情链接详情请求接口")
    public CommonResult<DeleteLinksInfoResp> deleteLinksInfo(@RequestBody @Valid DeleteLinksInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return linksService.deleteLinksInfo(req,request);
    }

}
