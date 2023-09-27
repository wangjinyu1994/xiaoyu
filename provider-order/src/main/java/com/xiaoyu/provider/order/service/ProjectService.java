package com.xiaoyu.provider.order.service;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.provider.order.req.*;
import com.xiaoyu.provider.order.resp.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * WJY
 */
public interface ProjectService {
    TableResult<SelectProjectTableResp> selectProjectTable(SelectProjectTableReq req);

    CommonResult<List<SelectAllProjectResp>> selectAllProject(SelectAllProjectReq req);

    CommonResult<SelectProjectByIdResp> selectProjectById(SelectProjectByIdReq req);

    CommonResult<AddProjectInfoResp> addProjectInfo(AddProjectInfoReq req, HttpServletRequest request);

    CommonResult<UpdateProjectInfoResp> updateProjectInfo(UpdateProjectInfoReq req, HttpServletRequest request);

    CommonResult<DeleteProjectInfoResp> deleteProjectInfo(DeleteProjectInfoReq req, HttpServletRequest request);

    CommonResult<AddProjectEnclosureInfoResp> addProjectEnclosureInfo(AddProjectEnclosureInfoReq req, HttpServletRequest request);

    CommonResult<AddProjectEnclosureListInfoResp> addProjectEnclosureListInfo(AddProjectEnclosureListInfo req, HttpServletRequest request);

    CommonResult<UpdateProjectEnclosureInfoResp> updateProjectEnclosureInfo(UpdateProjectEnclosureInfoReq req, HttpServletRequest request);

    CommonResult<DeleteProjectEnclosureInfoResp> deleteProjectEnclosureInfo(DeleteProjectEnclosureInfoReq req, HttpServletRequest request);
}
