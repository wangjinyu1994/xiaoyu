package com.xiaoyu.provider.user.service.impl;

import com.xiaoyu.common.base.req.LoginUserInfo;
import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.common.base.util.HttpServletRequestUtil;
import com.xiaoyu.provider.user.dao.XtjctpxxbMapper;
import com.xiaoyu.provider.user.dao.ex.XtjctpxxbMapperEx;
import com.xiaoyu.provider.user.entity.Xtjctpxxb;
import com.xiaoyu.provider.user.req.*;
import com.xiaoyu.provider.user.resp.*;
import com.xiaoyu.provider.user.service.PicturesService;
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
public class PicturesServiceImpl implements PicturesService {

    @Autowired
    private XtjctpxxbMapper xtjctpxxbMapper;
    @Autowired
    private XtjctpxxbMapperEx xtjctpxxbMapperEx;

    @Override
    public TableResult<SelectPicturesTableResp> selectPicturesTable(SelectPicturesTableReq req) {
        List<SelectPicturesTableResp> rows = xtjctpxxbMapperEx.selectPicturesTable(req);
        Integer total = xtjctpxxbMapperEx.countSelectPicturesTable(req);
        return TableResult.success(rows,total);
    }

    @Override
    public CommonResult<List<SelectPicturesResp>> selectAllPicturesList(SelectPicturesReq req) {
        List<SelectPicturesResp> resps = xtjctpxxbMapperEx.selectAllPicturesList(req);
        return CommonResult.success(resps);
    }

    @Override
    public CommonResult<SelectPicturesByIdResp> selectPicturesById(SelectPicturesByIdReq req) {
        SelectPicturesByIdResp resp = xtjctpxxbMapperEx.selectPicturesById(req);
        return CommonResult.success(resp);
    }

    @Override
    public CommonResult<AddPicturesInfoResp> addPicturesInfo(AddPicturesInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtjctpxxb xtjctpxxb = ReqParamToEntityUtils.addPicturesInfo(req,loginUserInfo.getUserId());
        xtjctpxxbMapper.insertSelective(xtjctpxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<UpdatePicturesInfoResp> updatePicturesInfo(UpdatePicturesInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtjctpxxb xtjctpxxb = ReqParamToEntityUtils.updatePicturesInfo(req,loginUserInfo.getUserId());
        xtjctpxxbMapper.updateByPrimaryKeySelective(xtjctpxxb);
        return CommonResult.success();
    }

    @Override
    public CommonResult<DeletePicturesInfoResp> deletePicturesInfo(DeletePicturesInfoReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        Xtjctpxxb xtjctpxxb = ReqParamToEntityUtils.deletePicturesInfo(req,loginUserInfo.getUserId());
        xtjctpxxbMapper.updateByPrimaryKeySelective(xtjctpxxb);
        return CommonResult.success();
    }
}
