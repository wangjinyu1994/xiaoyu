package com.xiaoyu.provider.dao;

import com.xiaoyu.provider.base.entity.Xtxxtzxxb;

public interface XtxxtzxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtxxtzxxb record);

    int insertSelective(Xtxxtzxxb record);

    Xtxxtzxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtxxtzxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtxxtzxxb record);

    int updateByPrimaryKey(Xtxxtzxxb record);
}