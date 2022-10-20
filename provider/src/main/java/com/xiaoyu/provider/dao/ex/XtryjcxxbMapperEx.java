package com.xiaoyu.provider.dao.ex;

import com.xiaoyu.provider.base.entity.Xtryjcxxb;
import org.apache.ibatis.annotations.Param;

public interface XtryjcxxbMapperEx {
    int insertXtryjcxxb(@Param("data") Xtryjcxxb record);
}