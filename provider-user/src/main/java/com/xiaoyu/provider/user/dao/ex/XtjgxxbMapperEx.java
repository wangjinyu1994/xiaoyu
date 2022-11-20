package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtjgxxb;
import org.apache.ibatis.annotations.Param;

public interface XtjgxxbMapperEx {

    int insertXtjgxxb(@Param("data") Xtjgxxb xtjgxxb);

}