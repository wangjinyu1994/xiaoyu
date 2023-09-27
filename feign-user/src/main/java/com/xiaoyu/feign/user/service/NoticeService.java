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
public interface NoticeService {

    @PostMapping(value = "/sys/xiaoyu/user/notice/selectNoticTable")
    TableResult<SelectNoticTableResp> selectNoticTable(SelectNoticTableReq req);

    @PostMapping(value = "/sys/xiaoyu/user/notice/selectNoticIndex")
    CommonResult<List<SelectNoticIndexResp>> selectNoticIndex(SelectNoticIndexReq req);

    @PostMapping(value = "/sys/xiaoyu/user/notice/selectNoticById")
    CommonResult<SelectNoticByIdResp> selectNoticById(SelectNoticByIdReq req);

    @PostMapping(value = "/sys/xiaoyu/user/notice/addNoticInfo")
    CommonResult<AddNoticInfoResp> addNoticInfo(AddNoticInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/notice/updateNoticInfo")
    CommonResult<UpdateNoticInfoResp> updateNoticInfo(UpdateNoticInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/notice/deleteNoticInfo")
    CommonResult<DeleteNoticInfoResp> deleteNoticInfo(DeleteNoticInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/notice/addNoticEnclosureInfo")
    CommonResult<AddNoticEnclosureInfoResp> addNoticEnclosureInfo(AddNoticEnclosureInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/notice/addNoticEnclosureListInfo")
    CommonResult<AddNoticEnclosureInfoResp> addNoticEnclosureListInfo(AddNoticEnclosureListInfo req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/notice/updateNoticEnclosureInfo")
    CommonResult<UpdateNoticEnclosureInfoResp> updateNoticEnclosureInfo(UpdateNoticEnclosureInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/notice/deleteNoticEnclosureInfo")
    CommonResult<DeleteNoticEnclosureInfoResp> deleteNoticEnclosureInfo(DeleteNoticEnclosureInfoReq req, HttpServletRequest request);

}
