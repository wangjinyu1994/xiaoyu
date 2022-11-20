package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtjszyxxb;
import org.apache.ibatis.annotations.Param;

public interface XtjszyxxbMapperEx {

    int insertXtjszyxxb(@Param("data") Xtjszyxxb record);

}