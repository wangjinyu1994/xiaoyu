package com.xiaoyu.feign.system.service;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.feign.system.req.*;
import com.xiaoyu.feign.system.resp.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * WJY
 */
@FeignClient(value = "xiaoyu-provider-system")
public interface BlacklistService {

    @PostMapping(value = "/sys/xiaoyu/system/blacklist/selectDictionaryType")
    CommonResult<List<SelectBlacklistListResp>> selectDictionaryType(SelectBlacklistListReq req);

    @PostMapping(value = "/sys/xiaoyu/system/blacklist/selectBlacklistTable")
    TableResult<SelectBlacklistTableResp> selectBlacklistTable(SelectBlacklistTableReq req);

    @PostMapping(value = "/sys/xiaoyu/system/blacklist/updateBlackById")
    CommonResult<UpdateBlackByIdResp> updateBlackById(UpdateBlackByIdReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/system/blacklist/deleteBlackById")
    CommonResult<DeleteBlackByIdResp> deleteBlackById(DeleteBlackByIdReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/system/blacklist/addBlackInfo")
    CommonResult<AddBlackInfoResp> addBlackInfo(AddBlackInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/system/blacklist/addBlackListInfo")
    CommonResult<AddBlackListInfoResp> addBlackListInfo(AddBlackListInfoReq req, HttpServletRequest request);
}
