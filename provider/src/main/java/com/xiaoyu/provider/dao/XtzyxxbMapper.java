package com.xiaoyu.provider.dao;

import com.xiaoyu.provider.base.entity.Xtzyxxb;

public interface XtzyxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtzyxxb record);

    int insertSelective(Xtzyxxb record);

    Xtzyxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtzyxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtzyxxb record);

    int updateByPrimaryKey(Xtzyxxb record);
}