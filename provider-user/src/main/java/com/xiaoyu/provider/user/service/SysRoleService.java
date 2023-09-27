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
public interface SysRoleService {
    TableResult<SelectRoleTableResp> selectRoleTable(SelectRoleTableReq req);

    CommonResult<List<SelectAllRoleResp>> selectAllRoleList(SelectAllRoleReq req);

    CommonResult<SelectRoleByIdResp> selectRoleById(SelectRoleByIdReq req);

    CommonResult<AddRoleInfoResp> addRoleInfo(AddRoleInfoReq req, HttpServletRequest request);

    CommonResult<UpdateRoleInfoResp> updateRoleInfo(UpdateRoleInfoReq req, HttpServletRequest request);

    CommonResult<DeleteRoleInfoResp> deleteRoleInfo(DeleteRoleInfoReq req, HttpServletRequest request);

}
