package com.xiaoyu.oss.controller;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.util.RedisUtils;
import com.xiaoyu.oss.req.UploadBase64ImgReq;
import com.xiaoyu.oss.req.UploadLocalImgReq;
import com.xiaoyu.oss.resp.UploadBase64ImgResp;
import com.xiaoyu.oss.resp.UploadImgResp;
import com.xiaoyu.oss.resp.UploadLocalImgResp;
import com.xiaoyu.oss.resp.UploadResp;
import com.xiaoyu.oss.service.FileUploadService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * WJY
 */
@RestController
@RequestMapping("/file")
@Api(tags = "文件上传控制器",description = "主要提供文件上传相关接口")
public class FileUploadColtroller {

    @Autowired
    private FileUploadService fileUploadService;
    @Autowired
    private RedisUtils redisUtils;

    @PostMapping(value = "/uploadLocalImg")
    @ApiOperation(value = "上传本地图片请求接口", httpMethod = "POST",notes = "上传本地图片请求接口")
    public CommonResult<UploadLocalImgResp> uploadLocalImg(@RequestBody UploadLocalImgReq req, HttpServletRequest request, HttpServletResponse response) throws FileNotFoundException {
        return fileUploadService.uploadLocalImg(req,request);
    }

    @PostMapping(value = "/uploadBase64Img")
    @ApiOperation(value = "上传base64图片请求接口", httpMethod = "POST",notes = "上传base64图片请求接口")
    public CommonResult<UploadBase64ImgResp> uploadBase64Img(@RequestBody UploadBase64ImgReq req, HttpServletRequest request, HttpServletResponse response) throws IOException {
        return fileUploadService.uploadBase64Img(req,request);
    }

    @PostMapping(value = "/uploadImg")
    @ApiOperation(value = "上传图片请求接口", httpMethod = "POST",notes = "上传图片请求接口")
    public CommonResult<UploadImgResp> uploadImg(@RequestParam("file") MultipartFile file, HttpServletRequest request, HttpServletResponse response) throws IOException {
        return fileUploadService.uploadImg(file,request);
    }

    @PostMapping(value = "/upload")
    @ApiOperation(value = "上传文件请求接口", httpMethod = "POST",notes = "上传文件请求接口")
    public CommonResult<UploadResp> upload(@RequestParam("file") MultipartFile file, HttpServletRequest request, HttpServletResponse response) throws IOException{
        return fileUploadService.upload(file,request);
    }


}
