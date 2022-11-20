package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtsjzdxxb;
import org.apache.ibatis.annotations.Param;

public interface XtsjzdxxbMapperEx {

    int insertXtsjzdxxb(@Param("data") Xtsjzdxxb record);

}