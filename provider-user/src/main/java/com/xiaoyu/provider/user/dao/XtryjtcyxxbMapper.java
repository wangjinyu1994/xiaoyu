package com.xiaoyu.provider.user.dao;


import com.xiaoyu.provider.user.entity.Xtryjtcyxxb;

public interface XtryjtcyxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtryjtcyxxb record);

    int insertSelective(Xtryjtcyxxb record);

    Xtryjtcyxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtryjtcyxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtryjtcyxxb record);

    int updateByPrimaryKey(Xtryjtcyxxb record);
}