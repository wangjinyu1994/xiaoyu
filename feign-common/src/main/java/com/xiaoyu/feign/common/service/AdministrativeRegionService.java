package com.xiaoyu.feign.common.service;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.feign.common.req.SelectAdministrativeRegionByLevelReq;
import com.xiaoyu.feign.common.req.SelectAllAdministrativeRegionReq;
import com.xiaoyu.feign.common.req.SelectSublevelAdministrativeRegionByCodeReq;
import com.xiaoyu.feign.common.req.SelectSublevelAdministrativeRegionByIdReq;
import com.xiaoyu.feign.common.resp.SelectAdministrativeRegionByLevelResp;
import com.xiaoyu.feign.common.resp.SelectAllAdministrativeRegionResp;
import com.xiaoyu.feign.common.resp.SelectSublevelAdministrativeRegionByCodeResp;
import com.xiaoyu.feign.common.resp.SelectSublevelAdministrativeRegionByIdResp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * WJY
 */
@FeignClient(value = "xiaoyu-provider-common")
public interface AdministrativeRegionService {

    @PostMapping(value = "/sys/xiaoyu/common/administrative/region/selectAllAdministrativeRegion")
    CommonResult<List<SelectAllAdministrativeRegionResp>> selectAllAdministrativeRegion(SelectAllAdministrativeRegionReq req);

    @PostMapping(value = "/sys/xiaoyu/common/administrative/region/selectAdministrativeRegionByLevel")
    CommonResult<List<SelectAdministrativeRegionByLevelResp>> selectAdministrativeRegionByLevel(SelectAdministrativeRegionByLevelReq req);

    @PostMapping(value = "/sys/xiaoyu/common/administrative/region/selectSublevelAdministrativeRegionByCode")
    CommonResult<List<SelectSublevelAdministrativeRegionByCodeResp>> selectSublevelAdministrativeRegionByCode(SelectSublevelAdministrativeRegionByCodeReq req);

    @PostMapping(value = "/sys/xiaoyu/common/administrative/region/selectSublevelAdministrativeRegionById")
    CommonResult<List<SelectSublevelAdministrativeRegionByIdResp>> selectSublevelAdministrativeRegionById(SelectSublevelAdministrativeRegionByIdReq req);
}
