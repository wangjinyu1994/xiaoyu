package com.xiaoyu.provider.common.controller;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.provider.common.req.SelectAdministrativeRegionByLevelReq;
import com.xiaoyu.provider.common.req.SelectAllAdministrativeRegionReq;
import com.xiaoyu.provider.common.req.SelectSublevelAdministrativeRegionByCodeReq;
import com.xiaoyu.provider.common.req.SelectSublevelAdministrativeRegionByIdReq;
import com.xiaoyu.provider.common.resp.SelectAdministrativeRegionByLevelResp;
import com.xiaoyu.provider.common.resp.SelectAllAdministrativeRegionResp;
import com.xiaoyu.provider.common.resp.SelectSublevelAdministrativeRegionByCodeResp;
import com.xiaoyu.provider.common.resp.SelectSublevelAdministrativeRegionByIdResp;
import com.xiaoyu.provider.common.service.AdministrativeRegionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

/**
 * WJY
 */
@RestController
@RequestMapping("/sys/xiaoyu/common/administrative/region")
@Api(tags = "行政区域控制器",description = "主要提供行政区域相关接口")
public class AdministrativeRegionController {

    @Autowired
    private AdministrativeRegionService administrativeRegionService;

    @PostMapping(value = "/selectAllAdministrativeRegion")
    @ApiOperation(value = "获取所有行政区域请求接口", httpMethod = "POST",notes = "获取所有行政区域请求接口")
    public CommonResult<List<SelectAllAdministrativeRegionResp>> selectAllAdministrativeRegion(@RequestBody @Valid SelectAllAdministrativeRegionReq req, HttpServletRequest request, HttpServletResponse response){
        return administrativeRegionService.selectAllAdministrativeRegion(req);
    }

    @PostMapping(value = "/selectAdministrativeRegionByLevel")
    @ApiOperation(value = "根据行政区域等级获取行政区域请求接口", httpMethod = "POST",notes = "根据行政区域等级获取行政区域请求接口")
    public CommonResult<List<SelectAdministrativeRegionByLevelResp>> selectAdministrativeRegionByLevel(@RequestBody @Valid SelectAdministrativeRegionByLevelReq req, HttpServletRequest request, HttpServletResponse response){
        return administrativeRegionService.selectAdministrativeRegionByLevel(req);
    }

    @PostMapping(value = "/selectSublevelAdministrativeRegionByCode")
    @ApiOperation(value = "根据行政区域编码获取下级行政区域请求接口", httpMethod = "POST",notes = "根据行政区域编码获取下级行政区域请求接口")
    public CommonResult<List<SelectSublevelAdministrativeRegionByCodeResp>> selectSublevelAdministrativeRegionByCode(@RequestBody @Valid SelectSublevelAdministrativeRegionByCodeReq req, HttpServletRequest request, HttpServletResponse response){
        return administrativeRegionService.selectSublevelAdministrativeRegionByCode(req);
    }

    @PostMapping(value = "/selectSublevelAdministrativeRegionById")
    @ApiOperation(value = "根据行政区域主键获取下级行政区域请求接口", httpMethod = "POST",notes = "根据行政区域主键获取下级行政区域请求接口")
    public CommonResult<List<SelectSublevelAdministrativeRegionByIdResp>> selectSublevelAdministrativeRegionById(@RequestBody @Valid SelectSublevelAdministrativeRegionByIdReq req, HttpServletRequest request, HttpServletResponse response){
        return administrativeRegionService.selectSublevelAdministrativeRegionById(req);
    }
}
