package com.xiaoyu.provider.system.controller;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.provider.system.req.*;
import com.xiaoyu.provider.system.resp.*;
import com.xiaoyu.provider.system.service.BlacklistService;
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
@RequestMapping("/sys/xiaoyu/system/blacklist")
@Api(tags = "系统黑名单控制器",description = "主要提供黑名单相关接口")
public class BlacklistController {

    @Autowired
    private BlacklistService blacklistService;

    @PostMapping(value = "/selectBlacklistList")
    @ApiOperation(value = "获取所有黑名单请求接口", httpMethod = "POST",notes = "获取所有黑名单请求接口")
    public CommonResult<List<SelectBlacklistListResp>> selectBlacklistList(@RequestBody @Valid SelectBlacklistListReq req, HttpServletRequest request, HttpServletResponse response){
        return blacklistService.selectDictionaryType(req);
    }

    @PostMapping(value = "/selectBlacklistTable")
    @ApiOperation(value = "获取所有黑名单请求接口分页", httpMethod = "POST",notes = "获取所有黑名单请求接口分页")
    public TableResult<SelectBlacklistTableResp> selectBlacklistTable(@RequestBody @Valid SelectBlacklistTableReq req, HttpServletRequest request, HttpServletResponse response){
        return blacklistService.selectBlacklistTable(req);
    }

    @PostMapping(value = "/updateBlackById")
    @ApiOperation(value = "根据主键修改黑名单请求接口", httpMethod = "POST",notes = "根据主键修改黑名单请求接口")
    public CommonResult<UpdateBlackByIdResp> updateBlackById(@RequestBody @Valid UpdateBlackByIdReq req, HttpServletRequest request, HttpServletResponse response){
        return blacklistService.updateBlackById(req,request);
    }

    @PostMapping(value = "/deleteBlackById")
    @ApiOperation(value = "根据主键删除黑名单请求接口", httpMethod = "POST",notes = "根据主键删除黑名单请求接口")
    public CommonResult<DeleteBlackByIdResp> deleteBlackById(@RequestBody @Valid DeleteBlackByIdReq req, HttpServletRequest request, HttpServletResponse response){
        return blacklistService.deleteBlackById(req,request);
    }

    @PostMapping(value = "/addBlackInfo")
    @ApiOperation(value = "添加黑名单请求接口", httpMethod = "POST",notes = "添加黑名单请求接口")
    public CommonResult<AddBlackInfoResp> addBlackInfo(@RequestBody @Valid AddBlackInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return blacklistService.addBlackInfo(req,request);
    }

    @PostMapping(value = "/addBlackListInfo")
    @ApiOperation(value = "批量添加黑名单请求接口", httpMethod = "POST",notes = "批量添加黑名单请求接口")
    public CommonResult<AddBlackListInfoResp> addBlackListInfo(@RequestBody @Valid AddBlackListInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return blacklistService.addBlackListInfo(req,request);
    }

}
