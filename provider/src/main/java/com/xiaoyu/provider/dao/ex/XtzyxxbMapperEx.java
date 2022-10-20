package com.xiaoyu.provider.dao.ex;

import com.xiaoyu.provider.base.entity.Xtzyxxb;
import org.apache.ibatis.annotations.Param;

public interface XtzyxxbMapperEx {

    int insertXtzyxxb(@Param("data") Xtzyxxb record);

}