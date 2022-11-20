package com.xiaoyu.provider.user.dao;


import com.xiaoyu.provider.user.entity.Xtxxtzxxb;

public interface XtxxtzxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtxxtzxxb record);

    int insertSelective(Xtxxtzxxb record);

    Xtxxtzxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtxxtzxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtxxtzxxb record);

    int updateByPrimaryKey(Xtxxtzxxb record);
}