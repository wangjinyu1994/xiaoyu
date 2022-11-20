package com.xiaoyu.provider.user.dao;


import com.xiaoyu.provider.user.entity.Xtxzqyxxb;

public interface XtxzqyxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtxzqyxxb record);

    int insertSelective(Xtxzqyxxb record);

    Xtxzqyxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtxzqyxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtxzqyxxb record);

    int updateByPrimaryKey(Xtxzqyxxb record);
}