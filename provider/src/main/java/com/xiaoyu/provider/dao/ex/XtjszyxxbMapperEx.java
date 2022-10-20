package com.xiaoyu.provider.dao.ex;

import com.xiaoyu.provider.base.entity.Xtjszyxxb;
import org.apache.ibatis.annotations.Param;

public interface XtjszyxxbMapperEx {

    int insertXtjszyxxb(@Param("data") Xtjszyxxb record);

}