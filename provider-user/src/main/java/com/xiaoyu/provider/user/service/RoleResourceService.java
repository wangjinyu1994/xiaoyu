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
public interface RoleResourceService {
    CommonResult<List<SelectRoleResourceResp>> selectRoleResourceList(SelectRoleResourceReq req);

    TableResult<SelectRoleResourceTableResp> selectRoleResourceTable(SelectRoleResourceTableReq req);

    CommonResult<SelectRoleResourceByIdResp> selectRoleResourceById(SelectRoleResourceByIdReq req);

    CommonResult<AddRoleResourceResp> addRoleResourceInfo(AddRoleResourceReq req, HttpServletRequest request);

    CommonResult<UpdateRoleResourceResp> updateRoleResourceInfo(UpdateRoleResourceReq req, HttpServletRequest request);

    CommonResult<DeleteRoleResourceResp> deleteRoleResourceInfo(DeleteRoleResourceReq req, HttpServletRequest request);
}
