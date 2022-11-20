package com.xiaoyu.feign.user.service;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.feign.user.req.*;
import com.xiaoyu.feign.user.resp.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;


/**
 * WJY
 */
@FeignClient(value = "xiaoyu-provider-user")
public interface SysUserService {
    
    @PostMapping(value = "/sys/xiaoyu/user/updateSysUserPassword")
    public CommonResult<SysUserUpdatePasswordResp> updateSysUserPassword(SysUserUpdatePasswordReq req);

    @PostMapping(value = "/sys/xiaoyu/user/updateSysUserInitPassword")
    public CommonResult<SysUserInitPasswordResp> updateSysUserInitPassword(SysUserInitPasswordReq req);

    @PostMapping(value = "/sys/xiaoyu/user/updateSysyUserById")
    public CommonResult<SysyUpdateUserResp> updateSysyUserById(SysyUpdateUserReq req);

    @PostMapping(value = "/sys/xiaoyu/user/selectSysUserById")
    public CommonResult<SysUserByIdResp> selectSysUserById(SysUserByIdReq req);

    @PostMapping(value = "/sys/xiaoyu/user/selectSysUserBaseById")
    public CommonResult<SysUserBaseByIdResp> selectSysUserBaseById(SysUserBaseByIdReq req);

    @PostMapping(value = "/sys/xiaoyu/user/updateSysUserBaseById")
    public CommonResult<SysyUpdateUserBaseResp> updateSysUserBaseById(SysyUpdateUserBaseReq req);

    @PostMapping(value = "/sys/xiaoyu/user/selectSysUserMemberOfFamilyById")
    public CommonResult<List<SysUserMemberOfFamilyResp>> selectSysUserMemberOfFamilyById(SysUserBaseByIdReq req);

    @PostMapping(value = "/sys/xiaoyu/user/updateUserMemberOfFamilyById")
    public CommonResult<UpdateUserMemberOfFamilyResp> updateUserMemberOfFamilyById(UpdateUserMemberOfFamilyReq req);

    @PostMapping(value = "/sys/xiaoyu/user/selectSysUserEducation")
    public CommonResult<List<SysUserEducationResp>> selectSysUserEducation(SysUserEducationReq req);

    @PostMapping(value = "/sys/xiaoyu/user/updateUserEducationById")
    public CommonResult<List<SysUserEducationResp>> updateUserEducationById(SysUserEducationReq req);

    @PostMapping(value = "/sys/xiaoyu/user/selectSysUserWorkExperience")
    public CommonResult<List<SelectSysUserWorkExperienceResp>> selectSysUserWorkExperience(SelectSysUserWorkExperienceReq req);

    @PostMapping(value = "/sys/xiaoyu/user/updateSysUserWorkExperienceById")
    public CommonResult<UpdateSysUserWorkExperienceByIdResp> updateSysUserWorkExperienceById(UpdateSysUserWorkExperienceByIdReq req);

    @PostMapping(value = "/sys/xiaoyu/user/addSysUserInfo")
    public CommonResult<AddSysUserResp> addSysUserInfo(AddSysUserReq req);

    @PostMapping(value = "/sys/xiaoyu/user/addSysBaseUserInfo")
    public CommonResult<AddSysBaseUserResp> addSysBaseUserInfo(AddSysBaseUserReq req);

    @PostMapping(value = "/sys/xiaoyu/user/addUserMemberOfFamilyInfo")
    public CommonResult<AddUserMemberOfFamilyInfoResp> addUserMemberOfFamilyInfo(AddUserMemberOfFamilyInfoReq req);

    @PostMapping(value = "/sys/xiaoyu/user/addUserEducationInfo")
    public CommonResult<AddUserEducationInfoResp> addUserEducationInfo(AddUserEducationInfoReq req);

    @PostMapping(value = "/sys/xiaoyu/user/addUserWorkExperienceInfo")
    public CommonResult<AddUserWorkExperienceInfoResp> addUserWorkExperienceInfo(AddUserWorkExperienceInfoReq req);
}
