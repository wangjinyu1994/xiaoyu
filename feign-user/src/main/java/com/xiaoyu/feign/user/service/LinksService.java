package com.xiaoyu.feign.user.service;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.resp.TableResult;
import com.xiaoyu.feign.user.req.*;
import com.xiaoyu.feign.user.resp.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * WJY
 */
@FeignClient(value = "xiaoyu-provider-user")
public interface LinksService {

    @PostMapping(value = "/sys/xiaoyu/user/links/selectLinksInfo")
    CommonResult<List<SelectLinksDataResp>> selectLinksInfo(SelectLinksInfoReq req);

    @PostMapping(value = "/sys/xiaoyu/user/links/selectLinksTable")
    TableResult<SelectLinksTableResp> selectLinksTable(SelectLinksTableInfoReq req);

    @PostMapping(value = "/sys/xiaoyu/user/links/addLinksInfo")
    CommonResult<AddLinksInfoResp> addLinksInfo(AddLinksInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/links/updateLinksInfo")
    CommonResult<UpdateLinksInfoResp> updateLinksInfo(UpdateLinksInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/links/deleteLinksInfo")
    CommonResult<DeleteLinksInfoResp> deleteLinksInfo(DeleteLinksInfoReq req, HttpServletRequest request);

}
