package com.xiaoyu.provider.user.dao;


import com.xiaoyu.provider.user.entity.Xtdljkxxb;

public interface XtdljkxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtdljkxxb record);

    int insertSelective(Xtdljkxxb record);

    Xtdljkxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtdljkxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtdljkxxb record);

    int updateByPrimaryKey(Xtdljkxxb record);
}