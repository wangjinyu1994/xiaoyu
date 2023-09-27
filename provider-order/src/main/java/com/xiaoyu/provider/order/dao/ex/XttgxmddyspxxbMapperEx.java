package com.xiaoyu.provider.order.dao.ex;

import com.xiaoyu.provider.order.entity.Xttgxmddyspxxb;
import com.xiaoyu.provider.order.req.SelectPreOrderByIdReq;
import com.xiaoyu.provider.order.req.SelectPreOrderTableReq;
import com.xiaoyu.provider.order.resp.SelectPreOrderByIdResp;
import com.xiaoyu.provider.order.resp.SelectPreOrderTableResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * WJY
 */
public interface XttgxmddyspxxbMapperEx {

    int insertXttgxmddyspxxb(@Param("data") Xttgxmddyspxxb xttgxmddyspxxb);

    int insertXttgxmddyspxxbBath(@Param("data") List<Xttgxmddyspxxb> xttgxmddyspxxbs);

    List<SelectPreOrderTableResp> selectPreOrderTable(@Param("data")SelectPreOrderTableReq req);

    Integer countSelectPreOrderTable(@Param("data")SelectPreOrderTableReq req);

    SelectPreOrderByIdResp selectPreOrderById(@Param("data")SelectPreOrderByIdReq req);

    List<Xttgxmddyspxxb> selectXttgxmddyspxxbByLsh(@Param("data")String serialNumber);
}
