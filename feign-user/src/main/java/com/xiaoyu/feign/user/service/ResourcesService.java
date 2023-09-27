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
public interface ResourcesService {

    @PostMapping(value = "/sys/xiaoyu/user/resources/selectResourcesTable")
    TableResult<SelectResourcesTableResp> selectResourcesTable(SelectResourcesTableReq req);

    @PostMapping(value = "/sys/xiaoyu/user/resources/selectAllResourcesList")
    CommonResult<List<SelectAllResourcesResp>> selectAllResourcesList(SelectAllResourcesReq req);

    @PostMapping(value = "/sys/xiaoyu/user/resources/selectResourcesById")
    CommonResult<SelectResourcesByIdResp> selectResourcesById(SelectResourcesByIdReq req);

    @PostMapping(value = "/sys/xiaoyu/user/resources/addResourcesInfo")
    CommonResult<AddResourcesInfoResp> addResourcesInfo(AddResourcesInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/resources/updateResourcesInfo")
    CommonResult<UpdateResourcesInfoResp> updateResourcesInfo(UpdateResourcesInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/resources/deleteResourcesInfo")
    CommonResult<DeleteResourcesInfoResp> deleteResourcesInfo(DeleteResourcesInfoReq req, HttpServletRequest request);
}
