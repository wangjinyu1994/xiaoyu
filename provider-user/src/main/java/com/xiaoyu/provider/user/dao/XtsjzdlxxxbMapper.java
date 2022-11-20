package com.xiaoyu.provider.user.dao;


import com.xiaoyu.provider.user.entity.Xtsjzdlxxxb;

public interface XtsjzdlxxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtsjzdlxxxb record);

    int insertSelective(Xtsjzdlxxxb record);

    Xtsjzdlxxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtsjzdlxxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtsjzdlxxxb record);

    int updateByPrimaryKey(Xtsjzdlxxxb record);
}