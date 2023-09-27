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
public interface PicturesService {
    TableResult<SelectPicturesTableResp> selectPicturesTable(SelectPicturesTableReq req);

    CommonResult<List<SelectPicturesResp>> selectAllPicturesList(SelectPicturesReq req);

    CommonResult<SelectPicturesByIdResp> selectPicturesById(SelectPicturesByIdReq req);

    CommonResult<AddPicturesInfoResp> addPicturesInfo(AddPicturesInfoReq req, HttpServletRequest request);

    CommonResult<UpdatePicturesInfoResp> updatePicturesInfo(UpdatePicturesInfoReq req, HttpServletRequest request);

    CommonResult<DeletePicturesInfoResp> deletePicturesInfo(DeletePicturesInfoReq req, HttpServletRequest request);
}
