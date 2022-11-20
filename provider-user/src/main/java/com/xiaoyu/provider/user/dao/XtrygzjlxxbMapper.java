package com.xiaoyu.provider.user.dao;

import com.xiaoyu.provider.user.entity.Xtrygzjlxxb;

public interface XtrygzjlxxbMapper {
    int deleteByPrimaryKey(Long zj);

    int insert(Xtrygzjlxxb record);

    int insertSelective(Xtrygzjlxxb record);

    Xtrygzjlxxb selectByPrimaryKey(Long zj);

    int updateByPrimaryKeySelective(Xtrygzjlxxb record);

    int updateByPrimaryKeyWithBLOBs(Xtrygzjlxxb record);

    int updateByPrimaryKey(Xtrygzjlxxb record);
}