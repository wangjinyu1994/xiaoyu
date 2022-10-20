package com.xiaoyu.provider.dao.ex;

import com.xiaoyu.provider.base.entity.Xtjgxxb;
import org.apache.ibatis.annotations.Param;


public interface XtjgxxbMapperEx {

    int insertXtjgxxb(@Param("data") Xtjgxxb xtjgxxb);

}