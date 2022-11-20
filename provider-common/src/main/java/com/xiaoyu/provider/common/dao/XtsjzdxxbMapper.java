package com.xiaoyu.provider.common.dao;


import com.xiaoyu.provider.common.entity.Xtsjzdxxb;

public interface XtsjzdxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtsjzdxxb record);

    int insertSelective(Xtsjzdxxb record);

    Xtsjzdxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtsjzdxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtsjzdxxb record);

    int updateByPrimaryKey(Xtsjzdxxb record);
}