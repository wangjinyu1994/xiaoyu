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
public interface LinksService {
    CommonResult<List<SelectLinksDataResp>> selectLinksInfo(SelectLinksInfoReq req);

    TableResult<SelectLinksTableResp> selectLinksTable(SelectLinksTableInfoReq req);

    CommonResult<AddLinksInfoResp> addLinksInfo(AddLinksInfoReq req, HttpServletRequest request);

    CommonResult<UpdateLinksInfoResp> updateLinksInfo(UpdateLinksInfoReq req, HttpServletRequest request);

    CommonResult<DeleteLinksInfoResp> deleteLinksInfo(DeleteLinksInfoReq req, HttpServletRequest request);

}
