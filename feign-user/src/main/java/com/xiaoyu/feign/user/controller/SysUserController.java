package com.xiaoyu.feign.user.controller;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.feign.user.req.*;
import com.xiaoyu.feign.user.resp.*;
import com.xiaoyu.feign.user.service.SysUserOrgService;
import com.xiaoyu.feign.user.service.SysUserRoleService;
import com.xiaoyu.feign.user.service.SysUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.text.ParseException;
import java.util.List;

/**
 * WJY
 */
@RestController
@RequestMapping("/sys/xiaoyu/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysUserRoleService sysUserRoleService;
    @Autowired
    private SysUserOrgService sysUserOrgService;

    @PostMapping(value = "/updateSysUserPassword")
    @ApiOperation(value = "系统人员修改密码请求接口", httpMethod = "POST",notes = "系统人员修改密码请求接口")
    public CommonResult<SysUserUpdatePasswordResp> updateSysUserPassword(@RequestBody @Valid SysUserUpdatePasswordReq req, HttpServletRequest request, HttpServletResponse response){
        return sysUserService.updateSysUserPassword(req);
    }

    @PostMapping(value = "/updateSysUserInitPassword")
    @ApiOperation(value = "系统人员初始化密码请求接口", httpMethod = "POST",notes = "系统人员初始化密码请求接口")
    public CommonResult<SysUserInitPasswordResp> updateSysUserInitPassword(@RequestBody @Valid SysUserInitPasswordReq req, HttpServletRequest request, HttpServletResponse response){
        return sysUserService.updateSysUserInitPassword(req);
    }

    @PostMapping(value = "/updateSysyUserById")
    @ApiOperation(value = "修改系统人员信息表请求接口", httpMethod = "POST",notes = "修改系统人员信息表请求接口")
    public CommonResult<SysyUpdateUserResp> updateSysyUserById(@RequestBody @Valid SysyUpdateUserReq req, HttpServletRequest request, HttpServletResponse response) throws ParseException {
        return sysUserService.updateSysyUserById(req);
    }

    @PostMapping(value = "/selectSysUserById")
    @ApiOperation(value = "根据人员主键查询人员信息请求接口", httpMethod = "POST",notes = "根据人员主键查询人员信息请求接口")
    public CommonResult<SysUserByIdResp> selectSysUserById(@RequestBody @Valid SysUserByIdReq req, HttpServletRequest request, HttpServletResponse response){
        return sysUserService.selectSysUserById(req);
    }

    @PostMapping(value = "/selectSysUserBaseById")
    @ApiOperation(value = "根据人员主键查询人员基础信息请求接口", httpMethod = "POST",notes = "根据人员主键查询人员基础信息请求接口")
    public CommonResult<SysUserBaseByIdResp> selectSysUserBaseById(@RequestBody @Valid SysUserBaseByIdReq req, HttpServletRequest request, HttpServletResponse response){
        return sysUserService.selectSysUserBaseById(req);
    }

    @PostMapping(value = "/updateSysUserBaseById")
    @ApiOperation(value = "修改人员基础信息请求接口", httpMethod = "POST",notes = "修改人员基础信息请求接口")
    public CommonResult<SysyUpdateUserBaseResp> updateSysUserBaseById(@RequestBody @Valid SysyUpdateUserBaseReq req,HttpServletRequest request, HttpServletResponse response){
        return sysUserService.updateSysUserBaseById(req);
    }

    @PostMapping(value = "/selectSysUserMemberOfFamilyById")
    @ApiOperation(value = "获取家庭成员信息请求接口", httpMethod = "POST",notes = "获取家庭成员信息请求接口")
    public CommonResult<List<SysUserMemberOfFamilyResp>> selectSysUserMemberOfFamilyById(@RequestBody @Valid SysUserBaseByIdReq req, HttpServletRequest request, HttpServletResponse response){
        return sysUserService.selectSysUserMemberOfFamilyById(req);
    }

    @PostMapping(value = "/updateUserMemberOfFamilyById")
    @ApiOperation(value = "更新家庭成员信息请求接口", httpMethod = "POST",notes = "更新家庭成员信息请求接口")
    public CommonResult<UpdateUserMemberOfFamilyResp> updateUserMemberOfFamilyById(@RequestBody @Valid UpdateUserMemberOfFamilyReq req,HttpServletRequest request, HttpServletResponse response){
        return sysUserService.updateUserMemberOfFamilyById(req);
    }

    @PostMapping(value = "/selectSysUserEducation")
    @ApiOperation(value = "获取人员教育情况请求接口", httpMethod = "POST",notes = "获取人员教育情况请求接口")
    public CommonResult<List<SysUserEducationResp>> selectSysUserEducation(@RequestBody @Valid SysUserEducationReq req,HttpServletRequest request, HttpServletResponse response){
        return sysUserService.selectSysUserEducation(req);
    }

    @PostMapping(value = "/sysUserEducation")
    @ApiOperation(value = "修改人员教育情况请求接口", httpMethod = "POST",notes = "修改人员教育情况请求接口")
    public CommonResult<List<SysUserEducationResp>> updateUserEducationById(@RequestBody @Valid SysUserEducationReq req,HttpServletRequest request, HttpServletResponse response) throws ParseException {
        return sysUserService.updateUserEducationById(req);
    }

    @PostMapping(value = "/selectSysUserWorkExperience")
    @ApiOperation(value = "获取人员工作经历请求接口", httpMethod = "POST",notes = "获取人员工作经历请求接口")
    public CommonResult<List<SelectSysUserWorkExperienceResp>> selectSysUserWorkExperience(@RequestBody @Valid SelectSysUserWorkExperienceReq req,HttpServletRequest request, HttpServletResponse response){
        return sysUserService.selectSysUserWorkExperience(req);
    }

    @PostMapping(value = "/updateSysUserWorkExperienceById")
    @ApiOperation(value = "修改人员工作经历请求接口", httpMethod = "POST",notes = "修改人员工作经历请求接口")
    public CommonResult<UpdateSysUserWorkExperienceByIdResp> updateSysUserWorkExperienceById(@RequestBody @Valid UpdateSysUserWorkExperienceByIdReq req,HttpServletRequest request, HttpServletResponse response) throws ParseException {
        return sysUserService.updateSysUserWorkExperienceById(req);
    }

    @PostMapping(value = "/addSysUserInfo")
    @ApiOperation(value = "添加系统人员信息接口", httpMethod = "POST",notes = "添加系统人员信息接口")
    public CommonResult<AddSysUserResp> addSysUserInfo(@RequestBody @Valid AddSysUserReq req,HttpServletRequest request, HttpServletResponse response) throws ParseException {
        return sysUserService.addSysUserInfo(req);
    }

    @PostMapping(value = "/addSysBaseUserInfo")
    @ApiOperation(value = "添加系统人员基础信息接口", httpMethod = "POST",notes = "添加系统人员基础信息接口")
    public CommonResult<AddSysBaseUserResp> addSysBaseUserInfo(@RequestBody @Valid AddSysBaseUserReq req,HttpServletRequest request, HttpServletResponse response){
        return sysUserService.addSysBaseUserInfo(req);
    }

    @PostMapping(value = "/addUserMemberOfFamilyInfo")
    @ApiOperation(value = "添加系统人员家庭成员信息接口", httpMethod = "POST",notes = "添加系统人员家庭成员信息接口")
    public CommonResult<AddUserMemberOfFamilyInfoResp> addUserMemberOfFamilyInfo(@RequestBody @Valid AddUserMemberOfFamilyInfoReq req,HttpServletRequest request, HttpServletResponse response){
        return sysUserService.addUserMemberOfFamilyInfo(req);
    }

    @PostMapping(value = "/addUserEducationInfo")
    @ApiOperation(value = "添加人员教育情况请求接口", httpMethod = "POST",notes = "添加人员教育情况请求接口")
    public CommonResult<AddUserEducationInfoResp> addUserEducationInfo(@RequestBody @Valid AddUserEducationInfoReq req,HttpServletRequest request, HttpServletResponse response) throws ParseException {
        return sysUserService.addUserEducationInfo(req);
    }

    @PostMapping(value = "/addUserWorkExperienceInfo")
    @ApiOperation(value = "添加人员工作经历请求接口", httpMethod = "POST",notes = "添加人员工作经历请求接口")
    public CommonResult<AddUserWorkExperienceInfoResp> addUserWorkExperienceInfo(@RequestBody @Valid AddUserWorkExperienceInfoReq req,HttpServletRequest request, HttpServletResponse response) throws ParseException {
        return sysUserService.addUserWorkExperienceInfo(req);
    }

    @PostMapping(value = "/addUserRoleInfo")
    @ApiOperation(value = "添加人员角色请求接口", httpMethod = "POST",notes = "添加人员角色请求接口")
    public CommonResult<AddUserRoleInfoResp> addUserRoleInfo(@RequestBody @Valid AddUserRoleInfoReq req,HttpServletRequest request, HttpServletResponse response){
        return sysUserRoleService.addUserRoleInfo(req,request);
    }

    @PostMapping(value = "/updateUserRoleInfo")
    @ApiOperation(value = "修改人员角色请求接口", httpMethod = "POST",notes = "修改人员角色请求接口")
    public CommonResult<UpdateUserRoleInfoResp> updateUserRoleInfo(@RequestBody @Valid UpdateUserRoleInfoReq req,HttpServletRequest request, HttpServletResponse response){
        return sysUserRoleService.updateUserRoleInfo(req,request);
    }

    @PostMapping(value = "/deleteUserRoleInfo")
    @ApiOperation(value = "删除人员角色请求接口", httpMethod = "POST",notes = "删除人员角色请求接口")
    public CommonResult<DeleteUserRoleInfoResp> deleteUserRoleInfo(@RequestBody @Valid DeleteUserRoleInfoReq req,HttpServletRequest request, HttpServletResponse response){
        return sysUserRoleService.deleteUserRoleInfo(req,request);
    }

    @PostMapping(value = "/selectUserByOrgIdResp")
    @ApiOperation(value = "根据机构主键分页查询人员请求接口", httpMethod = "POST",notes = "根据机构主键分页查询人员请求接口")
    public TableResult<SelectUserByOrgIdResp> selectUserByOrgIdResp(@RequestBody @Valid SelectUserByOrgIdReq req, HttpServletRequest request, HttpServletResponse response){
        return sysUserOrgService.selectUserByOrgIdResp(req);
    }

    @PostMapping(value = "/addUserOrgInfo")
    @ApiOperation(value = "添加人员机构请求接口", httpMethod = "POST",notes = "添加人员机构请求接口")
    public CommonResult<AddUserOrgInfoResp> addUserOrgInfo(@RequestBody @Valid AddUserOrgInfoReq req,HttpServletRequest request, HttpServletResponse response){
        return sysUserOrgService.addUserOrgInfo(req,request);
    }

    @PostMapping(value = "/updateUserOrgInfo")
    @ApiOperation(value = "修改人员机构请求接口", httpMethod = "POST",notes = "修改人员机构请求接口")
    public CommonResult<UpdateUserOrgInfoResp> updateUserOrgInfo(@RequestBody @Valid UpdateUserOrgInfoReq req,HttpServletRequest request, HttpServletResponse response){
        return sysUserOrgService.updateUserOrgInfo(req,request);
    }

    @PostMapping(value = "/deleteUserOrgInfo")
    @ApiOperation(value = "删除人员机构请求接口", httpMethod = "POST",notes = "删除人员机构请求接口")
    public CommonResult<DeleteUserOrgInfoResp> deleteUserOrgInfo(@RequestBody @Valid DeleteUserOrgInfoReq req,HttpServletRequest request, HttpServletResponse response){
        return sysUserOrgService.deleteUserOrgInfo(req,request);
    }

    @PostMapping(value = "/selectUserRoleByUserId")
    @ApiOperation(value = "根据人员主键查询角色信息请求接口", httpMethod = "POST",notes = "根据人员主键查询角色信息请求接口")
    public CommonResult<List<SelectUserRoleByUserIdResp>> selectUserRoleByUserId(@RequestBody @Valid SelectUserRoleByUserIdReq req,HttpServletRequest request, HttpServletResponse response){
        return sysUserRoleService.selectUserRoleByUserId(req);
    }

}
