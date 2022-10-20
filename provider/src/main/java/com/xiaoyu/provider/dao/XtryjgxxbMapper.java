package com.xiaoyu.provider.dao;

import com.xiaoyu.provider.base.entity.Xtryjgxxb;

public interface XtryjgxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtryjgxxb record);

    int insertSelective(Xtryjgxxb record);

    Xtryjgxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtryjgxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtryjgxxb record);

    int updateByPrimaryKey(Xtryjgxxb record);
}