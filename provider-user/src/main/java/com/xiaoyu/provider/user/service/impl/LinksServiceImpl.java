package com.xiaoyu.provider.user.service.impl;

import com.xiaoyu.common.base.req.LoginUserInfo;
import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.common.base.util.HttpServletRequestUtil;
import com.xiaoyu.provider.user.dao.XtyqljxxbMapper;
import com.xiaoyu.provider.user.dao.ex.XtyqljxxbMapperEx;
import com.xiaoyu.provider.user.entity.Xtyqljxxb;
import com.xiaoyu.provider.user.req.*;
import com.xiaoyu.provider.user.resp.*;
import com.xiaoyu.provider.user.service.LinksService;
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
public class LinksServiceImpl implements LinksService {

    @Autowired
    private XtyqljxxbMapper xtyqljxxbMapper;
    @Autowired
    private XtyqljxxbMapperEx xtyqljxxbMapperEx;

    @Override
    public CommonResult<List<SelectLinksDataResp>> selectLinksInfo(SelectLinksInfoReq req) {
        List<SelectLinksDataResp> resps = xtyqljxxbMapperEx.selectLinksInfo(req);
        return CommonResult.success(resps);
    }

    @Override
    public TableResult<SelectLinksTableResp> selectLinksTable(SelectLinksTableInfoReq req) {
        List<SelectLinksTableResp> rows = xtyqljxxbMapperEx.selectLinksTable(req);
        Integer total = xtyqljxxbMapperEx.countSelectLinksTable(req);
        return TableResult.success(rows,total);
    }

    @Override
    public CommonResult<AddLinksInfoResp> addLinksInfo(AddLinksInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtyqljxxb xtyqljxxb = ReqParamToEntityUtils.addLinksInfo(req,loginUserInfo.getUserId());
        xtyqljxxbMapper.insertSelective(xtyqljxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<UpdateLinksInfoResp> updateLinksInfo(UpdateLinksInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtyqljxxb xtyqljxxb = ReqParamToEntityUtils.updateLinksInfo(req,loginUserInfo.getUserId());
        xtyqljxxbMapper.updateByPrimaryKeySelective(xtyqljxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<DeleteLinksInfoResp> deleteLinksInfo(DeleteLinksInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtyqljxxb xtyqljxxb = ReqParamToEntityUtils.deleteLinksInfo(req,loginUserInfo.getUserId());
        xtyqljxxbMapper.updateByPrimaryKeySelective(xtyqljxxb);
        return CommonResult.success();
    }
}
