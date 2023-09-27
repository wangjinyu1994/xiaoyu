package com.xiaoyu.feign.order.service;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.feign.order.req.*;
import com.xiaoyu.feign.order.resp.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * WJY
 */
@FeignClient(value = "xiaoyu-provider-order")
public interface ProjectService {

    @PostMapping(value = "/sys/xiaoyu/order/project/selectProjectTable")
    TableResult<SelectProjectTableResp> selectProjectTable(SelectProjectTableReq req);

    @PostMapping(value = "/sys/xiaoyu/order/project/selectAllProject")
    CommonResult<List<SelectAllProjectResp>> selectAllProject(SelectAllProjectReq req);

    @PostMapping(value = "/sys/xiaoyu/order/project/selectProjectById")
    CommonResult<SelectProjectByIdResp> selectProjectById(SelectProjectByIdReq req);

    @PostMapping(value = "/sys/xiaoyu/order/project/addProjectInfo")
    CommonResult<AddProjectInfoResp> addProjectInfo(AddProjectInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/order/project/updateProjectInfo")
    CommonResult<UpdateProjectInfoResp> updateProjectInfo(UpdateProjectInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/order/project/deleteProjectInfo")
    CommonResult<DeleteProjectInfoResp> deleteProjectInfo(DeleteProjectInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/order/project/addProjectEnclosureInfo")
    CommonResult<AddProjectEnclosureInfoResp> addProjectEnclosureInfo(AddProjectEnclosureInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/project/addProjectEnclosureListInfo")
    CommonResult<AddProjectEnclosureListInfoResp> addProjectEnclosureListInfo(AddProjectEnclosureListInfo req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/project/updateProjectEnclosureInfo")
    CommonResult<UpdateProjectEnclosureInfoResp> updateProjectEnclosureInfo(UpdateProjectEnclosureInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/project/deleteProjectEnclosureInfo")
    CommonResult<DeleteProjectEnclosureInfoResp> deleteProjectEnclosureInfo(DeleteProjectEnclosureInfoReq req, HttpServletRequest request);
}
