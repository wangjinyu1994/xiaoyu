package com.xiaoyu.feign.user.service;



import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.feign.user.req.*;
import com.xiaoyu.feign.user.resp.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * WJY
 */
@FeignClient(value = "xiaoyu-provider-user")
public interface CoreService {

    @PostMapping(value = "/sys/xiaoyu/user/core/selectCoreInfo")
    TableResult<SelectCoreDataResp> selectCoreInfo(SelectCoreInfoReq req);

    @PostMapping(value = "/sys/xiaoyu/user/core/selectCoreContentById")
    CommonResult<SelectCoreContentInfoResp> selectCoreContentById(SelectCoreContentInfoReq req);

    @PostMapping(value = "/sys/xiaoyu/user/core/selectCoreDetailsById")
    CommonResult<SelectCoreDetailsInfoResp> selectCoreDetailsById(SelectCoreDetailsInfoReq req);

    @PostMapping(value = "/sys/xiaoyu/user/core/addCoreContentInfo")
    CommonResult<AddCoreContentInfoResp> addCoreContentInfo(AddCoreContentInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/core/updateCoreContentInfo")
    CommonResult<UpdateCoreContentInfoResp> updateCoreContentInfo(UpdateCoreContentInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/core/deleteCoreContentInfo")
    CommonResult<DeleteCoreContentInfoResp> deleteCoreContentInfo(DeleteCoreContentInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/core/addCoreDetailsInfo")
    CommonResult<AddCoreDetailsInfoResp> addCoreDetailsInfo(AddCoreDetailsInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/core/updateCoreDetailsInfo")
    CommonResult<UpdateCoreDetailsInfoResp> updateCoreDetailsInfo(UpdateCoreDetailsInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/core/deleteCoreDetailsInfo")
    CommonResult<DeleteCoreDetailsInfoResp> deleteCoreDetailsInfo(DeleteCoreDetailsInfoReq req, HttpServletRequest request);
}
