package com.xiaoyu.provider.order.dao.ex;


import com.xiaoyu.provider.order.entity.Xttgxmxxb;
import com.xiaoyu.provider.order.req.SelectAllProjectReq;
import com.xiaoyu.provider.order.req.SelectProjectByIdReq;
import com.xiaoyu.provider.order.req.SelectProjectTableReq;
import com.xiaoyu.provider.order.resp.SelectAllProjectResp;
import com.xiaoyu.provider.order.resp.SelectProjectByIdResp;
import com.xiaoyu.provider.order.resp.SelectProjectTableResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XttgxmxxbMapperEx {

    int insertXttgxmxxb(@Param("data") Xttgxmxxb record);

    List<SelectProjectTableResp> selectProjectTable(@Param("data") SelectProjectTableReq req);

    Integer countSelectProjectTable(@Param("data")SelectProjectTableReq req);

    List<SelectAllProjectResp> selectAllProject(@Param("data") SelectAllProjectReq req);

    SelectProjectByIdResp selectProjectById(@Param("data") SelectProjectByIdReq req);

}