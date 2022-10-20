package com.xiaoyu.provider.dao.ex;

import com.xiaoyu.provider.base.entity.Xtxxtzxxb;
import org.apache.ibatis.annotations.Param;

public interface XtxxtzxxbMapperEx {


    int insertXtxxtzxxb(@Param("data") Xtxxtzxxb record);

}