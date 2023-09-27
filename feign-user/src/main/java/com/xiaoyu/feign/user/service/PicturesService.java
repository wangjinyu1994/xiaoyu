package com.xiaoyu.feign.user.service;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.feign.user.req.*;
import com.xiaoyu.feign.user.resp.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * WJY
 */
@FeignClient(value = "xiaoyu-provider-user")
public interface PicturesService {

    @PostMapping(value = "/sys/xiaoyu/user/pictures/selectPicturesTable")
    TableResult<SelectPicturesTableResp> selectPicturesTable(SelectPicturesTableReq req);

    @PostMapping(value = "/sys/xiaoyu/user/pictures/selectAllPicturesList")
    CommonResult<List<SelectPicturesResp>> selectAllPicturesList(SelectPicturesReq req);

    @PostMapping(value = "/sys/xiaoyu/user/pictures/selectPicturesById")
    CommonResult<SelectPicturesByIdResp> selectPicturesById(SelectPicturesByIdReq req);

    @PostMapping(value = "/sys/xiaoyu/user/pictures/addPicturesInfo")
    CommonResult<AddPicturesInfoResp> addPicturesInfo(AddPicturesInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/pictures/updatePicturesInfo")
    CommonResult<UpdatePicturesInfoResp> updatePicturesInfo(UpdatePicturesInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/pictures/deletePicturesInfo")
    CommonResult<DeletePicturesInfoResp> deletePicturesInfo(DeletePicturesInfoReq req, HttpServletRequest request);
}
