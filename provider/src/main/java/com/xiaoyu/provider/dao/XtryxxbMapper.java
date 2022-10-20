package com.xiaoyu.provider.dao;

import com.xiaoyu.provider.base.entity.Xtryxxb;

public interface XtryxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtryxxb record);

    int insertSelective(Xtryxxb record);

    Xtryxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtryxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtryxxb record);

    int updateByPrimaryKey(Xtryxxb record);
}