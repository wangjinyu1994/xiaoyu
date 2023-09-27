package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtzyxxb;
import com.xiaoyu.provider.user.req.SelectAllResourcesReq;
import com.xiaoyu.provider.user.req.SelectResourcesByIdReq;
import com.xiaoyu.provider.user.req.SelectResourcesTableReq;
import com.xiaoyu.provider.user.resp.SelectAllResourcesResp;
import com.xiaoyu.provider.user.resp.SelectResourcesByIdResp;
import com.xiaoyu.provider.user.resp.SelectResourcesTableResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XtzyxxbMapperEx {

    int insertXtzyxxb(@Param("data") Xtzyxxb record);

    List<SelectResourcesTableResp> selectResourcesTable(@Param("data")SelectResourcesTableReq req);

    Integer countSelectResourcesTable(@Param("data")SelectResourcesTableReq req);

    List<SelectAllResourcesResp> selectAllResourcesList(@Param("data")SelectAllResourcesReq req);

    SelectResourcesByIdResp selectResourcesById(@Param("data")SelectResourcesByIdReq req);
}