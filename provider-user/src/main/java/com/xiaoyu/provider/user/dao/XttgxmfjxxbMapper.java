package com.xiaoyu.provider.user.dao;


import com.xiaoyu.provider.user.entity.Xttgxmfjxxb;

public interface XttgxmfjxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xttgxmfjxxb record);

    int insertSelective(Xttgxmfjxxb record);

    Xttgxmfjxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xttgxmfjxxb record);

    int updateByPrimaryKeyWithBLOBs(Xttgxmfjxxb record);

    int updateByPrimaryKey(Xttgxmfjxxb record);
}