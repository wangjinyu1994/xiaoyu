package com.xiaoyu.provider.dao.ex;

import com.xiaoyu.provider.base.entity.Xtsjzdlxxxb;
import org.apache.ibatis.annotations.Param;

public interface XtsjzdlxxxbMapperEx {

    int insertXtsjzdlxxxb(@Param("data") Xtsjzdlxxxb record);

}