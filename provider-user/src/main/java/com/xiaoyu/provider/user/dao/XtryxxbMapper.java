package com.xiaoyu.provider.user.dao;


import com.xiaoyu.provider.user.entity.Xtryxxb;

public interface XtryxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtryxxb record);

    int insertSelective(Xtryxxb record);

    Xtryxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtryxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtryxxb record);

    int updateByPrimaryKey(Xtryxxb record);
}