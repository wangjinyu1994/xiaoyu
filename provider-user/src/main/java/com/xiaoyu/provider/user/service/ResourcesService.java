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
public interface ResourcesService {
    TableResult<SelectResourcesTableResp> selectResourcesTable(SelectResourcesTableReq req);

    CommonResult<List<SelectAllResourcesResp>> selectAllResourcesList(SelectAllResourcesReq req);

    CommonResult<SelectResourcesByIdResp> selectResourcesById(SelectResourcesByIdReq req);

    CommonResult<AddResourcesInfoResp> addResourcesInfo(AddResourcesInfoReq req, HttpServletRequest request);

    CommonResult<UpdateResourcesInfoResp> updateResourcesInfo(UpdateResourcesInfoReq req, HttpServletRequest request);

    CommonResult<DeleteResourcesInfoResp> deleteResourcesInfo(DeleteResourcesInfoReq req, HttpServletRequest request);
}
