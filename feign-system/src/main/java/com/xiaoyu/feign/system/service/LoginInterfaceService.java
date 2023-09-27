package com.xiaoyu.feign.system.service;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.feign.system.req.*;
import com.xiaoyu.feign.system.resp.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * WJY
 */
@FeignClient(value = "xiaoyu-provider-system")
public interface LoginInterfaceService {

    @PostMapping(value = "/sys/xiaoyu/system/loginInterface/selectLoginInterfaceList")
    CommonResult<List<SelectLoginInterlistListResp>> selectLoginInterfaceList(SelectLoginInterListReq req);

    @PostMapping(value = "/sys/xiaoyu/system/loginInterface/selectLoginInterfacelistTable")
    TableResult<SelectLoginInterTableResp> selectLoginInterfacelistTable(SelectLoginInterTableReq req);

    @PostMapping(value = "/sys/xiaoyu/system/loginInterface/updateLoginInterfaceById")
    CommonResult<UpdateLoginInterByIdResp> updateLoginInterfaceById(UpdateLoginInterByIdReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/system/loginInterface/deleteLoginInterfaceById")
    CommonResult<DeleteLoginInterByIdResp> deleteLoginInterfaceById(DeleteLoginInterByIdReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/system/loginInterface/addLoginInterfaceInfo")
    CommonResult<AddLoginInterInfoResp> addLoginInterfaceInfo(AddLoginInterInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/system/loginInterface/addLoginInterfaceListInfo")
    CommonResult<AddLoginInterListInfoResp> addLoginInterfaceListInfo(AddLoginInterListInfoReq req, HttpServletRequest request);
}
