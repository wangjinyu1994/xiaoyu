package com.xiaoyu.provider.user.service.impl;

import com.xiaoyu.common.base.req.LoginUserInfo;
import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.common.base.util.HttpServletRequestUtil;
import com.xiaoyu.provider.user.dao.XtzyxxbMapper;
import com.xiaoyu.provider.user.dao.ex.XtzyxxbMapperEx;
import com.xiaoyu.provider.user.entity.Xtjctpxxb;
import com.xiaoyu.provider.user.entity.Xtzyxxb;
import com.xiaoyu.provider.user.req.*;
import com.xiaoyu.provider.user.resp.*;
import com.xiaoyu.provider.user.service.ResourcesService;
import com.xiaoyu.provider.user.util.ReqParamToEntityUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * WJY
 */
@Service
@Slf4j
public class ResourcesServiceImpl implements ResourcesService {

    @Autowired
    private XtzyxxbMapper xtzyxxbMapper;
    @Autowired
    private XtzyxxbMapperEx xtzyxxbMapperEx;

    @Override
    public TableResult<SelectResourcesTableResp> selectResourcesTable(SelectResourcesTableReq req) {
        List<SelectResourcesTableResp> rows = xtzyxxbMapperEx.selectResourcesTable(req);
        Integer total = xtzyxxbMapperEx.countSelectResourcesTable(req);
        return TableResult.success(rows,total);
    }

    @Override
    public CommonResult<List<SelectAllResourcesResp>> selectAllResourcesList(SelectAllResourcesReq req) {
        List<SelectAllResourcesResp> resps = xtzyxxbMapperEx.selectAllResourcesList(req);
        return CommonResult.success(resps);
    }

    @Override
    public CommonResult<SelectResourcesByIdResp> selectResourcesById(SelectResourcesByIdReq req) {
        SelectResourcesByIdResp resp = xtzyxxbMapperEx.selectResourcesById(req);
        return CommonResult.success(resp);
    }

    @Override
    public CommonResult<AddResourcesInfoResp> addResourcesInfo(AddResourcesInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtzyxxb xtzyxxb = ReqParamToEntityUtils.addResourcesInfo(req,loginUserInfo.getUserId());
        xtzyxxbMapperEx.insertXtzyxxb(xtzyxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<UpdateResourcesInfoResp> updateResourcesInfo(UpdateResourcesInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtzyxxb xtzyxxb = ReqParamToEntityUtils.updateResourcesInfo(req,loginUserInfo.getUserId());
        xtzyxxbMapper.updateByPrimaryKeySelective(xtzyxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<DeleteResourcesInfoResp> deleteResourcesInfo(DeleteResourcesInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtzyxxb xtzyxxb = ReqParamToEntityUtils.deleteResourcesInfo(req,loginUserInfo.getUserId());
        xtzyxxbMapper.updateByPrimaryKeySelective(xtzyxxb);
        return CommonResult.success();
    }
}
