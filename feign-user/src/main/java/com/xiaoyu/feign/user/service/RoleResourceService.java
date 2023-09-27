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
public interface RoleResourceService {

    @PostMapping(value = "/sys/xiaoyu/user/role/selectRoleResourceList")
    CommonResult<List<SelectRoleResourceResp>> selectRoleResourceList(SelectRoleResourceReq req);

    @PostMapping(value = "/sys/xiaoyu/user/role/selectRoleResourceTable")
    TableResult<SelectRoleResourceTableResp> selectRoleResourceTable(SelectRoleResourceTableReq req);

    @PostMapping(value = "/sys/xiaoyu/user/role/selectRoleResourceById")
    CommonResult<SelectRoleResourceByIdResp> selectRoleResourceById(SelectRoleResourceByIdReq req);

    @PostMapping(value = "/sys/xiaoyu/user/role/addRoleResourceInfo")
    CommonResult<AddRoleResourceResp> addRoleResourceInfo(AddRoleResourceReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/role/updateRoleResourceInfo")
    CommonResult<UpdateRoleResourceResp> updateRoleResourceInfo(UpdateRoleResourceReq req, HttpServletRequest request);

    @PostMapping(value = "/sys/xiaoyu/user/role/deleteRoleResourceInfo")
    CommonResult<DeleteRoleResourceResp> deleteRoleResourceInfo(DeleteRoleResourceReq req, HttpServletRequest request);
}
