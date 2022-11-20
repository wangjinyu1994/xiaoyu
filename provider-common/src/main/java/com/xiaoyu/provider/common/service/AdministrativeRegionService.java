package com.xiaoyu.provider.common.service;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.provider.common.req.SelectAdministrativeRegionByLevelReq;
import com.xiaoyu.provider.common.req.SelectAllAdministrativeRegionReq;
import com.xiaoyu.provider.common.req.SelectSublevelAdministrativeRegionByCodeReq;
import com.xiaoyu.provider.common.req.SelectSublevelAdministrativeRegionByIdReq;
import com.xiaoyu.provider.common.resp.SelectAdministrativeRegionByLevelResp;
import com.xiaoyu.provider.common.resp.SelectAllAdministrativeRegionResp;
import com.xiaoyu.provider.common.resp.SelectSublevelAdministrativeRegionByCodeResp;
import com.xiaoyu.provider.common.resp.SelectSublevelAdministrativeRegionByIdResp;
import java.util.List;

/**
 * WJY
 */
public interface AdministrativeRegionService {

    /**
     * 获取所有行政区域请求接口
     */
    CommonResult<List<SelectAllAdministrativeRegionResp>> selectAllAdministrativeRegion(SelectAllAdministrativeRegionReq req);

    /**
     * 根据行政区域等级获取行政区域请求接口
     */
    CommonResult<List<SelectAdministrativeRegionByLevelResp>> selectAdministrativeRegionByLevel(SelectAdministrativeRegionByLevelReq req);

    /**
     * 根据行政区域编码获取下级行政区域请求接口
     */
    CommonResult<List<SelectSublevelAdministrativeRegionByCodeResp>> selectSublevelAdministrativeRegionByCode(SelectSublevelAdministrativeRegionByCodeReq req);

    /**
     * 根据行政区域主键获取下级行政区域请求接口
     */
    CommonResult<List<SelectSublevelAdministrativeRegionByIdResp>> selectSublevelAdministrativeRegionById(SelectSublevelAdministrativeRegionByIdReq req);
}
