package com.xiaoyu.provider.dao.ex;

import com.xiaoyu.provider.base.entity.Xtjctpxxb;
import org.apache.ibatis.annotations.Param;


public interface XtjctpxxbMapperEx {

    int insertXtjctpxxb(@Param("data") Xtjctpxxb xtjctpxxb);

}