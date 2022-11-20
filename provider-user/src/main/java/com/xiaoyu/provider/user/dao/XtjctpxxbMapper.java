package com.xiaoyu.provider.user.dao;


import com.xiaoyu.provider.user.entity.Xtjctpxxb;

public interface XtjctpxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtjctpxxb record);

    int insertSelective(Xtjctpxxb record);

    Xtjctpxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtjctpxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtjctpxxb record);

    int updateByPrimaryKey(Xtjctpxxb record);
}