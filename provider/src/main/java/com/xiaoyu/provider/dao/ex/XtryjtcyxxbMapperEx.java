package com.xiaoyu.provider.dao.ex;

import com.xiaoyu.provider.base.entity.Xtryjtcyxxb;
import org.apache.ibatis.annotations.Param;

public interface XtryjtcyxxbMapperEx {
    int insertXtryjtcyxxb(@Param("data") Xtryjtcyxxb record);


}