package com.xiaoyu.provider.user.service.impl;

import com.alibaba.nacos.common.utils.CollectionUtils;
import com.xiaoyu.common.base.req.LoginUserInfo;
import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.common.base.util.HttpServletRequestUtil;
import com.xiaoyu.provider.user.dao.XtzxjjxqxxbMapper;
import com.xiaoyu.provider.user.dao.XtzxjjxxbMapper;
import com.xiaoyu.provider.user.dao.ex.XtzxjjxqxxbMapperEx;
import com.xiaoyu.provider.user.dao.ex.XtzxjjxxbMapperEx;
import com.xiaoyu.provider.user.entity.Xtzxjjxxb;
import com.xiaoyu.provider.user.req.*;
import com.xiaoyu.provider.user.resp.*;
import com.xiaoyu.provider.user.service.CoreService;
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
public class CoreServiceImpl implements CoreService {

    @Autowired
    private XtzxjjxxbMapper xtzxjjxxbMapper;
    @Autowired
    private XtzxjjxxbMapperEx xtzxjjxxbMapperEx;
    @Autowired
    private XtzxjjxqxxbMapper xtzxjjxqxxbMapper;
    @Autowired
    private XtzxjjxqxxbMapperEx xtzxjjxqxxbMapperEx;

    @Override
    public TableResult<SelectCoreDataResp> selectCoreInfo(SelectCoreInfoReq req) {
        List<SelectCoreDataResp> resps = xtzxjjxxbMapperEx.selectCoreDataInfo(req);
        Integer total = xtzxjjxxbMapperEx.countSelectCoreDataInfo(req);
        if (total > 0){
            List<SelectCoreInfoResp> list = xtzxjjxqxxbMapperEx.selectAllCoreInfo();
            if (CollectionUtils.isNotEmpty(list)){
                ReqParamToEntityUtils.selectCoreInfo(resps,list);
            }
        }
        return TableResult.success(resps,total);
    }

    @Override
    public CommonResult<SelectCoreContentInfoResp> selectCoreContentById(SelectCoreContentInfoReq req) {
        SelectCoreContentInfoResp resp = xtzxjjxqxxbMapperEx.selectCoreContentById(req);
        return CommonResult.success(resp);
    }

    @Override
    public CommonResult<SelectCoreDetailsInfoResp> selectCoreDetailsById(SelectCoreDetailsInfoReq req) {
        SelectCoreDetailsInfoResp resps = xtzxjjxxbMapperEx.selectCoreDetailsById(req);
        return CommonResult.success(resps);
    }

    @Override
    public CommonResult<AddCoreContentInfoResp> addCoreContentInfo(AddCoreContentInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        xtzxjjxqxxbMapperEx.insertXtzxjjxqxxb(ReqParamToEntityUtils.addCoreContentInfo(req,loginUserInfo.getUserId()));
        return CommonResult.success();
    }

    @Override
    public CommonResult<UpdateCoreContentInfoResp> updateCoreContentInfo(UpdateCoreContentInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        xtzxjjxqxxbMapper.updateByPrimaryKeySelective(ReqParamToEntityUtils.updateCoreContentInfo(req,loginUserInfo.getUserId()));
        return CommonResult.success();
    }

    @Override
    public CommonResult<DeleteCoreContentInfoResp> deleteCoreContentInfo(DeleteCoreContentInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        xtzxjjxqxxbMapper.updateByPrimaryKeySelective(ReqParamToEntityUtils.deleteCoreContentInfo(req,loginUserInfo.getUserId()));
        return CommonResult.success();
    }

    @Override
    public CommonResult<AddCoreDetailsInfoResp> addCoreDetailsInfo(AddCoreDetailsInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtzxjjxxb xtzxjjxxb = ReqParamToEntityUtils.addCoreDetailsInfo(req,loginUserInfo.getUserId());
        xtzxjjxxbMapperEx.insertXtzxjjxxb(xtzxjjxxb);
        /*Xtzxjjxqxxb xtzxjjxqxxb = ReqParamToEntityUtils.addCoreDetailsXqInfo(xtzxjjxxb.getZj(),loginUserInfo.getUserId(),req.getData());
        xtzxjjxqxxbMapper.insertSelective(xtzxjjxqxxb);*/
        return CommonResult.success();
    }

    @Override
    public CommonResult<UpdateCoreDetailsInfoResp> updateCoreDetailsInfo(UpdateCoreDetailsInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtzxjjxxb xtzxjjxxb = ReqParamToEntityUtils.updateCoreDetailsInfo(req,loginUserInfo.getUserId());
        xtzxjjxxbMapper.updateByPrimaryKeySelective(xtzxjjxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<DeleteCoreDetailsInfoResp> deleteCoreDetailsInfo(DeleteCoreDetailsInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtzxjjxxb xtzxjjxxb = ReqParamToEntityUtils.deleteCoreDetailsInfo(req,loginUserInfo.getUserId());
        xtzxjjxxbMapper.updateByPrimaryKeySelective(xtzxjjxxb);
        return CommonResult.success();
    }
}
