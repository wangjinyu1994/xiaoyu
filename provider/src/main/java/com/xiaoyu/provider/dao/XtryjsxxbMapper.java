package com.xiaoyu.provider.dao;

import com.xiaoyu.provider.base.entity.Xtryjsxxb;

public interface XtryjsxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtryjsxxb record);

    int insertSelective(Xtryjsxxb record);

    Xtryjsxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtryjsxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtryjsxxb record);

    int updateByPrimaryKey(Xtryjsxxb record);
}