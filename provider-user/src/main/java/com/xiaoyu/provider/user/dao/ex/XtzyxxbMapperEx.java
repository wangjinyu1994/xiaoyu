package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtzyxxb;
import org.apache.ibatis.annotations.Param;

public interface XtzyxxbMapperEx {

    int insertXtzyxxb(@Param("data") Xtzyxxb record);

}