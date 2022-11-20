package com.xiaoyu.feign.user.controller;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.feign.user.req.*;
import com.xiaoyu.feign.user.resp.*;
import com.xiaoyu.feign.user.service.SysUserService;
import io.swagger.annotations.ApiOperation;
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

    @Resource
    private SysUserService sysUserService;

    @PostMapping(value = "/updateSysUserPassword")
    @ApiOperation(value = "系统人员修改密码请求接口", httpMethod = "POST",notes = "系统人员修改密码请求接口")
    public CommonResult<SysUserUpdatePasswordResp> updateSysUserPassword(@RequestBody @Valid SysUserUpdatePasswordReq req){
        return sysUserService.updateSysUserPassword(req);
    }

    @PostMapping(value = "/updateSysUserInitPassword")
    @ApiOperation(value = "系统人员初始化密码请求接口", httpMethod = "POST",notes = "系统人员初始化密码请求接口")
    public CommonResult<SysUserInitPasswordResp> updateSysUserInitPassword(@RequestBody @Valid SysUserInitPasswordReq req){
        return sysUserService.updateSysUserInitPassword(req);
    }

    @PostMapping(value = "/updateSysyUserById")
    @ApiOperation(value = "修改系统人员信息表请求接口", httpMethod = "POST",notes = "修改系统人员信息表请求接口")
    public CommonResult<SysyUpdateUserResp> updateSysyUserById(@RequestBody @Valid SysyUpdateUserReq req)  {
        return sysUserService.updateSysyUserById(req);
    }

    @PostMapping(value = "/selectSysUserById")
    @ApiOperation(value = "根据人员主键查询人员信息请求接口", httpMethod = "POST",notes = "根据人员主键查询人员信息请求接口")
    public CommonResult<SysUserByIdResp> selectSysUserById(@RequestBody @Valid SysUserByIdReq req){
        return sysUserService.selectSysUserById(req);
    }

    @PostMapping(value = "/selectSysUserBaseById")
    @ApiOperation(value = "根据人员主键查询人员基础信息请求接口", httpMethod = "POST",notes = "根据人员主键查询人员基础信息请求接口")
    public CommonResult<SysUserBaseByIdResp> selectSysUserBaseById(@RequestBody @Valid SysUserBaseByIdReq req){
        return sysUserService.selectSysUserBaseById(req);
    }

    @PostMapping(value = "/updateSysUserBaseById")
    @ApiOperation(value = "修改人员基础信息请求接口", httpMethod = "POST",notes = "修改人员基础信息请求接口")
    public CommonResult<SysyUpdateUserBaseResp> updateSysUserBaseById(@RequestBody @Valid SysyUpdateUserBaseReq req){
        return sysUserService.updateSysUserBaseById(req);
    }

    @PostMapping(value = "/selectSysUserMemberOfFamilyById")
    @ApiOperation(value = "获取家庭成员信息请求接口", httpMethod = "POST",notes = "获取家庭成员信息请求接口")
    public CommonResult<List<SysUserMemberOfFamilyResp>> selectSysUserMemberOfFamilyById(@RequestBody @Valid SysUserBaseByIdReq req){
        return sysUserService.selectSysUserMemberOfFamilyById(req);
    }

    @PostMapping(value = "/updateUserMemberOfFamilyById")
    @ApiOperation(value = "更新家庭成员信息请求接口", httpMethod = "POST",notes = "更新家庭成员信息请求接口")
    public CommonResult<UpdateUserMemberOfFamilyResp> updateUserMemberOfFamilyById(@RequestBody @Valid UpdateUserMemberOfFamilyReq req){
        return sysUserService.updateUserMemberOfFamilyById(req);
    }

    @PostMapping(value = "/selectSysUserEducation")
    @ApiOperation(value = "获取人员教育情况请求接口", httpMethod = "POST",notes = "获取人员教育情况请求接口")
    public CommonResult<List<SysUserEducationResp>> selectSysUserEducation(@RequestBody @Valid SysUserEducationReq req){
        return sysUserService.selectSysUserEducation(req);
    }

    @PostMapping(value = "/sysUserEducation")
    @ApiOperation(value = "修改人员教育情况请求接口", httpMethod = "POST",notes = "修改人员教育情况请求接口")
    public CommonResult<List<SysUserEducationResp>> updateUserEducationById(@RequestBody @Valid SysUserEducationReq req)  {
        return sysUserService.updateUserEducationById(req);
    }

    @PostMapping(value = "/selectSysUserWorkExperience")
    @ApiOperation(value = "获取人员工作经历请求接口", httpMethod = "POST",notes = "获取人员工作经历请求接口")
    public CommonResult<List<SelectSysUserWorkExperienceResp>> selectSysUserWorkExperience(@RequestBody @Valid SelectSysUserWorkExperienceReq req){
        return sysUserService.selectSysUserWorkExperience(req);
    }

    @PostMapping(value = "/updateSysUserWorkExperienceById")
    @ApiOperation(value = "修改人员工作经历请求接口", httpMethod = "POST",notes = "修改人员工作经历请求接口")
    public CommonResult<UpdateSysUserWorkExperienceByIdResp> updateSysUserWorkExperienceById(@RequestBody @Valid UpdateSysUserWorkExperienceByIdReq req)  {
        return sysUserService.updateSysUserWorkExperienceById(req);
    }

    @PostMapping(value = "/addSysUserInfo")
    @ApiOperation(value = "添加系统人员信息接口", httpMethod = "POST",notes = "添加系统人员信息接口")
    public CommonResult<AddSysUserResp> addSysUserInfo(@RequestBody @Valid AddSysUserReq req)  {
        return sysUserService.addSysUserInfo(req);
    }

    @PostMapping(value = "/addSysBaseUserInfo")
    @ApiOperation(value = "添加系统人员基础信息接口", httpMethod = "POST",notes = "添加系统人员基础信息接口")
    public CommonResult<AddSysBaseUserResp> addSysBaseUserInfo(@RequestBody @Valid AddSysBaseUserReq req){
        return sysUserService.addSysBaseUserInfo(req);
    }

    @PostMapping(value = "/addUserMemberOfFamilyInfo")
    @ApiOperation(value = "添加系统人员家庭成员信息接口", httpMethod = "POST",notes = "添加系统人员家庭成员信息接口")
    public CommonResult<AddUserMemberOfFamilyInfoResp> addUserMemberOfFamilyInfo(@RequestBody @Valid AddUserMemberOfFamilyInfoReq req){
        return sysUserService.addUserMemberOfFamilyInfo(req);
    }

    @PostMapping(value = "/addUserEducationInfo")
    @ApiOperation(value = "添加人员教育情况请求接口", httpMethod = "POST",notes = "添加人员教育情况请求接口")
    public CommonResult<AddUserEducationInfoResp> addUserEducationInfo(@RequestBody @Valid AddUserEducationInfoReq req) {
        return sysUserService.addUserEducationInfo(req);
    }

    @PostMapping(value = "/addUserWorkExperienceInfo")
    @ApiOperation(value = "添加人员工作经历请求接口", httpMethod = "POST",notes = "添加人员工作经历请求接口")
    public CommonResult<AddUserWorkExperienceInfoResp> addUserWorkExperienceInfo(@RequestBody @Valid AddUserWorkExperienceInfoReq req)  {
        return sysUserService.addUserWorkExperienceInfo(req);
    }

}
