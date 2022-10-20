package com.xiaoyu.provider.dao;

import com.xiaoyu.provider.base.entity.Xtjgxxb;

public interface XtjgxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtjgxxb record);

    int insertSelective(Xtjgxxb record);

    Xtjgxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtjgxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtjgxxb record);

    int updateByPrimaryKey(Xtjgxxb record);
}