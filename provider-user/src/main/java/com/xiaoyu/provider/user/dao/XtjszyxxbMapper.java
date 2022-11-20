package com.xiaoyu.provider.user.dao;


import com.xiaoyu.provider.user.entity.Xtjszyxxb;

public interface XtjszyxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtjszyxxb record);

    int insertSelective(Xtjszyxxb record);

    Xtjszyxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtjszyxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtjszyxxb record);

    int updateByPrimaryKey(Xtjszyxxb record);
}