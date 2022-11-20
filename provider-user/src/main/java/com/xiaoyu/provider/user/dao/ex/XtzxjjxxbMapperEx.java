package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtzxjjxxb;
import org.apache.ibatis.annotations.Param;

public interface XtzxjjxxbMapperEx {

    int insertXtzxjjxxb(@Param("data") Xtzxjjxxb record);
}