package com.xiaoyu.provider.dao.ex;

import com.xiaoyu.provider.base.entity.Xtjsxxb;
import org.apache.ibatis.annotations.Param;

public interface XtjsxxbMapperEx {


    int insertXtjsxxb(@Param("data") Xtjsxxb xtjsxxb);

}