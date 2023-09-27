package com.xiaoyu.feign.user.controller;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.feign.user.req.*;
import com.xiaoyu.feign.user.resp.*;
import com.xiaoyu.feign.user.service.PicturesService;
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
@RequestMapping("/sys/xiaoyu/user/pictures")
@Api(tags = "系统精彩图片控制器",description = "主要提供系统精彩图片相关接口")
public class PicturesController {

    @Autowired
    private PicturesService picturesService;

    @PostMapping(value = "/selectPicturesTable")
    @ApiOperation(value = "分页查询精彩图片请求接口", httpMethod = "POST",notes = "分页查询精彩图片请求接口")
    public TableResult<SelectPicturesTableResp> selectPicturesTable(@RequestBody @Valid SelectPicturesTableReq req, HttpServletRequest request, HttpServletResponse response){
        return picturesService.selectPicturesTable(req);
    }

    @PostMapping(value = "/selectAllPicturesList")
    @ApiOperation(value = "查询所有精彩图片请求接口", httpMethod = "POST",notes = "查询所有精彩图片请求接口")
    public CommonResult<List<SelectPicturesResp>> selectAllPicturesList(@RequestBody @Valid SelectPicturesReq req, HttpServletRequest request, HttpServletResponse response){
        return picturesService.selectAllPicturesList(req);
    }

    @PostMapping(value = "/selectPicturesById")
    @ApiOperation(value = "根据主键查询精彩图片请求接口", httpMethod = "POST",notes = "根据主键查询精彩图片请求接口")
    public CommonResult<SelectPicturesByIdResp> selectPicturesById(@RequestBody @Valid SelectPicturesByIdReq req, HttpServletRequest request, HttpServletResponse response){
        return picturesService.selectPicturesById(req);
    }

    @PostMapping(value = "/addPicturesInfo")
    @ApiOperation(value = "添加精彩图片详情请求接口", httpMethod = "POST",notes = "添加精彩图片详情请求接口")
    public CommonResult<AddPicturesInfoResp> addPicturesInfo(@RequestBody @Valid AddPicturesInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return picturesService.addPicturesInfo(req,request);
    }

    @PostMapping(value = "/updatePicturesInfo")
    @ApiOperation(value = "修改精彩图片详情请求接口", httpMethod = "POST",notes = "修改精彩图片详情请求接口")
    public CommonResult<UpdatePicturesInfoResp> updatePicturesInfo(@RequestBody @Valid UpdatePicturesInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return picturesService.updatePicturesInfo(req,request);
    }

    @PostMapping(value = "/deletePicturesInfo")
    @ApiOperation(value = "删除精彩图片详情请求接口", httpMethod = "POST",notes = "删除精彩图片详情请求接口")
    public CommonResult<DeletePicturesInfoResp> deletePicturesInfo(@RequestBody @Valid DeletePicturesInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return picturesService.deletePicturesInfo(req,request);
    }

}
