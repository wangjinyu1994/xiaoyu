package com.xiaoyu.provider.user.service;


import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.provider.user.req.*;
import com.xiaoyu.provider.user.resp.*;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.List;


/**
 * WJY
 */
public interface SysUserService {

    /**
     * 系统人员修改密码请求接口
     */
    CommonResult<SysUserUpdatePasswordResp> updateSysUserPassword(SysUserUpdatePasswordReq req, HttpServletRequest request);

    /**
     * 系统人员初始化密码请求接口
     */
    CommonResult<SysUserInitPasswordResp> updateSysUserInitPassword(SysUserInitPasswordReq req, HttpServletRequest request);

    /**
     * 修改系统人员信息表请求接口
     */
    CommonResult<SysyUpdateUserResp> updateSysyUserById(SysyUpdateUserReq req, HttpServletRequest request) throws ParseException;

    /**
     * 根据人员主键查询人员信息请求接口
     */
    CommonResult<SysUserByIdResp> selectSysUserById(SysUserByIdReq req, HttpServletRequest request);

    /**
     * 根据人员主键查询人员基础信息请求接口
     */
    CommonResult<SysUserBaseByIdResp> selectSysUserBaseById(SysUserBaseByIdReq req, HttpServletRequest request);

    /**
     * 修改人员基础信息请求接口
     */
    CommonResult<SysyUpdateUserBaseResp> updateSysUserBaseById(SysyUpdateUserBaseReq req, HttpServletRequest request);

    /**
     * 获取家庭成员信息请求接口
     */
    CommonResult<List<SysUserMemberOfFamilyResp>> selectSysUserMemberOfFamilyById(SysUserBaseByIdReq req, HttpServletRequest request);

    /**
     * 更新家庭成员信息请求接口
     */
    CommonResult<UpdateUserMemberOfFamilyResp> updateUserMemberOfFamilyById(UpdateUserMemberOfFamilyReq req, HttpServletRequest request);

    /**
     * 获取人员教育情况请求接口
     */
    CommonResult<List<SysUserEducationResp>> selectSysUserEducation(SysUserEducationReq req, HttpServletRequest request);

    /**
     * 修改人员教育情况请求接口
     */
    CommonResult<List<SysUserEducationResp>> updateUserEducationById(SysUserEducationReq req, HttpServletRequest request) throws ParseException;

    /**
     * 获取人员工作经历请求接口
     */
    CommonResult<List<SelectSysUserWorkExperienceResp>> selectSysUserWorkExperience(SelectSysUserWorkExperienceReq req, HttpServletRequest request);

    /**
     * 修改人员工作经历请求接口
     */
    CommonResult<UpdateSysUserWorkExperienceByIdResp> updateSysUserWorkExperienceById(UpdateSysUserWorkExperienceByIdReq req, HttpServletRequest request) throws ParseException;

    /**
     * 添加系统人员信息接口
     */
    CommonResult<AddSysUserResp> addSysUserInfo(AddSysUserReq req, HttpServletRequest request) throws ParseException;

    /**
     * 添加系统人员基础信息接口
     */
    CommonResult<AddSysBaseUserResp> addSysBaseUserInfo(AddSysBaseUserReq req, HttpServletRequest request);

    /**
     * 添加系统人员家庭成员信息接口
     */
    CommonResult<AddUserMemberOfFamilyInfoResp> addUserMemberOfFamilyInfo(AddUserMemberOfFamilyInfoReq req, HttpServletRequest request);

    /**
     * 添加人员教育情况请求接口
     */
    CommonResult<AddUserEducationInfoResp> addUserEducationInfo(AddUserEducationInfoReq req, HttpServletRequest request) throws ParseException;

    /**
     * 添加人员工作经历请求接口
     */
    CommonResult<AddUserWorkExperienceInfoResp> addUserWorkExperienceInfo(AddUserWorkExperienceInfoReq req, HttpServletRequest request) throws ParseException;
}
