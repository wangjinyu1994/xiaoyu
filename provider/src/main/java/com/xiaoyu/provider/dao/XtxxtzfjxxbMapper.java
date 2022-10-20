package com.xiaoyu.provider.dao;

import com.xiaoyu.provider.base.entity.Xtxxtzfjxxb;

public interface XtxxtzfjxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtxxtzfjxxb record);

    int insertSelective(Xtxxtzfjxxb record);

    Xtxxtzfjxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtxxtzfjxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtxxtzfjxxb record);

    int updateByPrimaryKey(Xtxxtzfjxxb record);
}