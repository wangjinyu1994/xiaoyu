package com.xiaoyu.provider.dao.ex;

import com.xiaoyu.provider.base.entity.Xtxzqyxxb;
import org.apache.ibatis.annotations.Param;

public interface XtxzqyxxbMapperEx {

    int insertXtxzqyxxb(@Param("data") Xtxzqyxxb record);

}