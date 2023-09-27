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
public interface NoticeService {

    TableResult<SelectNoticTableResp> selectNoticTable(SelectNoticTableReq req);

    CommonResult<List<SelectNoticIndexResp>> selectNoticIndex(SelectNoticIndexReq req);

    CommonResult<SelectNoticByIdResp> selectNoticById(SelectNoticByIdReq req);

    CommonResult<AddNoticInfoResp> addNoticInfo(AddNoticInfoReq req, HttpServletRequest request);

    CommonResult<UpdateNoticInfoResp> updateNoticInfo(UpdateNoticInfoReq req, HttpServletRequest request);

    CommonResult<DeleteNoticInfoResp> deleteNoticInfo(DeleteNoticInfoReq req, HttpServletRequest request);

    CommonResult<AddNoticEnclosureInfoResp> addNoticEnclosureInfo(AddNoticEnclosureInfoReq req, HttpServletRequest request);

    CommonResult<AddNoticEnclosureInfoResp> addNoticEnclosureListInfo(AddNoticEnclosureListInfo req, HttpServletRequest request);

    CommonResult<UpdateNoticEnclosureInfoResp> updateNoticEnclosureInfo(UpdateNoticEnclosureInfoReq req, HttpServletRequest request);

    CommonResult<DeleteNoticEnclosureInfoResp> deleteNoticEnclosureInfo(DeleteNoticEnclosureInfoReq req, HttpServletRequest request);

}
