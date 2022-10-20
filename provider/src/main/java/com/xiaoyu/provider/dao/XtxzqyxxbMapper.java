package com.xiaoyu.provider.dao;

import com.xiaoyu.provider.base.entity.Xtxzqyxxb;

public interface XtxzqyxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtxzqyxxb record);

    int insertSelective(Xtxzqyxxb record);

    Xtxzqyxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtxzqyxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtxzqyxxb record);

    int updateByPrimaryKey(Xtxzqyxxb record);
}