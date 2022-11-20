package com.xiaoyu.provider.common.dao.ex;


import com.xiaoyu.provider.common.entity.Xtxzqyxxb;
import com.xiaoyu.provider.common.req.SelectAdministrativeRegionByLevelReq;
import com.xiaoyu.provider.common.req.SelectSublevelAdministrativeRegionByCodeReq;
import com.xiaoyu.provider.common.req.SelectSublevelAdministrativeRegionByIdReq;
import com.xiaoyu.provider.common.resp.SelectAdministrativeRegionByLevelResp;
import com.xiaoyu.provider.common.resp.SelectAllAdministrativeRegionResp;
import com.xiaoyu.provider.common.resp.SelectSublevelAdministrativeRegionByCodeResp;
import com.xiaoyu.provider.common.resp.SelectSublevelAdministrativeRegionByIdResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XtxzqyxxbMapperEx {

    int insertXtxzqyxxb(@Param("data") Xtxzqyxxb record);

    /**
     * 获取所有行政区域请求接口
     */
    List<SelectAllAdministrativeRegionResp> selectAllAdministrativeRegion();

    /**
     * 根据行政区域等级获取行政区域请求接口
     */
    List<SelectAdministrativeRegionByLevelResp> selectAdministrativeRegionByLevel(@Param("data")SelectAdministrativeRegionByLevelReq req);

    /**
     * 根据行政区域编码获取下级行政区域请求接口
     */
    List<SelectSublevelAdministrativeRegionByCodeResp> selectSublevelAdministrativeRegionByCode(@Param("data") SelectSublevelAdministrativeRegionByCodeReq req);

    /**
     * 根据行政区域主键获取下级行政区域请求接口
     */
    List<SelectSublevelAdministrativeRegionByIdResp> selectSublevelAdministrativeRegionById(@Param("data")SelectSublevelAdministrativeRegionByIdReq req);
}