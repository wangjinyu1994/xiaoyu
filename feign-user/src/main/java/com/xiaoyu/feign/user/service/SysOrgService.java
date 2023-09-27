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
public interface SysOrgService {

    @PostMapping(value = "/sys/xiaoyu/user/org/selectOrgTable")
    TableResult<SelectOrgTableResp> selectOrgTable(SelectOrgTableReq req);

    @PostMapping(value = "/sys/xiaoyu/user/org/selectAllOrgList")
    CommonResult<List<SelectAllOrgResp>> selectAllOrgList(SelectAllOrgReq req);

    @PostMapping(value = "/sys/xiaoyu/user/org/selectOrgById")
    CommonResult<SelectOrgByIdResp> selectOrgById(SelectOrgByIdReq req);

    @PostMapping(value = "/sys/xiaoyu/user/org/addOrgInfo")
    CommonResult<AddOrgInfoResp> addOrgInfo(AddOrgInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/org/updateOrgInfo")
    CommonResult<UpdateOrgInfoResp> updateOrgInfo(UpdateOrgInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/org/deleteOrgInfo")
    CommonResult<DeleteOrgInfoResp> deleteOrgInfo(DeleteOrgInfoReq req, HttpServletRequest request);
}
