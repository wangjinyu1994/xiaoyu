package com.xiaoyu.provider.user.dao.ex;

import com.xiaoyu.provider.user.entity.Xtxzqyxxb;
import org.apache.ibatis.annotations.Param;

public interface XtxzqyxxbMapperEx {

    int insertXtxzqyxxb(@Param("data") Xtxzqyxxb record);

}