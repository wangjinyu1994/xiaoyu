package com.xiaoyu.provider.dao.ex;

import com.xiaoyu.provider.base.entity.Xtsjzdxxb;
import org.apache.ibatis.annotations.Param;

public interface XtsjzdxxbMapperEx {

    int insertXtsjzdxxb(@Param("data") Xtsjzdxxb record);

}