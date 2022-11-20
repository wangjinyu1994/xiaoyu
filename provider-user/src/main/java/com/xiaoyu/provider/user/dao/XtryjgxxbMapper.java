package com.xiaoyu.provider.user.dao;


import com.xiaoyu.provider.user.entity.Xtryjgxxb;

public interface XtryjgxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtryjgxxb record);

    int insertSelective(Xtryjgxxb record);

    Xtryjgxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtryjgxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtryjgxxb record);

    int updateByPrimaryKey(Xtryjgxxb record);
}