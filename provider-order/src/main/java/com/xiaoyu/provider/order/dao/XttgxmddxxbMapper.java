package com.xiaoyu.provider.order.dao;


import com.xiaoyu.provider.order.entity.Xttgxmddxxb;

public interface XttgxmddxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xttgxmddxxb record);

    int insertSelective(Xttgxmddxxb record);

    Xttgxmddxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xttgxmddxxb record);

    int updateByPrimaryKeyWithBLOBs(Xttgxmddxxb record);

    int updateByPrimaryKey(Xttgxmddxxb record);
}