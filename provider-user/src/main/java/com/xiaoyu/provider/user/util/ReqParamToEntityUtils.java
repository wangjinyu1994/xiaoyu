package com.xiaoyu.provider.user.util;

import com.xiaoyu.common.base.constants.DeleteFlagEnum;
import com.xiaoyu.common.base.constants.SysUserLoginEnum;
import com.xiaoyu.common.base.constants.SysUserShztEnum;
import com.xiaoyu.common.base.util.DateUtil;
import com.xiaoyu.provider.user.entity.*;
import com.xiaoyu.provider.user.req.*;
import org.apache.commons.lang.StringUtils;

import java.text.ParseException;
import java.util.Date;

/**
 * WJY
 * 请求参数转实体类工具类
 */
public class ReqParamToEntityUtils {

    /**
     * 系统人员修改密码
     * @param password 新密码
     * @param userId 人员主键
     */
    public static Xtryxxb updateSysUserPassword(String password, Long userId) {
        Xtryxxb xtryxxb = new Xtryxxb();
        xtryxxb.setXgsj(new Date());
        xtryxxb.setXgrzj(userId);
        xtryxxb.setRydlmm(password);
        xtryxxb.setZj(userId);
        return xtryxxb;
    }

    public static Xtryxxb updateSysUserInitPassword(String password, Long zj,Long userId) {
        Xtryxxb xtryxxb = new Xtryxxb();
        xtryxxb.setZj(zj);
        xtryxxb.setRydlmm(password);
        xtryxxb.setXgsj(new Date());
        xtryxxb.setXgrzj(userId);
        return xtryxxb;
    }

    public static Xtryxxb updateSysyUserById(SysyUpdateUserReq req, Long userId) throws ParseException {
        Xtryxxb xtryxxb = new Xtryxxb();
        xtryxxb.setZj(userId);
        xtryxxb.setXgsj(new Date());
        xtryxxb.setXgrzj(userId);
        xtryxxb.setRync(req.getNickname());
        xtryxxb.setRyxb(req.getSex());
        xtryxxb.setRytx(req.getHeadImgAddress());
        xtryxxb.setRysr(DateUtil.parseStr2DateDefault(req.getBirthday()));
        xtryxxb.setGxqm(req.getAutograph());
        xtryxxb.setGrsm(req.getExplain());
        xtryxxb.setRyszjd(req.getLongitude());
        xtryxxb.setRyszwd(req.getLatitude());
        xtryxxb.setRyxx(req.getBloodType());
        return xtryxxb;
    }

    public static Xtryjcxxb updateSysUserBaseById(SysyUpdateUserBaseReq req, Long userId) {
        Xtryjcxxb xtryjcxxb = new Xtryjcxxb();
        xtryjcxxb.setZj(req.getZj());
        xtryjcxxb.setXgsj(new Date());
        xtryjcxxb.setXgrzj(userId);
        xtryjcxxb.setXm(req.getName());
        xtryjcxxb.setHyzk(req.getMarriage());
        xtryjcxxb.setZgxl(req.getEducationId());
        xtryjcxxb.setZzmm(req.getPoliticalOutlookId());
        xtryjcxxb.setSfzh(req.getSfzId());
        xtryjcxxb.setSjh(req.getPhone());
        xtryjcxxb.setYx(req.getEmail());
        xtryjcxxb.setZy(req.getOccupationId());
        xtryjcxxb.setRyszsfbm(req.getProvince());
        xtryjcxxb.setRyszcsbm(req.getCity());
        xtryjcxxb.setRyszqybm(req.getRegion());
        xtryjcxxb.setDqgs(req.getCompany());
        xtryjcxxb.setGsdz(req.getCompanyAddr());
        xtryjcxxb.setJzdz(req.getResidential());
        xtryjcxxb.setSfzdz(req.getSfzAddress());
        return xtryjcxxb;
    }

    public static Xtryjtcyxxb updateUserMemberOfFamilyById(UpdateUserMemberOfFamilyReq req, Long userId) {
        Xtryjtcyxxb xtryjtcyxxb = new Xtryjtcyxxb();
        xtryjtcyxxb.setZj(req.getZj());
        xtryjtcyxxb.setXgsj(new Date());
        xtryjtcyxxb.setXgrzj(userId);
        xtryjtcyxxb.setRylx(req.getTypeId());
        xtryjtcyxxb.setRyxm(req.getName());
        xtryjtcyxxb.setRyzy(req.getOccupation());
        return xtryjtcyxxb;
    }

    public static Xtryjyqkxxb updateUserEducationById(SysUserEducationReq req, Long userId) throws ParseException {
        Xtryjyqkxxb xtryjyqkxxb = new Xtryjyqkxxb();
        xtryjyqkxxb.setZj(req.getZj());
        xtryjyqkxxb.setXgsj(new Date());
        xtryjyqkxxb.setXgrzj(userId);
        xtryjyqkxxb.setXl(req.getEducationId());
        xtryjyqkxxb.setSfby(req.getGraduation());
        xtryjyqkxxb.setZy(req.getMajor());
        xtryjyqkxxb.setXxmc(req.getSchoolName());
        xtryjyqkxxb.setXxdz(req.getSchoolAddress());
        xtryjyqkxxb.setRxsj(DateUtil.parseStr2DateDefault(req.getSchoolSatrtDate()));
        xtryjyqkxxb.setBysj(DateUtil.parseStr2DateDefault(req.getSchoolEndDate()));
        return xtryjyqkxxb;
    }

    public static Xtrygzjlxxb updateSysUserWorkExperienceById(UpdateSysUserWorkExperienceByIdReq req, Long userId) throws ParseException {
        Xtrygzjlxxb xtrygzjlxxb = new Xtrygzjlxxb();
        xtrygzjlxxb.setZj(req.getZj());
        xtrygzjlxxb.setXgsj(new Date());
        xtrygzjlxxb.setXgrzj(userId);
        xtrygzjlxxb.setGslx(req.getCompanyTypeId());
        xtrygzjlxxb.setSfzz(req.getStatus());
        xtrygzjlxxb.setGsmc(req.getCompanyName());
        xtrygzjlxxb.setGsdz(req.getCompanyAddress());
        xtrygzjlxxb.setRzsj(DateUtil.parseStr2DateDefault(req.getEnrollingDate()));
        xtrygzjlxxb.setLzsj(DateUtil.parseStr2DateDefault(req.getQuitDate()));
        return xtrygzjlxxb;
    }

    public static Xtryxxb addSysUserInfo(AddSysUserReq req, String password,Long userId) throws ParseException {
        Xtryxxb xtryxxb = new Xtryxxb();
        xtryxxb.setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
        xtryxxb.setCjrzj(userId);
        xtryxxb.setCjsj(new Date());
        xtryxxb.setRync(req.getNickname());
        xtryxxb.setRydlzh(req.getLoginName());
        xtryxxb.setRydlmm(password);
        xtryxxb.setRylx(req.getUserType());
        xtryxxb.setRyxb(req.getSex());
        xtryxxb.setRytx(req.getHeadImgAddress());
        if (StringUtils.isNotBlank(req.getBirthday())){
            xtryxxb.setRysr(DateUtil.parseStr2DateDefault(req.getBirthday()));
        }
        xtryxxb.setGxqm(req.getAutograph());
        xtryxxb.setGrsm(req.getExplain());
        xtryxxb.setRyszjd(req.getLongitude());
        xtryxxb.setRyszwd(req.getLatitude());
        xtryxxb.setRyxx(req.getBloodType());
        xtryxxb.setRyshzt(SysUserShztEnum.SHZ.getCode());
        xtryxxb.setRydlzh(SysUserLoginEnum.WDL.getCode());
        return xtryxxb;
    }

    public static Xtryjcxxb addSysBaseUserInfo(AddSysBaseUserReq req, Long userId) {
        Xtryjcxxb xtryjcxxb = new Xtryjcxxb();
        xtryjcxxb.setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
        xtryjcxxb.setCjrzj(userId);
        xtryjcxxb.setCjsj(new Date());
        xtryjcxxb.setXm(req.getName());
        xtryjcxxb.setHyzk(req.getMarriage());
        xtryjcxxb.setZgxl(req.getEducationId());
        xtryjcxxb.setZzmm(req.getPoliticalOutlookId());
        xtryjcxxb.setSfzh(req.getSfzId());
        xtryjcxxb.setSjh(req.getPhone());
        xtryjcxxb.setYx(req.getEmail());
        xtryjcxxb.setZy(req.getOccupationId());
        xtryjcxxb.setRyszsfbm(req.getProvinceDm());
        xtryjcxxb.setRyszcsbm(req.getCityDm());
        xtryjcxxb.setRyszqybm(req.getRegionDm());
        xtryjcxxb.setGsdz(req.getCompanyAddr());
        xtryjcxxb.setDqgs(req.getCompany());
        xtryjcxxb.setJzdz(req.getResidential());
        xtryjcxxb.setSfzdz(req.getSfzAddress());
        xtryjcxxb.setXtryzj(userId);
        return xtryjcxxb;
    }

    public static Xtryjgxxb addSysUserInfoAndOrg(Long xtryzj, Long orgId, Long userId) {
        Xtryjgxxb xtryjgxxb = new Xtryjgxxb();
        xtryjgxxb.setXtryzj(xtryzj);
        xtryjgxxb.setXtjgzj(orgId);
        xtryjgxxb.setCjrzj(userId);
        xtryjgxxb.setCjsj(new Date());
        xtryjgxxb.setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
        return xtryjgxxb;
    }

    public static Xtryjtcyxxb addUserMemberOfFamilyInfo(AddUserMemberOfFamilyInfoReq req, Long userId) {
        Xtryjtcyxxb xtryjtcyxxb = new Xtryjtcyxxb();
        xtryjtcyxxb.setCjrzj(userId);
        xtryjtcyxxb.setCjsj(new Date());
        xtryjtcyxxb.setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
        xtryjtcyxxb.setXtryzj(userId);
        xtryjtcyxxb.setRylx(req.getTypeId());
        xtryjtcyxxb.setRyxm(req.getName());
        xtryjtcyxxb.setRyzy(req.getOccupation());
        return xtryjtcyxxb;
    }

    public static Xtryjyqkxxb addUserEducationInfo(AddUserEducationInfoReq req, Long userId) throws ParseException {
        Xtryjyqkxxb xtryjyqkxxb = new Xtryjyqkxxb();
        xtryjyqkxxb.setCjrzj(userId);
        xtryjyqkxxb.setCjsj(new Date());
        xtryjyqkxxb.setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
        xtryjyqkxxb.setXtryzj(userId);
        xtryjyqkxxb.setSfby(req.getGraduation());
        xtryjyqkxxb.setXl(req.getEducationId());
        xtryjyqkxxb.setZy(req.getMajor());
        xtryjyqkxxb.setXxmc(req.getSchoolName());
        xtryjyqkxxb.setXxdz(req.getSchoolAddress());
        xtryjyqkxxb.setRxsj(DateUtil.parseStr2DateDefault(req.getSchoolSatrtDate()));
        xtryjyqkxxb.setBysj(DateUtil.parseStr2DateDefault(req.getSchoolEndDate()));
        return xtryjyqkxxb;
    }

    public static Xtrygzjlxxb addUserWorkExperienceInfo(AddUserWorkExperienceInfoReq req, Long userId) throws ParseException {
        Xtrygzjlxxb xtrygzjlxxb = new Xtrygzjlxxb();
        xtrygzjlxxb.setCjrzj(userId);
        xtrygzjlxxb.setCjsj(new Date());
        xtrygzjlxxb.setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
        xtrygzjlxxb.setXtryzj(userId);
        xtrygzjlxxb.setGslx(req.getCompanyTypeId());
        xtrygzjlxxb.setSfzz(req.getStatus());
        xtrygzjlxxb.setGsmc(req.getCompanyName());
        xtrygzjlxxb.setGsdz(req.getCompanyAddress());
        if (StringUtils.isNotBlank(req.getEnrollingDate())){
            xtrygzjlxxb.setRzsj(DateUtil.parseStr2DateDefault(req.getEnrollingDate()));
        }
        if (StringUtils.isNotBlank(req.getQuitDate())){
            xtrygzjlxxb.setLzsj(DateUtil.parseStr2DateDefault(req.getQuitDate()));
        }
        return xtrygzjlxxb;
    }
}
