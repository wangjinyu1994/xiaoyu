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
public interface LoginInterfaceService {

    /**
     * 获取所有登录放行请求接口
     */
    CommonResult<List<SelectLoginInterlistListResp>> selectLoginInterfaceList(SelectLoginInterListReq req);

    /**
     * 获取所有登录放行请求接口分页
     */
    TableResult<SelectLoginInterTableResp> selectLoginInterfacelistTable(SelectLoginInterTableReq req);

    /**
     * 根据主键修改登录放行请求接口
     */
    CommonResult<UpdateLoginInterByIdResp> updateLoginInterfaceById(UpdateLoginInterByIdReq req, HttpServletRequest request);

    /**
     * 根据主键删除登录放行请求接口
     */
    CommonResult<DeleteLoginInterByIdResp> deleteLoginInterfaceById(DeleteLoginInterByIdReq req, HttpServletRequest request);

    /**
     * 添加登录放行请求接口
     */
    CommonResult<AddLoginInterInfoResp> addLoginInterfaceInfo(AddLoginInterInfoReq req, HttpServletRequest request);

    /**
     * 批量添加登录放行请求接口
     */
    CommonResult<AddLoginInterListInfoResp> addLoginInterfaceListInfo(AddLoginInterListInfoReq req, HttpServletRequest request);
}
