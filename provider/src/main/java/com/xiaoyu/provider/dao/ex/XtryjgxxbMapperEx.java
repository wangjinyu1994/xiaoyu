package com.xiaoyu.provider.dao.ex;

import com.xiaoyu.provider.base.entity.Xtryjgxxb;
import org.apache.ibatis.annotations.Param;

public interface XtryjgxxbMapperEx {


    int insertXtryjgxxb(@Param("data") Xtryjgxxb record);

}