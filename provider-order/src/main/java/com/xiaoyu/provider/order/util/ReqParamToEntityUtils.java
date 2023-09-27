package com.xiaoyu.provider.order.util;


import com.alibaba.nacos.common.utils.CollectionUtils;
import com.xiaoyu.common.base.constants.*;
import com.xiaoyu.common.base.util.DateUtil;
import com.xiaoyu.provider.order.entity.Xttgxmddxxb;
import com.xiaoyu.provider.order.entity.Xttgxmddyspxxb;
import com.xiaoyu.provider.order.entity.Xttgxmfjxxb;
import com.xiaoyu.provider.order.entity.Xttgxmxxb;
import com.xiaoyu.provider.order.req.*;
import org.springframework.beans.BeanUtils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * WJY
 * 请求参数转实体类工具类
 */
public class ReqParamToEntityUtils {


    public static Xttgxmxxb addProjectInfo(AddProjectInfoReq req, Long userId) {
        Xttgxmxxb xttgxmxxb = new Xttgxmxxb();
        xttgxmxxb.setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
        xttgxmxxb.setCjsj(new Date());
        xttgxmxxb.setCjrzj(userId);
        xttgxmxxb.setXmmc(req.getName());
        xttgxmxxb.setZy(req.getSummary());
        xttgxmxxb.setXmms(req.getDescribe());
        xttgxmxxb.setSfxg(req.getQuota());
        xttgxmxxb.setZdgmsl(req.getMax());
        xttgxmxxb.setSpdj(req.getNumber());
        xttgxmxxb.setDqzt(TgxmDqztEnum.TGXM_QY.getCode());
        return xttgxmxxb;
    }

    public static Xttgxmxxb updateProjectInfo(UpdateProjectInfoReq req, Long userId) {
        Xttgxmxxb xttgxmxxb = new Xttgxmxxb();
        xttgxmxxb.setXgsj(new Date());
        xttgxmxxb.setXgrzj(userId);
        xttgxmxxb.setXmmc(req.getName());
        xttgxmxxb.setZy(req.getSummary());
        xttgxmxxb.setXmms(req.getDescribe());
        xttgxmxxb.setSfxg(req.getQuota());
        xttgxmxxb.setZdgmsl(req.getMax());
        xttgxmxxb.setSpdj(req.getNumber());
        xttgxmxxb.setDqzt(req.getStatus());
        xttgxmxxb.setZj(req.getZj());
        return xttgxmxxb;
    }

    public static Xttgxmxxb deleteProjectInfo(DeleteProjectInfoReq req, Long userId) {
        Xttgxmxxb xttgxmxxb = new Xttgxmxxb();
        xttgxmxxb.setXgsj(new Date());
        xttgxmxxb.setXgrzj(userId);
        xttgxmxxb.setZj(req.getZj());
        xttgxmxxb.setScbz(DeleteFlagEnum.LUOJI_DELETE.getDelFlagCode());
        return xttgxmxxb;
    }

    public static Xttgxmfjxxb addProjectEnclosureInfo(AddProjectEnclosureInfoReq req, Long userId) {
        Xttgxmfjxxb xttgxmfjxxb = new Xttgxmfjxxb();
        xttgxmfjxxb.setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
        xttgxmfjxxb.setCjsj(new Date());
        xttgxmfjxxb.setCjrzj(userId);
        xttgxmfjxxb.setFjbt(req.getTitle());
        xttgxmfjxxb.setFjdx(req.getRam());
        xttgxmfjxxb.setFjdz(req.getAddress());
        xttgxmfjxxb.setTgxmbzj(req.getProjectId());
        return xttgxmfjxxb;
    }

    public static List<Xttgxmfjxxb> addProjectEnclosureListInfo(AddProjectEnclosureListInfo req, Long userId) {
        List<Xttgxmfjxxb> list = new ArrayList<>();
        final Xttgxmfjxxb[] xttgxmfjxxb = {null};
        req.getBody().forEach(data->{
            xttgxmfjxxb[0] = new Xttgxmfjxxb();
            xttgxmfjxxb[0].setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
            xttgxmfjxxb[0].setCjsj(new Date());
            xttgxmfjxxb[0].setCjrzj(userId);
            xttgxmfjxxb[0].setTgxmbzj(data.getProjectId());
            xttgxmfjxxb[0].setFjbt(data.getTitle());
            xttgxmfjxxb[0].setFjdx(data.getRam());
            xttgxmfjxxb[0].setFjdz(data.getAddress());
            list.add(xttgxmfjxxb[0]);
        });
        return list;
    }

    public static Xttgxmfjxxb updateProjectEnclosureInfo(UpdateProjectEnclosureInfoReq req, Long userId) {
        Xttgxmfjxxb xttgxmfjxxb = new Xttgxmfjxxb();
        xttgxmfjxxb.setXgsj(new Date());
        xttgxmfjxxb.setXgrzj(userId);
        xttgxmfjxxb.setZj(req.getZj());
        xttgxmfjxxb.setTgxmbzj(req.getProjectId());
        xttgxmfjxxb.setFjbt(req.getTitle());
        xttgxmfjxxb.setFjdx(req.getRam());
        xttgxmfjxxb.setFjdz(req.getAddress());
        return xttgxmfjxxb;
    }

    public static Xttgxmfjxxb deleteProjectEnclosureInfo(DeleteProjectEnclosureInfoReq req, Long userId) {
        Xttgxmfjxxb xttgxmfjxxb = new Xttgxmfjxxb();
        xttgxmfjxxb.setXgsj(new Date());
        xttgxmfjxxb.setXgrzj(userId);
        xttgxmfjxxb.setZj(req.getZj());
        xttgxmfjxxb.setScbz(DeleteFlagEnum.LUOJI_DELETE.getDelFlagCode());
        return xttgxmfjxxb;
    }

    public static List<Xttgxmfjxxb> addProjectEnclosure(List<AddProjectEnclosureInfo> body, Long zj, Long userId) {
        List<Xttgxmfjxxb> list = new ArrayList<>();
        final Xttgxmfjxxb[] xttgxmfjxxb = {null};
        body.forEach(data->{
            xttgxmfjxxb[0] = new Xttgxmfjxxb();
            xttgxmfjxxb[0].setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
            xttgxmfjxxb[0].setCjsj(new Date());
            xttgxmfjxxb[0].setCjrzj(userId);
            xttgxmfjxxb[0].setTgxmbzj(zj);
            xttgxmfjxxb[0].setFjbt(data.getTitle());
            xttgxmfjxxb[0].setFjdx(data.getRam());
            xttgxmfjxxb[0].setFjdz(data.getAddress());
            list.add(xttgxmfjxxb[0]);
        });
        return list;
    }

    public static Xttgxmddyspxxb addPreOrderInfo(AddPreOrderInfoReq req, Long userId) {
        Xttgxmddyspxxb xttgxmddyspxxb = new Xttgxmddyspxxb();
        xttgxmddyspxxb.setCjsj(new Date());
        xttgxmddyspxxb.setCjrzj(userId);
        xttgxmddyspxxb.setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
        xttgxmddyspxxb.setXtryzj(userId);
        xttgxmddyspxxb.setJgzj(req.getOrgId());
        xttgxmddyspxxb.setTgxmzj(req.getProjectId());
        xttgxmddyspxxb.setTgsl(req.getNumber());
        xttgxmddyspxxb.setFkje(req.getMoney());
        xttgxmddyspxxb.setFkfs(req.getPayMethod());
        xttgxmddyspxxb.setFkzt(req.getPayStatus());
        xttgxmddyspxxb.setShzt(TgxmShztEnum.TGXM_SHZ.getCode());
        xttgxmddyspxxb.setLsh(req.getSerialNumber());
        xttgxmddyspxxb.setShdz(req.getAddress());
        return xttgxmddyspxxb;
    }

    public static Xttgxmddyspxxb updatePreOrderInfo(UpdatePreOrderInfoReq req, Long userId) {
        Xttgxmddyspxxb xttgxmddyspxxb = new Xttgxmddyspxxb();
        xttgxmddyspxxb.setXgsj(new Date());
        xttgxmddyspxxb.setXgrzj(userId);
        xttgxmddyspxxb.setShdz(req.getAddress());
        xttgxmddyspxxb.setLsh(req.getSerialNumber());
        xttgxmddyspxxb.setJgzj(req.getOrgId());
        xttgxmddyspxxb.setTgxmzj(req.getProjectId());
        xttgxmddyspxxb.setTgsl(req.getNumber());
        xttgxmddyspxxb.setFkje(req.getMoney());
        xttgxmddyspxxb.setFkfs(req.getPayMethod());
        xttgxmddyspxxb.setFkzt(req.getPayStatus());
        xttgxmddyspxxb.setShzt(req.getExamStatus());
        xttgxmddyspxxb.setBhyy(req.getReject());
        return xttgxmddyspxxb;
    }

    public static Xttgxmddyspxxb deletePreOrderInfo(DeletePreOrderInfoReq req, Long userId) {
        Xttgxmddyspxxb xttgxmddyspxxb = new Xttgxmddyspxxb();
        xttgxmddyspxxb.setXgsj(new Date());
        xttgxmddyspxxb.setXgrzj(userId);
        xttgxmddyspxxb.setZj(req.getZj());
        xttgxmddyspxxb.setScbz(DeleteFlagEnum.LUOJI_DELETE.getDelFlagCode());
        return xttgxmddyspxxb;
    }

    public static boolean addPreOrderInfoLshjy(List<Xttgxmddyspxxb> xttgxmddyspxxbs) {
        if (CollectionUtils.isNotEmpty(xttgxmddyspxxbs)){
            // 不是空 说明之前注册过
            Xttgxmddyspxxb xttgxmddyspxxb = xttgxmddyspxxbs.get(xttgxmddyspxxbs.size() - 1);
            if (TgxmShztEnum.TGXM_BH.getCode().equals(xttgxmddyspxxb.getShzt())){
                // 上一次是审核驳回 可以再次添加
                return true;
            } else {
                // 上一次是审核中 或者审核通过 不可以添加
                return false;
            }
        }
        return true;
    }

    public static Xttgxmddyspxxb examProOrderInfo(ExamProOrderInfoReq req, Long userId,Date shsj) {
        Xttgxmddyspxxb xttgxmddyspxxb = new Xttgxmddyspxxb();
        xttgxmddyspxxb.setXgsj(shsj);
        xttgxmddyspxxb.setXgrzj(userId);
        xttgxmddyspxxb.setZj(req.getZj());
        xttgxmddyspxxb.setShzt(req.getExamStatus());
        xttgxmddyspxxb.setShsj(shsj);
        xttgxmddyspxxb.setBhyy(req.getReason());
        return xttgxmddyspxxb;
    }

    public static Xttgxmddxxb initXttgxmddxxbEamxPass(Xttgxmddyspxxb xttgxmddyspxxb, Long userId) {
        Xttgxmddxxb xttgxmddxxb = new Xttgxmddxxb();
        BeanUtils.copyProperties(xttgxmddyspxxb,xttgxmddxxb);
        xttgxmddxxb.setFhzt(TgxmFhztEnum.TGXM_WFH.getCode());
        xttgxmddxxb.setQszt(TgxmQsztEnum.TGXM_WFH.getCode());
        return xttgxmddxxb;
    }

    public static Xttgxmddxxb addOrderInfo(AddOrderInfoReq req, Long userId) throws ParseException {
        Xttgxmddxxb xttgxmddxxb = new Xttgxmddxxb();
        xttgxmddxxb.setCjsj(new Date());
        xttgxmddxxb.setCjrzj(userId);
        xttgxmddxxb.setXtryzj(req.getUserId());
        xttgxmddxxb.setJgzj(req.getOrgId());
        xttgxmddxxb.setTgxmzj(req.getProjectId());
        xttgxmddxxb.setTgsl(req.getNumber());
        xttgxmddxxb.setFkje(req.getMoney());
        xttgxmddxxb.setLsh(req.getSerialNumber());
        xttgxmddxxb.setShzt(req.getExamStatus());
        xttgxmddxxb.setShsj(DateUtil.parseStr2DateDefault(req.getExamDate()));
        xttgxmddxxb.setShrzj(req.getExamUserId());
        xttgxmddxxb.setFkfs(req.getPayMethod());
        xttgxmddxxb.setFkzt(req.getPayStatus());
        xttgxmddxxb.setFhzt(req.getDeliverStatus());
        xttgxmddxxb.setQszt(req.getSigStatus());
        xttgxmddxxb.setQssj(DateUtil.parseStr2DateDefault(req.getSigDate()));
        xttgxmddxxb.setShdz(req.getAddress());
        return xttgxmddxxb;
    }

    public static Xttgxmddxxb updateOrderInfo(UpdateOrderInfoReq req, Long userId) throws ParseException {
        Xttgxmddxxb xttgxmddxxb = new Xttgxmddxxb();
        xttgxmddxxb.setXgsj(new Date());
        xttgxmddxxb.setXgrzj(userId);
        xttgxmddxxb.setShdz(req.getAddress());
        xttgxmddxxb.setFhzt(req.getDeliverStatus());
        xttgxmddxxb.setQssj(DateUtil.parseStr2DateDefault(req.getSigDate()));
        xttgxmddxxb.setQszt(req.getSigStatus());
        return xttgxmddxxb;
    }

    public static Xttgxmddxxb deleteOrderInfo(DeleteOrderInfoReq req, Long userId) {
        Xttgxmddxxb xttgxmddxxb = new Xttgxmddxxb();
        xttgxmddxxb.setXgsj(new Date());
        xttgxmddxxb.setXgrzj(userId);
        xttgxmddxxb.setZj(req.getZj());
        xttgxmddxxb.setScbz(DeleteFlagEnum.LUOJI_DELETE.getDelFlagCode());
        return xttgxmddxxb;
    }
}
