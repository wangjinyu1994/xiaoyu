package com.xiaoyu.provider.user.controller;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.provider.user.req.*;
import com.xiaoyu.provider.user.resp.*;
import com.xiaoyu.provider.user.service.NoticeService;
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
@RequestMapping("/sys/xiaoyu/user/notice")
@Api(tags = "系统消息通知控制器",description = "主要提供系统消息通知相关接口")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @PostMapping(value = "/selectNoticTable")
    @ApiOperation(value = "分页查询消息通知请求接口", httpMethod = "POST",notes = "分页查询消息通知请求接口")
    public TableResult<SelectNoticTableResp> selectNoticTable(@RequestBody @Valid SelectNoticTableReq req, HttpServletRequest request, HttpServletResponse response){
        return noticeService.selectNoticTable(req);
    }

    @PostMapping(value = "/selectNoticIndex")
    @ApiOperation(value = "首页查询消息通知请求接口", httpMethod = "POST",notes = "首页查询消息通知请求接口")
    public CommonResult<List<SelectNoticIndexResp>> selectNoticIndex(@RequestBody @Valid SelectNoticIndexReq req, HttpServletRequest request, HttpServletResponse response){
        return noticeService.selectNoticIndex(req);
    }

    @PostMapping(value = "/selectNoticById")
    @ApiOperation(value = "根据主键查询消息通知请求接口", httpMethod = "POST",notes = "根据主键查询消息通知请求接口")
    public CommonResult<SelectNoticByIdResp> selectNoticById(@RequestBody @Valid SelectNoticByIdReq req, HttpServletRequest request, HttpServletResponse response){
        return noticeService.selectNoticById(req);
    }

    @PostMapping(value = "/addNoticInfo")
    @ApiOperation(value = "添加消息通知详情请求接口", httpMethod = "POST",notes = "添加消息通知详情请求接口")
    public CommonResult<AddNoticInfoResp> addNoticInfo(@RequestBody @Valid AddNoticInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return noticeService.addNoticInfo(req,request);
    }

    @PostMapping(value = "/updateNoticInfo")
    @ApiOperation(value = "修改消息通知详情请求接口", httpMethod = "POST",notes = "修改消息通知详情请求接口")
    public CommonResult<UpdateNoticInfoResp> updateNoticInfo(@RequestBody @Valid UpdateNoticInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return noticeService.updateNoticInfo(req,request);
    }

    @PostMapping(value = "/deleteNoticInfo")
    @ApiOperation(value = "删除消息通知详情请求接口", httpMethod = "POST",notes = "删除消息通知详情请求接口")
    public CommonResult<DeleteNoticInfoResp> deleteNoticInfo(@RequestBody @Valid DeleteNoticInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return noticeService.deleteNoticInfo(req,request);
    }

    @PostMapping(value = "/addNoticEnclosureInfo")
    @ApiOperation(value = "添加消息通知附件请求接口", httpMethod = "POST",notes = "添加消息通知附件请求接口")
    public CommonResult<AddNoticEnclosureInfoResp> addNoticEnclosureInfo(@RequestBody @Valid AddNoticEnclosureInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return noticeService.addNoticEnclosureInfo(req,request);
    }

    @PostMapping(value = "/addNoticEnclosureListInfo")
    @ApiOperation(value = "添加消息通知附件请求接口", httpMethod = "POST",notes = "添加消息通知附件请求接口")
    public CommonResult<AddNoticEnclosureInfoResp> addNoticEnclosureListInfo(@RequestBody @Valid AddNoticEnclosureListInfo req, HttpServletRequest request, HttpServletResponse response){
        return noticeService.addNoticEnclosureListInfo(req,request);
    }

    @PostMapping(value = "/updateNoticEnclosureInfo")
    @ApiOperation(value = "修改消息通知附件请求接口", httpMethod = "POST",notes = "修改消息通知附件请求接口")
    public CommonResult<UpdateNoticEnclosureInfoResp> updateNoticEnclosureInfo(@RequestBody @Valid UpdateNoticEnclosureInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return noticeService.updateNoticEnclosureInfo(req,request);
    }

    @PostMapping(value = "/deleteNoticEnclosureInfo")
    @ApiOperation(value = "删除消息通知附件请求接口", httpMethod = "POST",notes = "删除消息通知附件请求接口")
    public CommonResult<DeleteNoticEnclosureInfoResp> deleteNoticEnclosureInfo(@RequestBody @Valid DeleteNoticEnclosureInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return noticeService.deleteNoticEnclosureInfo(req,request);
    }

}
