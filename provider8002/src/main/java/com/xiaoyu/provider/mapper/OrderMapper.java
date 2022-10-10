package com.xiaoyu.provider.mapper;

import com.xiaoyu.provider.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * WJY
 */
@Mapper
public interface OrderMapper {

    int deleteByPrimaryKey(Long id);
    int insert(Order record);
    int create(Order order);
    int insertSelective(Order record);
    //2 修改订单状态，从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
    Order selectByPrimaryKey(Long id);
    int updateByPrimaryKeySelective(Order record);
    int updateByPrimaryKey(Order record);

}
