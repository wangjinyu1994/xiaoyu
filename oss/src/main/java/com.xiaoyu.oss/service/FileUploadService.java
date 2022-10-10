package com.xiaoyu.oss.service;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.oss.req.UploadBase64ImgReq;
import com.xiaoyu.oss.req.UploadLocalImgReq;
import com.xiaoyu.oss.resp.UploadBase64ImgResp;
import com.xiaoyu.oss.resp.UploadImgResp;
import com.xiaoyu.oss.resp.UploadLocalImgResp;
import com.xiaoyu.oss.resp.UploadResp;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * WJY
 */
public interface FileUploadService {
    CommonResult<UploadLocalImgResp> uploadLocalImg(UploadLocalImgReq req, HttpServletRequest request) throws FileNotFoundException;

    CommonResult<UploadBase64ImgResp> uploadBase64Img(UploadBase64ImgReq req, HttpServletRequest request) throws IOException;

    CommonResult<UploadImgResp> uploadImg(MultipartFile file, HttpServletRequest request) throws IOException;

    CommonResult<UploadResp> upload(MultipartFile file, HttpServletRequest request) throws IOException;
}
