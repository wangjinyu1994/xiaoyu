package com.xiaoyu.provider.system.utils;

import com.xiaoyu.common.base.constants.DeleteFlagEnum;
import com.xiaoyu.common.base.constants.SysQyztEnum;
import com.xiaoyu.provider.system.entity.Xtdljkxxb;
import com.xiaoyu.provider.system.entity.Xthbmdxxb;
import com.xiaoyu.provider.system.req.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * WJY
 */
public class SysReqParamToEntityUtils {

    /**
     * 根据主键修改黑名单请求接口
     */
    public static Xthbmdxxb updateBlackById(UpdateBlackByIdReq req, Long userId) {
        Xthbmdxxb xthbmdxxb = new Xthbmdxxb();
        xthbmdxxb.setXgsj(new Date());
        xthbmdxxb.setXgrzj(userId);
        xthbmdxxb.setZj(req.getZj());
        xthbmdxxb.setLx(req.getStatus());
        xthbmdxxb.setQyzt(req.getStatus());
        xthbmdxxb.setDz(req.getAddress());
        return xthbmdxxb;
    }

    /**
     * 根据主键删除黑名单请求接口
     */
    public static Xthbmdxxb deleteBlackById(DeleteBlackByIdReq req, Long userId) {
        Xthbmdxxb xthbmdxxb = new Xthbmdxxb();
        xthbmdxxb.setScbz(DeleteFlagEnum.LUOJI_DELETE.getDelFlagCode());
        xthbmdxxb.setXgsj(new Date());
        xthbmdxxb.setXgrzj(userId);
        xthbmdxxb.setZj(req.getZj());
        return xthbmdxxb;
    }

    public static Xthbmdxxb addBlackInfo(AddBlackInfoReq req, Long userId) {
        Xthbmdxxb xthbmdxxb = new Xthbmdxxb();
        xthbmdxxb.setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
        xthbmdxxb.setCjsj(new Date());
        xthbmdxxb.setCjrzj(userId);
        xthbmdxxb.setLx(req.getType());
        xthbmdxxb.setDz(req.getAddress());
        xthbmdxxb.setQyzt(SysQyztEnum.HMD_QY.getCode());
        xthbmdxxb.setSm(req.getExplain());
        return xthbmdxxb;
    }

    public static List<Xthbmdxxb> addBlackListInfo(List<AddBlackInfoReq> body, Long userId) {
        List<Xthbmdxxb> list = new ArrayList<>();
        final Xthbmdxxb[] xthbmdxxb = {null};
        Date now = new Date();
        body.forEach(data->{
            xthbmdxxb[0] = new Xthbmdxxb();
            xthbmdxxb[0].setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
            xthbmdxxb[0].setCjsj(now);
            xthbmdxxb[0].setCjrzj(userId);
            xthbmdxxb[0].setLx(data.getType());
            xthbmdxxb[0].setDz(data.getAddress());
            xthbmdxxb[0].setQyzt(SysQyztEnum.HMD_QY.getCode());
            xthbmdxxb[0].setSm(data.getExplain());
            list.add(xthbmdxxb[0]);
        });
        return list;
    }

    public static Xtdljkxxb updateLoginInterfaceById(UpdateLoginInterByIdReq req, Long userId) {
        Xtdljkxxb xtdljkxxb = new Xtdljkxxb();
        xtdljkxxb.setXgsj(new Date());
        xtdljkxxb.setXgrzj(userId);
        xtdljkxxb.setZj(req.getZj());
        xtdljkxxb.setFwmc(req.getServiceName());
        xtdljkxxb.setJkmc(req.getAddress());
        xtdljkxxb.setJkzt(req.getStatus());
        xtdljkxxb.setSm(req.getExplain());
        return xtdljkxxb;
    }

    public static Xtdljkxxb deleteLoginInterfaceById(DeleteLoginInterByIdReq req, Long userId) {
        Xtdljkxxb xtdljkxxb = new Xtdljkxxb();
        xtdljkxxb.setScbz(DeleteFlagEnum.LUOJI_DELETE.getDelFlagCode());
        xtdljkxxb.setXgsj(new Date());
        xtdljkxxb.setXgrzj(userId);
        xtdljkxxb.setZj(req.getZj());
        return xtdljkxxb;
    }

    public static Xtdljkxxb addLoginInterfaceInfo(AddLoginInterInfoReq req, Long userId) {
        Xtdljkxxb xtdljkxxb = new Xtdljkxxb();
        xtdljkxxb.setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
        xtdljkxxb.setCjsj(new Date());
        xtdljkxxb.setCjrzj(userId);
        xtdljkxxb.setFwmc(req.getServiceName());
        xtdljkxxb.setJkmc(req.getAddress());
        xtdljkxxb.setJkzt(SysQyztEnum.HMD_QY.getCode());
        xtdljkxxb.setSm(req.getExplain());
        return xtdljkxxb;
    }

    public static List<Xtdljkxxb> addLoginInterfaceListInfo(List<AddLoginInterInfoReq> body, Long userId) {
        List<Xtdljkxxb> list = new ArrayList<>();
        final Xtdljkxxb[] xtdljkxxb = {null};
        Date now = new Date();
        body.forEach(data->{
            xtdljkxxb[0] = new Xtdljkxxb();
            xtdljkxxb[0].setScbz(DeleteFlagEnum.NOT_DELETE.getDelFlagCode());
            xtdljkxxb[0].setCjsj(now);
            xtdljkxxb[0].setCjrzj(userId);
            xtdljkxxb[0].setFwmc(data.getServiceName());
            xtdljkxxb[0].setJkmc(data.getAddress());
            xtdljkxxb[0].setJkzt(SysQyztEnum.HMD_QY.getCode());
            xtdljkxxb[0].setSm(data.getExplain());
            list.add(xtdljkxxb[0]);
        });
        return list;
    }
}
