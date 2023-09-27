package com.xiaoyu.provider.order.dao;


import com.xiaoyu.provider.order.entity.Xttgxmddyspxxb;

public interface XttgxmddyspxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xttgxmddyspxxb record);

    int insertSelective(Xttgxmddyspxxb record);

    Xttgxmddyspxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xttgxmddyspxxb record);

    int updateByPrimaryKeyWithBLOBs(Xttgxmddyspxxb record);

    int updateByPrimaryKey(Xttgxmddyspxxb record);
}