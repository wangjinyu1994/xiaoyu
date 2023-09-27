package com.xiaoyu.provider.user.service;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.provider.user.req.*;
import com.xiaoyu.provider.user.resp.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * WJY
 */
public interface CoreService {
    TableResult<SelectCoreDataResp> selectCoreInfo(SelectCoreInfoReq req);

    CommonResult<SelectCoreContentInfoResp> selectCoreContentById(SelectCoreContentInfoReq req);

    CommonResult<SelectCoreDetailsInfoResp> selectCoreDetailsById(SelectCoreDetailsInfoReq req);

    CommonResult<AddCoreContentInfoResp> addCoreContentInfo(AddCoreContentInfoReq req, HttpServletRequest request);

    CommonResult<UpdateCoreContentInfoResp> updateCoreContentInfo(UpdateCoreContentInfoReq req, HttpServletRequest request);

    CommonResult<DeleteCoreContentInfoResp> deleteCoreContentInfo(DeleteCoreContentInfoReq req, HttpServletRequest request);

    CommonResult<AddCoreDetailsInfoResp> addCoreDetailsInfo(AddCoreDetailsInfoReq req, HttpServletRequest request);

    CommonResult<UpdateCoreDetailsInfoResp> updateCoreDetailsInfo(UpdateCoreDetailsInfoReq req, HttpServletRequest request);

    CommonResult<DeleteCoreDetailsInfoResp> deleteCoreDetailsInfo(DeleteCoreDetailsInfoReq req, HttpServletRequest request);
}
