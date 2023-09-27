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
public interface SysRoleService {

    @PostMapping(value = "/sys/xiaoyu/user/role/selectRoleTable")
    TableResult<SelectRoleTableResp> selectRoleTable(SelectRoleTableReq req);

    @PostMapping(value = "/sys/xiaoyu/user/role/selectAllRoleList")
    CommonResult<List<SelectAllRoleResp>> selectAllRoleList(SelectAllRoleReq req);

    @PostMapping(value = "/sys/xiaoyu/user/role/selectRoleById")
    CommonResult<SelectRoleByIdResp> selectRoleById(SelectRoleByIdReq req);

    @PostMapping(value = "/sys/xiaoyu/user/role/addRoleInfo")
    CommonResult<AddRoleInfoResp> addRoleInfo(AddRoleInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/role/updateRoleInfo")
    CommonResult<UpdateRoleInfoResp> updateRoleInfo(UpdateRoleInfoReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/role/deleteRoleInfo")
    CommonResult<DeleteRoleInfoResp> deleteRoleInfo(DeleteRoleInfoReq req, HttpServletRequest request);

}
