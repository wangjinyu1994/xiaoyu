package com.xiaoyu.gateway.dao;


import com.xiaoyu.gateway.entity.Xthbmdxxb;

public interface XthbmdxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xthbmdxxb record);

    int insertSelective(Xthbmdxxb record);

    Xthbmdxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xthbmdxxb record);

    int updateByPrimaryKeyWithBLOBs(Xthbmdxxb record);

    int updateByPrimaryKey(Xthbmdxxb record);
}