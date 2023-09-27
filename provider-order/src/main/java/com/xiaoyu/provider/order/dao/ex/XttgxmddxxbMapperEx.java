package com.xiaoyu.provider.order.dao.ex;


import com.xiaoyu.provider.order.entity.Xttgxmddxxb;
import com.xiaoyu.provider.order.req.SelectOrderByIdReq;
import com.xiaoyu.provider.order.req.SelectOrderTableReq;
import com.xiaoyu.provider.order.resp.SelectOrderByIdResp;
import com.xiaoyu.provider.order.resp.SelectOrderTableResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XttgxmddxxbMapperEx {

    int insertXttgxmddxxb(@Param("data") Xttgxmddxxb record);

    List<SelectOrderTableResp> selectOrderTable(@Param("data")SelectOrderTableReq req);

    Integer countSelectOrderTable(@Param("data")SelectOrderTableReq req);

    SelectOrderByIdResp selectOrderById(@Param("data")SelectOrderByIdReq req);
}