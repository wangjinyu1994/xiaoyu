package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtyqljxxb;
import com.xiaoyu.provider.user.req.SelectLinksInfoReq;
import com.xiaoyu.provider.user.req.SelectLinksTableInfoReq;
import com.xiaoyu.provider.user.resp.SelectLinksDataResp;
import com.xiaoyu.provider.user.resp.SelectLinksTableResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XtyqljxxbMapperEx {


    int insertXtyqljxxb(@Param("data") Xtyqljxxb record);

    List<SelectLinksDataResp> selectLinksInfo(@Param("data")SelectLinksInfoReq req);

    List<SelectLinksTableResp> selectLinksTable(@Param("data")SelectLinksTableInfoReq req);

    Integer countSelectLinksTable(@Param("data")SelectLinksTableInfoReq req);
}