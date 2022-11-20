package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtxxtzxxb;
import org.apache.ibatis.annotations.Param;

public interface XtxxtzxxbMapperEx {


    int insertXtxxtzxxb(@Param("data") Xtxxtzxxb record);

}