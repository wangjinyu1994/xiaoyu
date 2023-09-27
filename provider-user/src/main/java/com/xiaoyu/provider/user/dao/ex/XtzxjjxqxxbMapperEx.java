package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtzxjjxqxxb;
import com.xiaoyu.provider.user.req.SelectCoreContentInfoReq;
import com.xiaoyu.provider.user.resp.SelectCoreContentInfoResp;
import com.xiaoyu.provider.user.resp.SelectCoreInfoResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XtzxjjxqxxbMapperEx {

    int insertXtzxjjxqxxb(@Param("data") Xtzxjjxqxxb xtzxjjxqxxb);

    SelectCoreInfoResp selectCoreInfo(@Param("data") Long zj);

    List<SelectCoreInfoResp> selectAllCoreInfo();

    SelectCoreContentInfoResp selectCoreContentById(@Param("data")SelectCoreContentInfoReq req);
}