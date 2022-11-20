package com.xiaoyu.provider.common.dao;


import com.xiaoyu.provider.common.entity.Xtsjzdlxxxb;

public interface XtsjzdlxxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtsjzdlxxxb record);

    int insertSelective(Xtsjzdlxxxb record);

    Xtsjzdlxxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtsjzdlxxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtsjzdlxxxb record);

    int updateByPrimaryKey(Xtsjzdlxxxb record);
}