package com.xiaoyu.provider.dao.ex;

import com.xiaoyu.provider.base.entity.Xtryxxb;
import org.apache.ibatis.annotations.Param;

public interface XtryxxbMapperEx {

    int insertXtryxxb(@Param("data") Xtryxxb record);

}