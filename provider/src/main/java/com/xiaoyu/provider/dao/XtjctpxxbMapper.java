package com.xiaoyu.provider.dao;

import com.xiaoyu.provider.base.entity.Xtjctpxxb;

public interface XtjctpxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtjctpxxb record);

    int insertSelective(Xtjctpxxb record);

    Xtjctpxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtjctpxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtjctpxxb record);

    int updateByPrimaryKey(Xtjctpxxb record);
}