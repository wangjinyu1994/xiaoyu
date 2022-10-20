package com.xiaoyu.provider.dao.ex;

import com.xiaoyu.provider.base.entity.Xtryjyqkxxb;
import org.apache.ibatis.annotations.Param;

public interface XtryjyqkxxbMapperEx {

    int insertXtryjyqkxxb(@Param("data") Xtryjyqkxxb record);

}