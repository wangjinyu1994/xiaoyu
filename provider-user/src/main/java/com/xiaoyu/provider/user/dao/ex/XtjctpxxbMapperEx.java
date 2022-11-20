package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtjctpxxb;
import org.apache.ibatis.annotations.Param;

public interface XtjctpxxbMapperEx {

    int insertXtjctpxxb(@Param("data") Xtjctpxxb xtjctpxxb);

}