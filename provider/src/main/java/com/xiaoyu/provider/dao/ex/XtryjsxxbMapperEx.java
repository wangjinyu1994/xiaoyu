package com.xiaoyu.provider.dao.ex;

import com.xiaoyu.provider.base.entity.Xtryjsxxb;
import org.apache.ibatis.annotations.Param;

public interface XtryjsxxbMapperEx {

    int insertXtryjsxxb(@Param("data") Xtryjsxxb record);


}