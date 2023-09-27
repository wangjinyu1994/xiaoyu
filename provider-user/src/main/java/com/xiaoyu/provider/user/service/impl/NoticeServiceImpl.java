package com.xiaoyu.provider.user.service.impl;

import com.alibaba.nacos.common.utils.CollectionUtils;
import com.xiaoyu.common.base.req.LoginUserInfo;
import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.common.base.util.HttpServletRequestUtil;
import com.xiaoyu.provider.user.dao.XtxxtzfjxxbMapper;
import com.xiaoyu.provider.user.dao.XtxxtzxxbMapper;
import com.xiaoyu.provider.user.dao.ex.XtxxtzfjxxbMapperEx;
import com.xiaoyu.provider.user.dao.ex.XtxxtzxxbMapperEx;
import com.xiaoyu.provider.user.entity.Xtxxtzfjxxb;
import com.xiaoyu.provider.user.entity.Xtxxtzxxb;
import com.xiaoyu.provider.user.req.*;
import com.xiaoyu.provider.user.resp.*;
import com.xiaoyu.provider.user.service.NoticeService;
import com.xiaoyu.provider.user.util.ReqParamToEntityUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Objects;

/**
 * WJY
 */
@Service
@Slf4j
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private XtxxtzxxbMapper xtxxtzxxbMapper;
    @Autowired
    private XtxxtzxxbMapperEx xtxxtzxxbMapperEx;
    @Autowired
    private XtxxtzfjxxbMapper xtxxtzfjxxbMapper;
    @Autowired
    private XtxxtzfjxxbMapperEx xtxxtzfjxxbMapperEx;

    @Override
    public TableResult<SelectNoticTableResp> selectNoticTable(SelectNoticTableReq req) {
        List<SelectNoticTableResp> rows = xtxxtzxxbMapperEx.selectNoticTable(req);
        Integer total = xtxxtzxxbMapperEx.countSelectNoticTable(req);
        return TableResult.success(rows,total);
    }

    @Override
    public CommonResult<List<SelectNoticIndexResp>> selectNoticIndex(SelectNoticIndexReq req) {
        List<SelectNoticIndexResp> resps = xtxxtzxxbMapperEx.selectNoticIndex(req);
        return CommonResult.success(resps);
    }

    @Override
    public CommonResult<SelectNoticByIdResp> selectNoticById(SelectNoticByIdReq req) {
        SelectNoticByIdResp resp = xtxxtzxxbMapperEx.selectNoticById(req);
        if (Objects.nonNull(resp)){
            resp.setBody(xtxxtzfjxxbMapperEx.selectXtxxtzfjxxbByXxtzzj(resp.getZj()));
        }
        return CommonResult.success(resp);
    }

    @Transactional
    @Override
    public CommonResult<AddNoticInfoResp> addNoticInfo(AddNoticInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtxxtzxxb xtxxtzxxb = ReqParamToEntityUtils.addNoticInfo(req,loginUserInfo.getUserId());
        xtxxtzxxbMapper.insertSelective(xtxxtzxxb);
        if (CollectionUtils.isNotEmpty(req.getBody())){
            List<Xtxxtzfjxxb> xtxxtzfjxxbs = ReqParamToEntityUtils.addNoticEnclosure(xtxxtzxxb.getZj(),loginUserInfo.getUserId(),req.getBody());
            xtxxtzfjxxbMapperEx.insertXtxxtzfjxxbBath(xtxxtzfjxxbs);
        }
        return CommonResult.success();
    }

    @Override
    public CommonResult<UpdateNoticInfoResp> updateNoticInfo(UpdateNoticInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtxxtzxxb xtxxtzxxb = ReqParamToEntityUtils.updateNoticInfo(req,loginUserInfo.getUserId());
        xtxxtzxxbMapper.updateByPrimaryKeySelective(xtxxtzxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<DeleteNoticInfoResp> deleteNoticInfo(DeleteNoticInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtxxtzxxb xtxxtzxxb = ReqParamToEntityUtils.deleteNoticInfo(req,loginUserInfo.getUserId());
        xtxxtzxxbMapper.updateByPrimaryKeySelective(xtxxtzxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<AddNoticEnclosureInfoResp> addNoticEnclosureInfo(AddNoticEnclosureInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtxxtzfjxxb xtxxtzfjxxb = ReqParamToEntityUtils.addNoticEnclosureInfo(req,loginUserInfo.getUserId());
        xtxxtzfjxxbMapperEx.insertXtxxtzfjxxb(xtxxtzfjxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<AddNoticEnclosureInfoResp> addNoticEnclosureListInfo(AddNoticEnclosureListInfo req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        List<Xtxxtzfjxxb> xtxxtzfjxxbs = ReqParamToEntityUtils.addNoticEnclosureListInfo(req,loginUserInfo.getUserId());
        xtxxtzfjxxbMapperEx.insertXtxxtzfjxxbBath(xtxxtzfjxxbs);
        return CommonResult.success();
    }

    @Override
    public CommonResult<UpdateNoticEnclosureInfoResp> updateNoticEnclosureInfo(UpdateNoticEnclosureInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtxxtzfjxxb xtxxtzfjxxb = ReqParamToEntityUtils.updateNoticEnclosureInfo(req,loginUserInfo.getUserId());
        xtxxtzfjxxbMapper.updateByPrimaryKeySelective(xtxxtzfjxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<DeleteNoticEnclosureInfoResp> deleteNoticEnclosureInfo(DeleteNoticEnclosureInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtxxtzfjxxb xtxxtzfjxxb = ReqParamToEntityUtils.deleteNoticEnclosureInfo(req,loginUserInfo.getUserId());
        xtxxtzfjxxbMapper.updateByPrimaryKeySelective(xtxxtzfjxxb);
        return CommonResult.success();
    }
}
