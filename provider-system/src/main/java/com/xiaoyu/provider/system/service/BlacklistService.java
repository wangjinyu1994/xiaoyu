package com.xiaoyu.provider.system.service;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.provider.system.req.*;
import com.xiaoyu.provider.system.resp.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * WJY
 */
public interface BlacklistService {

    /**
     * 获取所有黑名单请求接口
     */
    CommonResult<List<SelectBlacklistListResp>> selectDictionaryType(SelectBlacklistListReq req);

    /**
     * 获取所有黑名单请求接口分页
     */
    TableResult<SelectBlacklistTableResp> selectBlacklistTable(SelectBlacklistTableReq req);

    /**
     * 根据主键修改黑名单请求接口
     */
    CommonResult<UpdateBlackByIdResp> updateBlackById(UpdateBlackByIdReq req, HttpServletRequest request);

    /**
     * 根据主键删除黑名单请求接口
     */
    CommonResult<DeleteBlackByIdResp> deleteBlackById(DeleteBlackByIdReq req, HttpServletRequest request);

    /**
     * 添加黑名单请求接口
     */
    CommonResult<AddBlackInfoResp> addBlackInfo(AddBlackInfoReq req, HttpServletRequest request);

    /**
     * 批量添加黑名单请求接口
     */
    CommonResult<AddBlackListInfoResp> addBlackListInfo(AddBlackListInfoReq req, HttpServletRequest request);
}
