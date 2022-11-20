package com.xiaoyu.provider.user.dao;


import com.xiaoyu.provider.user.entity.Xtryjyqkxxb;

public interface XtryjyqkxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtryjyqkxxb record);

    int insertSelective(Xtryjyqkxxb record);

    Xtryjyqkxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtryjyqkxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtryjyqkxxb record);

    int updateByPrimaryKey(Xtryjyqkxxb record);
}