package com.xiaoyu.provider.order.dao;


import com.xiaoyu.provider.order.entity.Xttgxmxxb;

public interface XttgxmxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xttgxmxxb record);

    int insertSelective(Xttgxmxxb record);

    Xttgxmxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xttgxmxxb record);

    int updateByPrimaryKeyWithBLOBs(Xttgxmxxb record);

    int updateByPrimaryKey(Xttgxmxxb record);
}