package com.xiaoyu.provider.user.util;

import com.xiaoyu.common.base.constants.DeleteFlagEnum;
import com.xiaoyu.common.base.constants.SysUserLoginEnum;
import com.xiaoyu.common.base.constants.SysUserShztEnum;
import com.xiaoyu.common.base.util.DateUtil;
import com.xiaoyu.provider.user.entity.*;
import com.xiaoyu.provider.user.req.*;
import com.xiaoyu.provider.user.resp.SelectCoreDataResp;
import com.xiaoyu.provider.user.resp.SelectCoreInfoResp;
import org.apache.commons.lang.StringUtils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    public static Xtzxjjxqxxb addCoreContentInfo(AddCoreContentInfoReq req,Long userId) {
        Xtzxjjxqxxb xtzxjjxqxxb = new Xtzxjjxqxxb();
        xtzxjjxqxxb.setCjrzj(userId);
        xtzxjjxqxxb.setCjsj(new Date());
        xtzxjjxqxxb.setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
        xtzxjjxqxxb.setNr(req.getContent());
        xtzxjjxqxxb.setZxjjzj(req.getZxjjzj());
        return xtzxjjxqxxb;
    }

    public static void selectCoreInfo(List<SelectCoreDataResp> resps, List<SelectCoreInfoResp> list) {
        resps.forEach(data->{
            for (SelectCoreInfoResp nrData : list){
                if (data.getZj().longValue() == nrData.getZxjjzj().longValue()){
                    data.setData(nrData);
                    break;
                }
            }
        });
    }

    public static Xtzxjjxqxxb updateCoreContentInfo(UpdateCoreContentInfoReq req, Long userId) {
        Xtzxjjxqxxb xtzxjjxqxxb = new Xtzxjjxqxxb();
        xtzxjjxqxxb.setXgsj(new Date());
        xtzxjjxqxxb.setXgrzj(userId);
        xtzxjjxqxxb.setZj(req.getZj());
        xtzxjjxqxxb.setNr(req.getContent());
        xtzxjjxqxxb.setZxjjzj(req.getZxjjzj());
        return xtzxjjxqxxb;
    }

    public static Xtzxjjxqxxb deleteCoreContentInfo(DeleteCoreContentInfoReq req, Long userId) {
        Xtzxjjxqxxb xtzxjjxqxxb = new Xtzxjjxqxxb();
        xtzxjjxqxxb.setXgsj(new Date());
        xtzxjjxqxxb.setXgrzj(userId);
        xtzxjjxqxxb.setScbz(DeleteFlagEnum.LUOJI_DELETE.getDelFlagCode());
        xtzxjjxqxxb.setZj(req.getZj());
        return xtzxjjxqxxb;
    }

    public static Xtzxjjxxb addCoreDetailsInfo(AddCoreDetailsInfoReq req, Long userId) {
        Xtzxjjxxb xtzxjjxxb = new Xtzxjjxxb();
        xtzxjjxxb.setCjsj(new Date());
        xtzxjjxxb.setCjrzj(userId);
        xtzxjjxxb.setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
        xtzxjjxxb.setMc(req.getName());
        xtzxjjxxb.setDz(req.getAddress());
        xtzxjjxxb.setDh(req.getPhone());
        xtzxjjxxb.setQqdz(req.getQq());
        xtzxjjxxb.setWxdz(req.getVx());
        xtzxjjxxb.setJgzj(req.getOrgId());
        return xtzxjjxxb;
    }

    public static Xtzxjjxqxxb addCoreDetailsXqInfo(Long zj, Long userId, AddCoreInfoResp data) {
        Xtzxjjxqxxb xtzxjjxqxxb = new Xtzxjjxqxxb();
        xtzxjjxqxxb.setZxjjzj(zj);
        xtzxjjxqxxb.setCjrzj(userId);
        xtzxjjxqxxb.setCjsj(new Date());
        xtzxjjxqxxb.setNr(data.getContent());
        return xtzxjjxqxxb;
    }

    public static Xtzxjjxxb updateCoreDetailsInfo(UpdateCoreDetailsInfoReq req, Long userId) {
        Xtzxjjxxb xtzxjjxxb = new Xtzxjjxxb();
        xtzxjjxxb.setXgsj(new Date());
        xtzxjjxxb.setXgrzj(userId);
        xtzxjjxxb.setMc(req.getName());
        xtzxjjxxb.setDz(req.getAddress());
        xtzxjjxxb.setDh(req.getPhone());
        xtzxjjxxb.setQqdz(req.getQq());
        xtzxjjxxb.setWxdz(req.getVx());
        xtzxjjxxb.setJgzj(req.getOrgId());
        xtzxjjxxb.setZj(req.getZj());
        return xtzxjjxxb;
    }

    public static Xtzxjjxxb deleteCoreDetailsInfo(DeleteCoreDetailsInfoReq req, Long userId) {
        Xtzxjjxxb xtzxjjxxb = new Xtzxjjxxb();
        xtzxjjxxb.setXgsj(new Date());
        xtzxjjxxb.setXgrzj(userId);
        xtzxjjxxb.setScbz(DeleteFlagEnum.LUOJI_DELETE.getDelFlagCode());
        xtzxjjxxb.setZj(req.getZj());
        return xtzxjjxxb;
    }

    public static Xtyqljxxb addLinksInfo(AddLinksInfoReq req, Long userId) {
        Xtyqljxxb xtyqljxxb = new Xtyqljxxb();
        xtyqljxxb.setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
        xtyqljxxb.setCjsj(new Date());
        xtyqljxxb.setCjrzj(userId);
        xtyqljxxb.setYqljmc(req.getName());
        xtyqljxxb.setYqljdz(req.getAddress());
        xtyqljxxb.setYqljtpdz(req.getTpAddress());
        return xtyqljxxb;
    }

    public static Xtyqljxxb updateLinksInfo(UpdateLinksInfoReq req, Long userId) {
        Xtyqljxxb xtyqljxxb = new Xtyqljxxb();
        xtyqljxxb.setXgsj(new Date());
        xtyqljxxb.setXgrzj(userId);
        xtyqljxxb.setYqljmc(req.getName());
        xtyqljxxb.setYqljdz(req.getAddress());
        xtyqljxxb.setYqljtpdz(req.getTpAddress());
        xtyqljxxb.setZj(req.getZj());
        return xtyqljxxb;
    }

    public static Xtyqljxxb deleteLinksInfo(DeleteLinksInfoReq req, Long userId) {
        Xtyqljxxb xtyqljxxb = new Xtyqljxxb();
        xtyqljxxb.setXgsj(new Date());
        xtyqljxxb.setXgrzj(userId);
        xtyqljxxb.setScbz(DeleteFlagEnum.LUOJI_DELETE.getDelFlagCode());
        xtyqljxxb.setZj(req.getZj());
        return xtyqljxxb;
    }

    public static Xtxxtzxxb addNoticInfo(AddNoticInfoReq req, Long userId) {
        Xtxxtzxxb xtxxtzxxb = new Xtxxtzxxb();
        xtxxtzxxb.setCjsj(new Date());
        xtxxtzxxb.setCjrzj(userId);
        xtxxtzxxb.setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
        xtxxtzxxb.setXxlx(req.getTypeZj());
        xtxxtzxxb.setBt(req.getTitle());
        xtxxtzxxb.setZy(req.getSummary());
        xtxxtzxxb.setNr(req.getContent());
        xtxxtzxxb.setFbjgmc(req.getOrgName());
        xtxxtzxxb.setFbjgzj(req.getOrgId());
        xtxxtzxxb.setLy(req.getSource());
        return xtxxtzxxb;
    }

    public static Xtxxtzxxb updateNoticInfo(UpdateNoticInfoReq req, Long userId) {
        Xtxxtzxxb xtxxtzxxb = new Xtxxtzxxb();
        xtxxtzxxb.setXgsj(new Date());
        xtxxtzxxb.setXgrzj(userId);
        xtxxtzxxb.setZj(req.getZj());
        xtxxtzxxb.setXxlx(req.getTypeZj());
        xtxxtzxxb.setBt(req.getTitle());
        xtxxtzxxb.setZy(req.getSummary());
        xtxxtzxxb.setNr(req.getContent());
        xtxxtzxxb.setFbjgmc(req.getOrgName());
        xtxxtzxxb.setFbjgzj(req.getOrgId());
        xtxxtzxxb.setLy(req.getSource());
        xtxxtzxxb.setFwl(req.getVisits());
        return xtxxtzxxb;
    }

    public static Xtxxtzxxb deleteNoticInfo(DeleteNoticInfoReq req, Long userId) {
        Xtxxtzxxb xtxxtzxxb = new Xtxxtzxxb();
        xtxxtzxxb.setXgsj(new Date());
        xtxxtzxxb.setXgrzj(userId);
        xtxxtzxxb.setScbz(DeleteFlagEnum.LUOJI_DELETE.getDelFlagCode());
        xtxxtzxxb.setZj(req.getZj());
        return xtxxtzxxb;
    }

    public static Xtjctpxxb addPicturesInfo(AddPicturesInfoReq req, Long userId) {
        Xtjctpxxb xtjctpxxb = new Xtjctpxxb();
        xtjctpxxb.setCjsj(new Date());
        xtjctpxxb.setCjrzj(userId);
        xtjctpxxb.setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
        xtjctpxxb.setTpmc(req.getName());
        xtjctpxxb.setTpdz(req.getAddress());
        xtjctpxxb.setTplx(req.getTypeZj());
        return xtjctpxxb;
    }

    public static Xtjctpxxb updatePicturesInfo(UpdatePicturesInfoReq req, Long userId) {
        Xtjctpxxb xtjctpxxb = new Xtjctpxxb();
        xtjctpxxb.setXgsj(new Date());
        xtjctpxxb.setXgrzj(userId);
        xtjctpxxb.setZj(req.getZj());
        xtjctpxxb.setTplx(req.getTypeZj());
        xtjctpxxb.setTpmc(req.getName());
        xtjctpxxb.setTpdz(req.getAddress());
        xtjctpxxb.setPx(req.getSx());
        return xtjctpxxb;
    }

    public static Xtjctpxxb deletePicturesInfo(DeletePicturesInfoReq req, Long userId) {
        Xtjctpxxb xtjctpxxb = new Xtjctpxxb();
        xtjctpxxb.setXgsj(new Date());
        xtjctpxxb.setXgrzj(userId);
        xtjctpxxb.setScbz(DeleteFlagEnum.LUOJI_DELETE.getDelFlagCode());
        xtjctpxxb.setZj(req.getZj());
        return xtjctpxxb;
    }

    public static List<Xtxxtzfjxxb> addNoticEnclosure(Long zj, Long userId, List<AddNoticEnclosure> body) {
        List<Xtxxtzfjxxb> list = new ArrayList<>();
        final Xtxxtzfjxxb[] xtxxtzfjxxb = {null};
        body.forEach(data->{
            xtxxtzfjxxb[0] = new Xtxxtzfjxxb();
            xtxxtzfjxxb[0].setCjsj(new Date());
            xtxxtzfjxxb[0].setCjrzj(userId);
            xtxxtzfjxxb[0].setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
            xtxxtzfjxxb[0].setXxtzbzj(zj);
            xtxxtzfjxxb[0].setFjbt(data.getTitle());
            xtxxtzfjxxb[0].setFjdx(data.getRam());
            xtxxtzfjxxb[0].setFjdz(data.getAddress());
            list.add(xtxxtzfjxxb[0]);
        });
        return list;
    }

    public static Xtxxtzfjxxb addNoticEnclosureInfo(AddNoticEnclosureInfoReq req, Long userId) {
        Xtxxtzfjxxb xtxxtzfjxxb = new Xtxxtzfjxxb();
        xtxxtzfjxxb.setCjsj(new Date());
        xtxxtzfjxxb.setCjrzj(userId);
        xtxxtzfjxxb.setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
        xtxxtzfjxxb.setXxtzbzj(req.getNoticId());
        xtxxtzfjxxb.setFjbt(req.getTitle());
        xtxxtzfjxxb.setFjdz(req.getAddress());
        xtxxtzfjxxb.setFjdx(req.getRam());
        return xtxxtzfjxxb;
    }

    public static List<Xtxxtzfjxxb> addNoticEnclosureListInfo(AddNoticEnclosureListInfo req, Long userId) {
        List<Xtxxtzfjxxb> list = new ArrayList<>();
        final Xtxxtzfjxxb[] xtxxtzfjxxb = {null};
        req.getBody().forEach(data->{
            xtxxtzfjxxb[0] = new Xtxxtzfjxxb();
            xtxxtzfjxxb[0].setCjsj(new Date());
            xtxxtzfjxxb[0].setCjrzj(userId);
            xtxxtzfjxxb[0].setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
            xtxxtzfjxxb[0].setXxtzbzj(data.getNoticId());
            xtxxtzfjxxb[0].setFjbt(data.getTitle());
            xtxxtzfjxxb[0].setFjdx(data.getRam());
            xtxxtzfjxxb[0].setFjdz(data.getAddress());
            list.add(xtxxtzfjxxb[0]);
        });
        return list;
    }

    public static Xtxxtzfjxxb updateNoticEnclosureInfo(UpdateNoticEnclosureInfoReq req, Long userId) {
        Xtxxtzfjxxb xtxxtzfjxxb = new Xtxxtzfjxxb();
        xtxxtzfjxxb.setXgsj(new Date());
        xtxxtzfjxxb.setXgrzj(userId);
        xtxxtzfjxxb.setZj(req.getZj());
        xtxxtzfjxxb.setFjbt(req.getTitle());
        xtxxtzfjxxb.setFjdx(req.getRam());
        xtxxtzfjxxb.setFjdz(req.getAddress());
        return xtxxtzfjxxb;
    }

    public static Xtxxtzfjxxb deleteNoticEnclosureInfo(DeleteNoticEnclosureInfoReq req, Long userId) {
        Xtxxtzfjxxb xtxxtzfjxxb = new Xtxxtzfjxxb();
        xtxxtzfjxxb.setXgsj(new Date());
        xtxxtzfjxxb.setXgrzj(userId);
        xtxxtzfjxxb.setScbz(DeleteFlagEnum.LUOJI_DELETE.getDelFlagCode());
        xtxxtzfjxxb.setZj(req.getZj());
        return xtxxtzfjxxb;
    }

    public static Xtjgxxb addOrgInfo(AddOrgInfoReq req, Long userId) {
        Xtjgxxb xtjgxxb = new Xtjgxxb();
        xtjgxxb.setCjsj(new Date());
        xtjgxxb.setCjrzj(userId);
        xtjgxxb.setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
        xtjgxxb.setJgmc(req.getName());
        xtjgxxb.setJgqc(req.getFullName());
        xtjgxxb.setJgdz(req.getAddress());
        xtjgxxb.setJgbm(req.getCode());
        xtjgxxb.setSjjgzj(req.getParentId());
        xtjgxxb.setJgjb(req.getOrgLevel());
        xtjgxxb.setPx(req.getSx());
        xtjgxxb.setJgjj(req.getBriefIntroduction());
        xtjgxxb.setJgtp(req.getPhoto());
        xtjgxxb.setJgszsfbm(req.getProvinceCode());
        xtjgxxb.setJgszcsbm(req.getCityCode());
        xtjgxxb.setJgszqybm(req.getAreaCode());
        xtjgxxb.setJgszjd(req.getLongitude());
        xtjgxxb.setJgszwd(req.getLatitude());
        xtjgxxb.setJgdh(req.getPhone());
        xtjgxxb.setJgyx(req.getEmail());
        xtjgxxb.setJgcz(req.getFax());
        xtjgxxb.setJgfzrdh(req.getFzrPhone());
        xtjgxxb.setJgfzrxm(req.getFzrName());
        xtjgxxb.setJglxrxm(req.getLxrName());
        xtjgxxb.setJglxrdh(req.getLxrPhone());
        return xtjgxxb;
    }

    public static Xtjgxxb updateOrgInfo(UpdateOrgInfoReq req, Long userId) {
        Xtjgxxb xtjgxxb = new Xtjgxxb();
        xtjgxxb.setXgsj(new Date());
        xtjgxxb.setXgrzj(userId);
        xtjgxxb.setZj(req.getZj());
        xtjgxxb.setJgmc(req.getName());
        xtjgxxb.setJgqc(req.getFullName());
        xtjgxxb.setJgdz(req.getAddress());
        xtjgxxb.setJgbm(req.getCode());
        xtjgxxb.setSjjgzj(req.getParentId());
        xtjgxxb.setJgjb(req.getOrgLevel());
        xtjgxxb.setPx(req.getSx());
        xtjgxxb.setJgjj(req.getBriefIntroduction());
        xtjgxxb.setJgtp(req.getPhoto());
        xtjgxxb.setJgszsfbm(req.getProvinceCode());
        xtjgxxb.setJgszcsbm(req.getCityCode());
        xtjgxxb.setJgszqybm(req.getAreaCode());
        xtjgxxb.setJgszjd(req.getLongitude());
        xtjgxxb.setJgszwd(req.getLatitude());
        xtjgxxb.setJgdh(req.getPhone());
        xtjgxxb.setJgyx(req.getEmail());
        xtjgxxb.setJgcz(req.getFax());
        xtjgxxb.setJgfzrdh(req.getFzrPhone());
        xtjgxxb.setJgfzrxm(req.getFzrName());
        xtjgxxb.setJglxrxm(req.getLxrName());
        xtjgxxb.setJglxrdh(req.getLxrPhone());
        return xtjgxxb;
    }

    public static Xtjgxxb deleteOrgInfo(DeleteOrgInfoReq req, Long userId) {
        Xtjgxxb xtjgxxb = new Xtjgxxb();
        xtjgxxb.setXgsj(new Date());
        xtjgxxb.setXgrzj(userId);
        xtjgxxb.setScbz(DeleteFlagEnum.LUOJI_DELETE.getDelFlagCode());
        xtjgxxb.setZj(req.getZj());
        return xtjgxxb;
    }

    public static Xtjsxxb addRoleInfo(AddRoleInfoReq req, Long userId) {
        Xtjsxxb xtjsxxb = new Xtjsxxb();
        xtjsxxb.setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
        xtjsxxb.setCjsj(new Date());
        xtjsxxb.setCjrzj(userId);
        xtjsxxb.setJsmc(req.getName());
        xtjsxxb.setJsms(req.getDescribe());
        xtjsxxb.setJsdm(req.getCode());
        xtjsxxb.setJsssjgzj(req.getOrgId());
        return xtjsxxb;
    }

    public static Xtjsxxb updateRoleInfo(UpdateRoleInfoReq req, Long userId) {
        Xtjsxxb xtjsxxb = new Xtjsxxb();
        xtjsxxb.setXgsj(new Date());
        xtjsxxb.setXgrzj(userId);
        xtjsxxb.setZj(req.getZj());
        xtjsxxb.setJsmc(req.getName());
        xtjsxxb.setJsms(req.getDescribe());
        xtjsxxb.setJsdm(req.getCode());
        xtjsxxb.setJsssjgzj(req.getOrgId());
        xtjsxxb.setPx(req.getSx());
        return xtjsxxb;
    }

    public static Xtjsxxb deleteRoleInfo(DeleteRoleInfoReq req, Long userId) {
        Xtjsxxb xtjsxxb = new Xtjsxxb();
        xtjsxxb.setXgsj(new Date());
        xtjsxxb.setXgrzj(userId);
        xtjsxxb.setScbz(DeleteFlagEnum.LUOJI_DELETE.getDelFlagCode());
        xtjsxxb.setZj(req.getZj());
        return xtjsxxb;
    }

    public static Xtzyxxb addResourcesInfo(AddResourcesInfoReq req, Long userId) {
        Xtzyxxb xtzyxxb = new Xtzyxxb();
        xtzyxxb.setCjsj(new Date());
        xtzyxxb.setCjrzj(userId);
        xtzyxxb.setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
        xtzyxxb.setFjzywydm(req.getParentCode());
        xtzyxxb.setFjzyzj(req.getParentZj());
        xtzyxxb.setZywydm(req.getCode());
        xtzyxxb.setZylx(req.getTypeId());
        xtzyxxb.setZyqdlx(req.getChannel());
        xtzyxxb.setZyms(req.getDescribe());
        return xtzyxxb;
    }

    public static Xtzyxxb updateResourcesInfo(UpdateResourcesInfoReq req, Long userId) {
        Xtzyxxb xtzyxxb = new Xtzyxxb();
        xtzyxxb.setXgsj(new Date());
        xtzyxxb.setXgrzj(userId);
        xtzyxxb.setZj(req.getZj());
        xtzyxxb.setFjzywydm(req.getParentCode());
        xtzyxxb.setFjzyzj(req.getParentZj());
        xtzyxxb.setZywydm(req.getCode());
        xtzyxxb.setPx(req.getSx());
        xtzyxxb.setZylx(req.getTypeId());
        xtzyxxb.setZyqdlx(req.getChannel());
        xtzyxxb.setZyms(req.getDescribe());
        return xtzyxxb;
    }

    public static Xtzyxxb deleteResourcesInfo(DeleteResourcesInfoReq req, Long userId) {
        Xtzyxxb xtzyxxb = new Xtzyxxb();
        xtzyxxb.setXgsj(new Date());
        xtzyxxb.setXgrzj(userId);
        xtzyxxb.setScbz(DeleteFlagEnum.LUOJI_DELETE.getDelFlagCode());
        xtzyxxb.setZj(req.getZj());
        return xtzyxxb;
    }

    public static Xtjszyxxb addRoleResourceInfo(AddRoleResourceReq req, Long userId) {
        Xtjszyxxb xtjszyxxb = new Xtjszyxxb();
        xtjszyxxb.setCjsj(new Date());
        xtjszyxxb.setCjrzj(userId);
        xtjszyxxb.setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
        xtjszyxxb.setXtzyzj(req.getResourceId());
        xtjszyxxb.setXtjszj(req.getRoleId());
        return xtjszyxxb;
    }

    public static Xtjszyxxb updateRoleResourceInfo(UpdateRoleResourceReq req, Long userId) {
        Xtjszyxxb xtjszyxxb = new Xtjszyxxb();
        xtjszyxxb.setXgsj(new Date());
        xtjszyxxb.setXgrzj(userId);
        xtjszyxxb.setZj(req.getZj());
        xtjszyxxb.setXtjszj(req.getRoleId());
        xtjszyxxb.setXtzyzj(req.getResourceId());
        return xtjszyxxb;
    }

    public static Xtjszyxxb deleteRoleResourceInfo(DeleteRoleResourceReq req, Long userId) {
        Xtjszyxxb xtjszyxxb = new Xtjszyxxb();
        xtjszyxxb.setXgsj(new Date());
        xtjszyxxb.setXgrzj(userId);
        xtjszyxxb.setScbz(DeleteFlagEnum.LUOJI_DELETE.getDelFlagCode());
        xtjszyxxb.setZj(req.getZj());
        return xtjszyxxb;
    }

    public static Xtryjsxxb addUserRoleInfo(AddUserRoleInfoReq req, Long userId) {
        Xtryjsxxb xtryjsxxb = new Xtryjsxxb();
        xtryjsxxb.setCjsj(new Date());
        xtryjsxxb.setCjrzj(userId);
        xtryjsxxb.setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
        xtryjsxxb.setXtryzj(req.getUserId());
        xtryjsxxb.setXtjszj(req.getRoleId());
        return xtryjsxxb;
    }

    public static Xtryjsxxb updateUserRoleInfo(UpdateUserRoleInfoReq req, Long userId) {
        Xtryjsxxb xtryjsxxb = new Xtryjsxxb();
        xtryjsxxb.setXgsj(new Date());
        xtryjsxxb.setXgrzj(userId);
        xtryjsxxb.setZj(req.getZj());
        xtryjsxxb.setXtryzj(req.getUserId());
        xtryjsxxb.setXtjszj(req.getRoleId());
        return xtryjsxxb;
    }

    public static Xtryjsxxb deleteUserRoleInfo(DeleteUserRoleInfoReq req, Long userId) {
        Xtryjsxxb xtryjsxxb = new Xtryjsxxb();
        xtryjsxxb.setXgsj(new Date());
        xtryjsxxb.setXgrzj(userId);
        xtryjsxxb.setScbz(DeleteFlagEnum.LUOJI_DELETE.getDelFlagCode());
        xtryjsxxb.setZj(req.getZj());
        return xtryjsxxb;
    }

    public static Xtryjgxxb addUserOrgInfo(AddUserOrgInfoReq req, Long userId) {
        Xtryjgxxb xtryjgxxb = new Xtryjgxxb();
        xtryjgxxb.setCjsj(new Date());
        xtryjgxxb.setCjrzj(userId);
        xtryjgxxb.setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
        xtryjgxxb.setXtryzj(req.getUserId());
        xtryjgxxb.setXtjgzj(req.getOrgId());
        return xtryjgxxb;
    }

    public static Xtryjgxxb updateUserOrgInfo(UpdateUserOrgInfoReq req, Long userId) {
        Xtryjgxxb xtryjgxxb = new Xtryjgxxb();
        xtryjgxxb.setXgsj(new Date());
        xtryjgxxb.setXgrzj(userId);
        xtryjgxxb.setZj(req.getZj());
        xtryjgxxb.setXtjgzj(req.getOrgId());
        xtryjgxxb.setXtryzj(req.getUserId());
        return xtryjgxxb;
    }

    public static Xtryjgxxb deleteUserOrgInfo(DeleteUserOrgInfoReq req, Long userId) {
        Xtryjgxxb xtryjgxxb = new Xtryjgxxb();
        xtryjgxxb.setXgsj(new Date());
        xtryjgxxb.setXgrzj(userId);
        xtryjgxxb.setScbz(DeleteFlagEnum.LUOJI_DELETE.getDelFlagCode());
        xtryjgxxb.setZj(req.getZj());
        return xtryjgxxb;
    }
}
