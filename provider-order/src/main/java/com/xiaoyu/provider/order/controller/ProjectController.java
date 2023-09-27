package com.xiaoyu.provider.order.controller;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.provider.order.req.*;
import com.xiaoyu.provider.order.resp.*;
import com.xiaoyu.provider.order.service.ProjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

/**
 * WJY
 */
@RestController
@RequestMapping("/sys/xiaoyu/order/project")
@Api(tags = "系统团购项目控制器",description = "主要提供系统团购项目相关接口")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping(value = "/selectProjectTable")
    @ApiOperation(value = "分页查询团购项目请求接口", httpMethod = "POST",notes = "分页查询团购项目请求接口")
    public TableResult<SelectProjectTableResp> selectProjectTable(@RequestBody @Valid SelectProjectTableReq req, HttpServletRequest request, HttpServletResponse response){
        return projectService.selectProjectTable(req);
    }

    @PostMapping(value = "/selectAllProject")
    @ApiOperation(value = "查询全部团购项目请求接口", httpMethod = "POST",notes = "查询全部团购项目请求接口")
    public CommonResult<List<SelectAllProjectResp>> selectAllProject(@RequestBody @Valid SelectAllProjectReq req, HttpServletRequest request, HttpServletResponse response){
        return projectService.selectAllProject(req);
    }

    @PostMapping(value = "/selectProjectById")
    @ApiOperation(value = "根据主键查询团购项目请求接口", httpMethod = "POST",notes = "根据主键查询团购项目请求接口")
    public CommonResult<SelectProjectByIdResp> selectProjectById(@RequestBody @Valid SelectProjectByIdReq req, HttpServletRequest request, HttpServletResponse response){
        return projectService.selectProjectById(req);
    }

    @PostMapping(value = "/addProjectInfo")
    @ApiOperation(value = "添加团购项目详情请求接口", httpMethod = "POST",notes = "添加团购项目详情请求接口")
    public CommonResult<AddProjectInfoResp> addProjectInfo(@RequestBody @Valid AddProjectInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return projectService.addProjectInfo(req,request);
    }

    @PostMapping(value = "/updateProjectInfo")
    @ApiOperation(value = "修改团购项目详情请求接口", httpMethod = "POST",notes = "修改团购项目详情请求接口")
    public CommonResult<UpdateProjectInfoResp> updateProjectInfo(@RequestBody @Valid UpdateProjectInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return projectService.updateProjectInfo(req,request);
    }

    @PostMapping(value = "/deleteProjectInfo")
    @ApiOperation(value = "删除团购项目详情请求接口", httpMethod = "POST",notes = "删除团购项目详情请求接口")
    public CommonResult<DeleteProjectInfoResp> deleteProjectInfo(@RequestBody @Valid DeleteProjectInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return projectService.deleteProjectInfo(req,request);
    }

    @PostMapping(value = "/addProjectEnclosureInfo")
    @ApiOperation(value = "添加团购项目附件请求接口", httpMethod = "POST",notes = "添加团购项目附件请求接口")
    public CommonResult<AddProjectEnclosureInfoResp> addProjectEnclosureInfo(@RequestBody @Valid AddProjectEnclosureInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return projectService.addProjectEnclosureInfo(req,request);
    }

    @PostMapping(value = "/addProjectEnclosureListInfo")
    @ApiOperation(value = "添加团购项目附件请求接口", httpMethod = "POST",notes = "添加团购项目附件请求接口")
    public CommonResult<AddProjectEnclosureListInfoResp> addProjectEnclosureListInfo(@RequestBody @Valid AddProjectEnclosureListInfo req, HttpServletRequest request, HttpServletResponse response){
        return projectService.addProjectEnclosureListInfo(req,request);
    }

    @PostMapping(value = "/updateProjectEnclosureInfo")
    @ApiOperation(value = "修改团购项目附件请求接口", httpMethod = "POST",notes = "修改团购项目附件请求接口")
    public CommonResult<UpdateProjectEnclosureInfoResp> updateProjectEnclosureInfo(@RequestBody @Valid UpdateProjectEnclosureInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return projectService.updateProjectEnclosureInfo(req,request);
    }

    @PostMapping(value = "/deleteProjectEnclosureInfo")
    @ApiOperation(value = "删除团购项目附件请求接口", httpMethod = "POST",notes = "删除团购项目附件请求接口")
    public CommonResult<DeleteProjectEnclosureInfoResp> deleteProjectEnclosureInfo(@RequestBody @Valid DeleteProjectEnclosureInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return projectService.deleteProjectEnclosureInfo(req,request);
    }

}
