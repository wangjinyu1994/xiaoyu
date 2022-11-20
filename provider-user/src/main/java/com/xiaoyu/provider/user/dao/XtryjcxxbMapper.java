package com.xiaoyu.provider.user.dao;


import com.xiaoyu.provider.user.entity.Xtryjcxxb;

public interface XtryjcxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtryjcxxb record);

    int insertSelective(Xtryjcxxb record);

    Xtryjcxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtryjcxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtryjcxxb record);

    int updateByPrimaryKey(Xtryjcxxb record);
}