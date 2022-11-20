package com.xiaoyu.provider.user.dao;


import com.xiaoyu.provider.user.entity.Xtjsxxb;

public interface XtjsxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtjsxxb record);

    int insertSelective(Xtjsxxb record);

    Xtjsxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtjsxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtjsxxb record);

    int updateByPrimaryKey(Xtjsxxb record);
}