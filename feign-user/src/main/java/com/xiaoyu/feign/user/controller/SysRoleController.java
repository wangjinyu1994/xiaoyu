package com.xiaoyu.feign.user.controller;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.feign.user.req.*;
import com.xiaoyu.feign.user.resp.*;
import com.xiaoyu.feign.user.service.RoleResourceService;
import com.xiaoyu.feign.user.service.SysRoleService;
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
@RequestMapping("/sys/xiaoyu/role")
@Api(tags = "系统角色控制器",description = "主要提供系统角色相关接口")
public class SysRoleController {

    @Autowired
    private SysRoleService sysRoleService;
    @Autowired
    private RoleResourceService roleResourceService;

    @PostMapping(value = "/selectRoleTable")
    @ApiOperation(value = "分页查询角色请求接口", httpMethod = "POST",notes = "分页查询角色请求接口")
    public TableResult<SelectRoleTableResp> selectRoleTable(@RequestBody @Valid SelectRoleTableReq req, HttpServletRequest request, HttpServletResponse response){
        return sysRoleService.selectRoleTable(req);
    }

    @PostMapping(value = "/selectAllRoleList")
    @ApiOperation(value = "查询所有角色请求接口", httpMethod = "POST",notes = "查询所有角色请求接口")
    public CommonResult<List<SelectAllRoleResp>> selectAllRoleList(@RequestBody @Valid SelectAllRoleReq req, HttpServletRequest request, HttpServletResponse response){
        return sysRoleService.selectAllRoleList(req);
    }

    @PostMapping(value = "/selectRoleById")
    @ApiOperation(value = "根据主键查询角色请求接口", httpMethod = "POST",notes = "根据主键查询角色请求接口")
    public CommonResult<SelectRoleByIdResp> selectRoleById(@RequestBody @Valid SelectRoleByIdReq req, HttpServletRequest request, HttpServletResponse response){
        return sysRoleService.selectRoleById(req);
    }

    @PostMapping(value = "/addRoleInfo")
    @ApiOperation(value = "添加角色详情请求接口", httpMethod = "POST",notes = "添加角色详情请求接口")
    public CommonResult<AddRoleInfoResp> addRoleInfo(@RequestBody @Valid AddRoleInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return sysRoleService.addRoleInfo(req,request);
    }

    @PostMapping(value = "/updateRoleInfo")
    @ApiOperation(value = "修改角色详情请求接口", httpMethod = "POST",notes = "修改角色详情请求接口")
    public CommonResult<UpdateRoleInfoResp> updateRoleInfo(@RequestBody @Valid UpdateRoleInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return sysRoleService.updateRoleInfo(req,request);
    }

    @PostMapping(value = "/deleteRoleInfo")
    @ApiOperation(value = "删除角色详情请求接口", httpMethod = "POST",notes = "删除角色详情请求接口")
    public CommonResult<DeleteRoleInfoResp> deleteRoleInfo(@RequestBody @Valid DeleteRoleInfoReq req, HttpServletRequest request, HttpServletResponse response){
        return sysRoleService.deleteRoleInfo(req,request);
    }

    @PostMapping(value = "/selectRoleResourceList")
    @ApiOperation(value = "查看角色资源详情请求接口", httpMethod = "POST",notes = "查看角色资源详情请求接口")
    public CommonResult<List<SelectRoleResourceResp>> selectRoleResourceList(@RequestBody @Valid SelectRoleResourceReq req, HttpServletRequest request, HttpServletResponse response){
        return roleResourceService.selectRoleResourceList(req);
    }

    @PostMapping(value = "/selectRoleResourceTable")
    @ApiOperation(value = "分页查看角色资源详情请求接口", httpMethod = "POST",notes = "分页查看角色资源详情请求接口")
    public TableResult<SelectRoleResourceTableResp> selectRoleResourceTable(@RequestBody @Valid SelectRoleResourceTableReq req, HttpServletRequest request, HttpServletResponse response){
        return roleResourceService.selectRoleResourceTable(req);
    }

    @PostMapping(value = "/selectRoleResourceById")
    @ApiOperation(value = "根据主键查看角色资源详情请求接口", httpMethod = "POST",notes = "根据主键查看角色资源详情请求接口")
    public CommonResult<SelectRoleResourceByIdResp> selectRoleResourceById(@RequestBody @Valid SelectRoleResourceByIdReq req, HttpServletRequest request, HttpServletResponse response){
        return roleResourceService.selectRoleResourceById(req);
    }

    @PostMapping(value = "/addRoleResourceInfo")
    @ApiOperation(value = "添加角色资源详情请求接口", httpMethod = "POST",notes = "添加角色资源详情请求接口")
    public CommonResult<AddRoleResourceResp> addRoleResourceInfo(@RequestBody @Valid AddRoleResourceReq req, HttpServletRequest request, HttpServletResponse response){
        return roleResourceService.addRoleResourceInfo(req,request);
    }

    @PostMapping(value = "/updateRoleResourceInfo")
    @ApiOperation(value = "修改角色资源详情请求接口", httpMethod = "POST",notes = "修改角色资源详情请求接口")
    public CommonResult<UpdateRoleResourceResp> updateRoleResourceInfo(@RequestBody @Valid UpdateRoleResourceReq req, HttpServletRequest request, HttpServletResponse response){
        return roleResourceService.updateRoleResourceInfo(req,request);
    }

    @PostMapping(value = "/deleteRoleResourceInfo")
    @ApiOperation(value = "删除角色资源详情请求接口", httpMethod = "POST",notes = "删除角色资源详情请求接口")
    public CommonResult<DeleteRoleResourceResp> deleteRoleResourceInfo(@RequestBody @Valid DeleteRoleResourceReq req, HttpServletRequest request, HttpServletResponse response){
        return roleResourceService.deleteRoleResourceInfo(req,request);
    }

}
