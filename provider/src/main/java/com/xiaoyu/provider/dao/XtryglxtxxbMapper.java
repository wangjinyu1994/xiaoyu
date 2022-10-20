package com.xiaoyu.provider.dao;

import com.xiaoyu.provider.base.entity.Xtryglxtxxb;

public interface XtryglxtxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtryglxtxxb record);

    int insertSelective(Xtryglxtxxb record);

    Xtryglxtxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtryglxtxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtryglxtxxb record);

    int updateByPrimaryKey(Xtryglxtxxb record);
}