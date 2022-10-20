package com.xiaoyu.provider.dao.ex;

import com.xiaoyu.provider.base.entity.Xtrygzjlxxb;
import org.apache.ibatis.annotations.Param;

public interface XtrygzjlxxbMapperEx {

    int insertXtrygzjlxxb(@Param("data") Xtrygzjlxxb record);

}