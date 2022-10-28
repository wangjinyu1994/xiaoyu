package com.xiaoyu.oss.service.impl;

import com.aliyun.oss.OSS;
import com.xiaoyu.common.base.util.DateUtil;
import com.xiaoyu.api.util.FileUtil;
import com.xiaoyu.api.util.UUIDUtil;
import com.xiaoyu.common.base.constants.SymbolEnum;
import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.oss.req.UploadBase64ImgReq;
import com.xiaoyu.oss.req.UploadLocalImgReq;
import com.xiaoyu.oss.resp.UploadBase64ImgResp;
import com.xiaoyu.oss.resp.UploadImgResp;
import com.xiaoyu.oss.resp.UploadLocalImgResp;
import com.xiaoyu.oss.resp.UploadResp;
import com.xiaoyu.oss.service.FileUploadService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.BASE64Decoder;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

/**
 * WJY
 */
@Service
@Slf4j
@RefreshScope
public class FileUploadServiceImpl implements FileUploadService {

    @Value("${config.bucketName}")
    public String bucketName;

    @Value("${config.objectName}")
    public String objectNamePrefix;

    @Value("${config.fileName}")
    public String fileName;

    @Autowired
    private OSS ossClient;

    @Override
    public CommonResult<UploadLocalImgResp> uploadLocalImg(UploadLocalImgReq req, HttpServletRequest request) throws FileNotFoundException {
        UploadLocalImgResp resp = new UploadLocalImgResp();
        resp.setName(UUIDUtil.getUUIDShort() + FileUtil.getSuffix(req.getName()));
        resp.setOldName(req.getName());
        String objectName = objectNamePrefix + DateUtil.formatDate2Str(new Date(), DateUtil.DATE_PATTERN_8) + SymbolEnum.TY_XIEGANG.getCode() + resp.getName();
        ossClient.putObject(bucketName,objectName,new FileInputStream(req.getPath()));
        resp.setPath(fileName + objectName);
        return CommonResult.success(resp);
    }

    @Override
    public CommonResult<UploadBase64ImgResp> uploadBase64Img(UploadBase64ImgReq req, HttpServletRequest request) throws IOException {
        UploadBase64ImgResp resp = new UploadBase64ImgResp();
        resp.setName(UUIDUtil.getUUIDShort() + FileUtil.getSuffixBase64(req.getBase64()));
        resp.setOldName(req.getName());
        String objectName = objectNamePrefix + DateUtil.formatDate2Str(new Date(), DateUtil.DATE_PATTERN_8) + SymbolEnum.TY_XIEGANG.getCode() + resp.getName();
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] bytes = decoder.decodeBuffer(req.getBase64().replaceAll(FileUtil.getBase64Prefix(req.getBase64()),""));
        ossClient.putObject(bucketName,objectName,new ByteArrayInputStream(bytes));
        resp.setPath(fileName + objectName);
        return CommonResult.success(resp);
    }

    @Override
    public CommonResult<UploadImgResp> uploadImg(MultipartFile file, HttpServletRequest request) throws IOException {
        UploadImgResp resp = new UploadImgResp();
        resp.setName(UUIDUtil.getUUIDShort() + FileUtil.getSuffix(file.getOriginalFilename()));
        resp.setOldName(file.getOriginalFilename());
        String objectName = objectNamePrefix + DateUtil.formatDate2Str(new Date(), DateUtil.DATE_PATTERN_8) + SymbolEnum.TY_XIEGANG.getCode() + resp.getName();
        ossClient.putObject(bucketName,objectName,file.getInputStream());
        resp.setPath(fileName + objectName);
        return CommonResult.success(resp);
    }

    @Override
    public CommonResult<UploadResp> upload(MultipartFile file, HttpServletRequest request) throws IOException {
        UploadResp resp = new UploadResp();
        resp.setName(UUIDUtil.getUUIDShort() + FileUtil.getSuffix(file.getOriginalFilename()));
        resp.setOldName(file.getOriginalFilename());
        String objectName = objectNamePrefix + DateUtil.formatDate2Str(new Date(), DateUtil.DATE_PATTERN_8) + SymbolEnum.TY_XIEGANG.getCode() + resp.getName();
        ossClient.putObject(bucketName,objectName,file.getInputStream());
        resp.setPath(fileName + objectName);
        return CommonResult.success(resp);
    }


}
