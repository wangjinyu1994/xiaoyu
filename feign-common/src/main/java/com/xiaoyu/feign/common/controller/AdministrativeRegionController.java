package com.xiaoyu.feign.common.controller;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.feign.common.req.SelectAdministrativeRegionByLevelReq;
import com.xiaoyu.feign.common.req.SelectAllAdministrativeRegionReq;
import com.xiaoyu.feign.common.req.SelectSublevelAdministrativeRegionByCodeReq;
import com.xiaoyu.feign.common.req.SelectSublevelAdministrativeRegionByIdReq;
import com.xiaoyu.feign.common.resp.SelectAdministrativeRegionByLevelResp;
import com.xiaoyu.feign.common.resp.SelectAllAdministrativeRegionResp;
import com.xiaoyu.feign.common.resp.SelectSublevelAdministrativeRegionByCodeResp;
import com.xiaoyu.feign.common.resp.SelectSublevelAdministrativeRegionByIdResp;
import com.xiaoyu.feign.common.service.AdministrativeRegionService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.List;

/**
 * WJY
 */
@RestController
@RequestMapping("/sys/xiaoyu/common/administrative/region")
public class AdministrativeRegionController {

    @Autowired
    private AdministrativeRegionService administrativeRegionService;

    @PostMapping(value = "/selectAllAdministrativeRegion")
    @ApiOperation(value = "获取所有行政区域请求接口", httpMethod = "POST",notes = "获取所有行政区域请求接口")
    public CommonResult<List<SelectAllAdministrativeRegionResp>> selectAllAdministrativeRegion(@RequestBody @Valid SelectAllAdministrativeRegionReq req){
        return administrativeRegionService.selectAllAdministrativeRegion(req);
    }

    @PostMapping(value = "/selectAdministrativeRegionByLevel")
    @ApiOperation(value = "根据行政区域等级获取行政区域请求接口", httpMethod = "POST",notes = "根据行政区域等级获取行政区域请求接口")
    public CommonResult<List<SelectAdministrativeRegionByLevelResp>> selectAdministrativeRegionByLevel(@RequestBody @Valid SelectAdministrativeRegionByLevelReq req){
        return administrativeRegionService.selectAdministrativeRegionByLevel(req);
    }

    @PostMapping(value = "/selectSublevelAdministrativeRegionByCode")
    @ApiOperation(value = "根据行政区域编码获取下级行政区域请求接口", httpMethod = "POST",notes = "根据行政区域编码获取下级行政区域请求接口")
    public CommonResult<List<SelectSublevelAdministrativeRegionByCodeResp>> selectSublevelAdministrativeRegionByCode(@RequestBody @Valid SelectSublevelAdministrativeRegionByCodeReq req){
        return administrativeRegionService.selectSublevelAdministrativeRegionByCode(req);
    }

    @PostMapping(value = "/selectSublevelAdministrativeRegionById")
    @ApiOperation(value = "根据行政区域主键获取下级行政区域请求接口", httpMethod = "POST",notes = "根据行政区域主键获取下级行政区域请求接口")
    public CommonResult<List<SelectSublevelAdministrativeRegionByIdResp>> selectSublevelAdministrativeRegionById(@RequestBody @Valid SelectSublevelAdministrativeRegionByIdReq req){
        return administrativeRegionService.selectSublevelAdministrativeRegionById(req);
    }

}
