package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtjsxxb;
import org.apache.ibatis.annotations.Param;

public interface XtjsxxbMapperEx {


    int insertXtjsxxb(@Param("data") Xtjsxxb xtjsxxb);

}