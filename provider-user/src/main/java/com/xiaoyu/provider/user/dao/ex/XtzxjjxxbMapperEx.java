package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtzxjjxxb;
import com.xiaoyu.provider.user.req.SelectCoreDetailsInfoReq;
import com.xiaoyu.provider.user.req.SelectCoreInfoReq;
import com.xiaoyu.provider.user.resp.SelectCoreDataResp;
import com.xiaoyu.provider.user.resp.SelectCoreDetailsInfoResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XtzxjjxxbMapperEx {

    int insertXtzxjjxxb(@Param("data") Xtzxjjxxb record);

    List<SelectCoreDataResp> selectCoreDataInfo(@Param("data")SelectCoreInfoReq req);

    Integer countSelectCoreDataInfo(@Param("data")SelectCoreInfoReq req);

    SelectCoreDetailsInfoResp selectCoreDetailsById(@Param("data")SelectCoreDetailsInfoReq req);
}