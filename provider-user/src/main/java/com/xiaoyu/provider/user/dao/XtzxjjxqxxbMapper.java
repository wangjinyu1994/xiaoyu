package com.xiaoyu.provider.user.dao;


import com.xiaoyu.provider.user.entity.Xtzxjjxqxxb;

public interface XtzxjjxqxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtzxjjxqxxb record);

    int insertSelective(Xtzxjjxqxxb record);

    Xtzxjjxqxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtzxjjxqxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtzxjjxqxxb record);

    int updateByPrimaryKey(Xtzxjjxqxxb record);
}