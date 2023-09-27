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
public interface SysOrgService {
    TableResult<SelectOrgTableResp> selectOrgTable(SelectOrgTableReq req);

    CommonResult<List<SelectAllOrgResp>> selectAllOrgList(SelectAllOrgReq req);

    CommonResult<SelectOrgByIdResp> selectOrgById(SelectOrgByIdReq req);

    CommonResult<AddOrgInfoResp> addOrgInfo(AddOrgInfoReq req, HttpServletRequest request);

    CommonResult<UpdateOrgInfoResp> updateOrgInfo(UpdateOrgInfoReq req, HttpServletRequest request);

    CommonResult<DeleteOrgInfoResp> deleteOrgInfo(DeleteOrgInfoReq req, HttpServletRequest request);
}
