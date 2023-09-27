package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtxxtzxxb;
import com.xiaoyu.provider.user.req.SelectNoticByIdReq;
import com.xiaoyu.provider.user.req.SelectNoticIndexReq;
import com.xiaoyu.provider.user.req.SelectNoticTableReq;
import com.xiaoyu.provider.user.resp.SelectNoticByIdResp;
import com.xiaoyu.provider.user.resp.SelectNoticIndexResp;
import com.xiaoyu.provider.user.resp.SelectNoticTableResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XtxxtzxxbMapperEx {


    int insertXtxxtzxxb(@Param("data") Xtxxtzxxb record);

    List<SelectNoticTableResp> selectNoticTable(@Param("data")SelectNoticTableReq req);

    Integer countSelectNoticTable(@Param("data")SelectNoticTableReq req);

    List<SelectNoticIndexResp> selectNoticIndex(@Param("data")SelectNoticIndexReq req);

    SelectNoticByIdResp selectNoticById(@Param("data")SelectNoticByIdReq req);
}