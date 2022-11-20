package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtsjzdlxxxb;
import org.apache.ibatis.annotations.Param;

public interface XtsjzdlxxxbMapperEx {

    int insertXtsjzdlxxxb(@Param("data") Xtsjzdlxxxb record);

}