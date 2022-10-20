package com.xiaoyu.provider.dao;

import com.xiaoyu.provider.base.entity.Xtzxjjxxb;

public interface XtzxjjxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtzxjjxxb record);

    int insertSelective(Xtzxjjxxb record);

    Xtzxjjxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtzxjjxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtzxjjxxb record);

    int updateByPrimaryKey(Xtzxjjxxb record);
}