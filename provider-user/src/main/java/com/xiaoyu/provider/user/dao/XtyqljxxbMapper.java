package com.xiaoyu.provider.user.dao;


import com.xiaoyu.provider.user.entity.Xtyqljxxb;

public interface XtyqljxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtyqljxxb record);

    int insertSelective(Xtyqljxxb record);

    Xtyqljxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtyqljxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtyqljxxb record);

    int updateByPrimaryKey(Xtyqljxxb record);
}