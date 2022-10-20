package com.xiaoyu.provider.dao;

import com.xiaoyu.provider.base.entity.Xtryjcxxb;

public interface XtryjcxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtryjcxxb record);

    int insertSelective(Xtryjcxxb record);

    Xtryjcxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtryjcxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtryjcxxb record);

    int updateByPrimaryKey(Xtryjcxxb record);
}