package com.xiaoyu.provider.user.service.impl;

import com.xiaoyu.common.base.constants.ResponseEnum;
import com.xiaoyu.common.base.exception.CommonServiceException;
import com.xiaoyu.common.base.req.LoginUserInfo;
import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.util.HttpServletRequestUtil;
import com.xiaoyu.common.base.util.SecretUtil;
import com.xiaoyu.provider.user.dao.*;
import com.xiaoyu.provider.user.dao.ex.*;
import com.xiaoyu.provider.user.entity.*;
import com.xiaoyu.provider.user.req.*;
import com.xiaoyu.provider.user.resp.*;
import com.xiaoyu.provider.user.service.SysUserService;
import com.xiaoyu.provider.user.util.ReqParamToEntityUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.List;
import java.util.Objects;

/**
 * WJY
 */
@Service
@Slf4j
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private XtryxxbMapper xtryxxbMapper;
    @Autowired
    private XtryxxbMapperEx xtryxxbMapperEx;
    @Autowired
    private XtryjcxxbMapper xtryjcxxbMapper;
    @Autowired
    private XtryjcxxbMapperEx xtryjcxxbMapperEx;
    @Autowired
    private XtryjtcyxxbMapper xtryjtcyxxbMapper;
    @Autowired
    private XtryjtcyxxbMapperEx xtryjtcyxxbMapperEx;
    @Autowired
    private XtryjyqkxxbMapper xtryjyqkxxbMapper;
    @Autowired
    private XtryjyqkxxbMapperEx xtryjyqkxxbMapperEx;
    @Autowired
    private XtrygzjlxxbMapper xtrygzjlxxbMapper;
    @Autowired
    private XtrygzjlxxbMapperEx xtrygzjlxxbMapperEx;
    @Autowired
    private XtryjgxxbMapper xtryjgxxbMapper;


    /**
     * 系统人员修改密码请求接口
     */
    @Override
    public CommonResult<SysUserUpdatePasswordResp> updateSysUserPassword(SysUserUpdatePasswordReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        String password;
        try {
            password = SecretUtil.decryptByRsa(req.getNewPassword());
        } catch (Exception e){
            e.printStackTrace();
            log.error("系统人员修改密码失败，密码秘钥的rsa密文用rsa秘钥解码失败，密码待解密的密文：{}，异常信息：{}", req.getNewPassword(), e);
            throw new CommonServiceException(ResponseEnum.FAIL.getCode(),"新密码不合法");
        }
        Xtryxxb xtryxxb = ReqParamToEntityUtils.updateSysUserPassword(SecretUtil.encryptUserPwdBySalt(password),loginUserInfo.getUserId());
        xtryxxbMapper.updateByPrimaryKeySelective(xtryxxb);
        return CommonResult.success();
    }

    /**
     * 系统人员初始化密码请求接口
     */
    @Override
    public CommonResult<SysUserInitPasswordResp> updateSysUserInitPassword(SysUserInitPasswordReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtryxxb xtryxxb = ReqParamToEntityUtils.updateSysUserInitPassword(SecretUtil.encryptUserPwdInit(),req.getUserId(),loginUserInfo.getUserId());
        xtryxxbMapper.updateByPrimaryKeySelective(xtryxxb);
        return CommonResult.success();
    }

    /**
     * 修改系统人员信息表请求接口
     */
    @Override
    public CommonResult<SysyUpdateUserResp> updateSysyUserById(SysyUpdateUserReq req, HttpServletRequest request) throws ParseException {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtryxxb xtryxxb = ReqParamToEntityUtils.updateSysyUserById(req,loginUserInfo.getUserId());
        xtryxxbMapper.updateByPrimaryKeySelective(xtryxxb);
        return CommonResult.success();
    }

    /**
     * 根据人员主键查询人员信息请求接口
     */
    @Override
    public CommonResult<SysUserByIdResp> selectSysUserById(SysUserByIdReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        SysUserByIdResp resp = xtryxxbMapperEx.selectSysUserById(loginUserInfo.getUserId());
        return CommonResult.success(resp);
    }

    /**
     * 根据人员主键查询人员基础信息请求接口
     */
    @Override
    public CommonResult<SysUserBaseByIdResp> selectSysUserBaseById(SysUserBaseByIdReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        SysUserBaseByIdResp resp = xtryjcxxbMapperEx.selectSysUserBaseById(loginUserInfo.getUserId());
        return CommonResult.success(resp);
    }

    /**
     * 修改人员基础信息请求接口
     */
    @Override
    public CommonResult<SysyUpdateUserBaseResp> updateSysUserBaseById(SysyUpdateUserBaseReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtryjcxxb xtryjcxxb = ReqParamToEntityUtils.updateSysUserBaseById(req,loginUserInfo.getUserId());
        xtryjcxxbMapper.updateByPrimaryKeySelective(xtryjcxxb);
        return CommonResult.success();
    }

    /**
     * 获取家庭成员信息请求接口
     */
    @Override
    public CommonResult<List<SysUserMemberOfFamilyResp>> selectSysUserMemberOfFamilyById(SysUserBaseByIdReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        List<SysUserMemberOfFamilyResp> resp = xtryjtcyxxbMapperEx.selectSysUserMemberOfFamilyById(loginUserInfo.getUserId());
        return CommonResult.success(resp);
    }

    /**
     * 更新家庭成员信息请求接口
     */
    @Override
    public CommonResult<UpdateUserMemberOfFamilyResp> updateUserMemberOfFamilyById(UpdateUserMemberOfFamilyReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtryjtcyxxb xtryjtcyxxb = ReqParamToEntityUtils.updateUserMemberOfFamilyById(req,loginUserInfo.getUserId());
        xtryjtcyxxbMapper.updateByPrimaryKeySelective(xtryjtcyxxb);
        return CommonResult.success();
    }

    /**
     * 获取人员教育情况请求接口
     */
    @Override
    public CommonResult<List<SysUserEducationResp>> selectSysUserEducation(SysUserEducationReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        List<SysUserEducationResp> resps = xtryjyqkxxbMapperEx.selectSysUserEducation(loginUserInfo.getUserId());
        return CommonResult.success(resps);
    }

    /**
     * 修改人员教育情况请求接口
     */
    @Override
    public CommonResult<List<SysUserEducationResp>> updateUserEducationById(SysUserEducationReq req, HttpServletRequest request) throws ParseException {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtryjyqkxxb xtryjyqkxxb = ReqParamToEntityUtils.updateUserEducationById(req,loginUserInfo.getUserId());
        xtryjyqkxxbMapper.updateByPrimaryKeySelective(xtryjyqkxxb);
        return CommonResult.success();
    }

    /**
     * 获取人员工作经历请求接口
     */
    @Override
    public CommonResult<List<SelectSysUserWorkExperienceResp>> selectSysUserWorkExperience(SelectSysUserWorkExperienceReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        List<SelectSysUserWorkExperienceResp> resps = xtrygzjlxxbMapperEx.selectSysUserWorkExperience(loginUserInfo.getUserId());
        return CommonResult.success(resps);
    }

    /**
     * 修改人员工作经历请求接口
     */
    @Override
    public CommonResult<UpdateSysUserWorkExperienceByIdResp> updateSysUserWorkExperienceById(UpdateSysUserWorkExperienceByIdReq req, HttpServletRequest request) throws ParseException {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtrygzjlxxb xtrygzjlxxb = ReqParamToEntityUtils.updateSysUserWorkExperienceById(req,loginUserInfo.getUserId());
        xtrygzjlxxbMapper.updateByPrimaryKeySelective(xtrygzjlxxb);
        return CommonResult.success();
    }

    /**
     * 添加系统人员信息接口
     */
    @Override
    public CommonResult<AddSysUserResp> addSysUserInfo(AddSysUserReq req, HttpServletRequest request) throws ParseException {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        // 首先校验账号是否存在
        Xtryxxb loginname = xtryxxbMapperEx.selectSysUserByLoginName(req.getLoginName(),req.getUserType());
        if (Objects.nonNull(loginname)){
            log.error("添加系统人员失败，失败原因是账号已存在,账号信息是：{}", req.getLoginName());
            throw new CommonServiceException(ResponseEnum.FAIL.getCode(),"账号已存在，不可重复添加");
        }
        Xtryxxb xtryxxb = ReqParamToEntityUtils.addSysUserInfo(req,SecretUtil.encryptUserPwdInit(),loginUserInfo.getUserId());
        xtryxxbMapper.insertSelective(xtryxxb);
        // 添加人员机构信息
        Xtryjgxxb xtryjgxxb = ReqParamToEntityUtils.addSysUserInfoAndOrg(xtryxxb.getZj(),req.getOrgId(),loginUserInfo.getUserId());
        xtryjgxxbMapper.insertSelective(xtryjgxxb);
        return CommonResult.success();
    }

    /**
     * 添加系统人员基础信息接口
     */
    @Override
    public CommonResult<AddSysBaseUserResp> addSysBaseUserInfo(AddSysBaseUserReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtryjcxxb xtryjcxxb = ReqParamToEntityUtils.addSysBaseUserInfo(req,loginUserInfo.getUserId());
        xtryjcxxbMapper.insertSelective(xtryjcxxb);
        return CommonResult.success();
    }

    /**
     * 添加系统人员家庭成员信息接口
     */
    @Override
    public CommonResult<AddUserMemberOfFamilyInfoResp> addUserMemberOfFamilyInfo(AddUserMemberOfFamilyInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtryjtcyxxb xtryjtcyxxb = ReqParamToEntityUtils.addUserMemberOfFamilyInfo(req,loginUserInfo.getUserId());
        xtryjtcyxxbMapper.insertSelective(xtryjtcyxxb);
        return CommonResult.success();
    }

    /**
     * 添加人员教育情况请求接口
     */
    @Override
    public CommonResult<AddUserEducationInfoResp> addUserEducationInfo(AddUserEducationInfoReq req, HttpServletRequest request) throws ParseException {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtryjyqkxxb xtryjyqkxxb = ReqParamToEntityUtils.addUserEducationInfo(req,loginUserInfo.getUserId());
        xtryjyqkxxbMapper.insertSelective(xtryjyqkxxb);
        return CommonResult.success();
    }

    /**
     * 添加人员工作经历请求接口
     */
    @Override
    public CommonResult<AddUserWorkExperienceInfoResp> addUserWorkExperienceInfo(AddUserWorkExperienceInfoReq req, HttpServletRequest request) throws ParseException {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtrygzjlxxb xtrygzjlxxb = ReqParamToEntityUtils.addUserWorkExperienceInfo(req,loginUserInfo.getUserId());
        xtrygzjlxxbMapper.insertSelective(xtrygzjlxxb);
        return CommonResult.success();
    }


}
