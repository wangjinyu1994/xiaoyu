package com.xiaoyu.provider.common.service.impl;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.provider.common.dao.XtxzqyxxbMapper;
import com.xiaoyu.provider.common.dao.ex.XtxzqyxxbMapperEx;
import com.xiaoyu.provider.common.req.SelectAdministrativeRegionByLevelReq;
import com.xiaoyu.provider.common.req.SelectAllAdministrativeRegionReq;
import com.xiaoyu.provider.common.req.SelectSublevelAdministrativeRegionByCodeReq;
import com.xiaoyu.provider.common.req.SelectSublevelAdministrativeRegionByIdReq;
import com.xiaoyu.provider.common.resp.SelectAdministrativeRegionByLevelResp;
import com.xiaoyu.provider.common.resp.SelectAllAdministrativeRegionResp;
import com.xiaoyu.provider.common.resp.SelectSublevelAdministrativeRegionByCodeResp;
import com.xiaoyu.provider.common.resp.SelectSublevelAdministrativeRegionByIdResp;
import com.xiaoyu.provider.common.service.AdministrativeRegionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * WJY
 */
@Service
@Slf4j
public class AdministrativeRegionServiceImpl implements AdministrativeRegionService {

    @Autowired
    private XtxzqyxxbMapper xtxzqyxxbMapper;
    @Autowired
    private XtxzqyxxbMapperEx xtxzqyxxbMapperEx;

    /**
     * 获取所有行政区域请求接口
     */
    @Override
    public CommonResult<List<SelectAllAdministrativeRegionResp>> selectAllAdministrativeRegion(SelectAllAdministrativeRegionReq req) {
        List<SelectAllAdministrativeRegionResp> resps = xtxzqyxxbMapperEx.selectAllAdministrativeRegion();
        return CommonResult.success(resps);
    }

    /**
     * 根据行政区域等级获取行政区域请求接口
     */
    @Override
    public CommonResult<List<SelectAdministrativeRegionByLevelResp>> selectAdministrativeRegionByLevel(SelectAdministrativeRegionByLevelReq req) {
        List<SelectAdministrativeRegionByLevelResp> resps = xtxzqyxxbMapperEx.selectAdministrativeRegionByLevel(req);
        return CommonResult.success(resps);
    }

    /**
     * 根据行政区域编码获取下级行政区域请求接口
     */
    @Override
    public CommonResult<List<SelectSublevelAdministrativeRegionByCodeResp>> selectSublevelAdministrativeRegionByCode(SelectSublevelAdministrativeRegionByCodeReq req) {
        List<SelectSublevelAdministrativeRegionByCodeResp> resps = xtxzqyxxbMapperEx.selectSublevelAdministrativeRegionByCode(req);
        return CommonResult.success(resps);
    }

    /**
     * 根据行政区域主键获取下级行政区域请求接口
     */
    @Override
    public CommonResult<List<SelectSublevelAdministrativeRegionByIdResp>> selectSublevelAdministrativeRegionById(SelectSublevelAdministrativeRegionByIdReq req) {
        List<SelectSublevelAdministrativeRegionByIdResp> resps = xtxzqyxxbMapperEx.selectSublevelAdministrativeRegionById(req);
        return CommonResult.success(resps);
    }
}
