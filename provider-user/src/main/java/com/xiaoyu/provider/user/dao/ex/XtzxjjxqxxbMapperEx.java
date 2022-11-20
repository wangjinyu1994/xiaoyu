package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtzxjjxqxxb;
import org.apache.ibatis.annotations.Param;

public interface XtzxjjxqxxbMapperEx {

    int insertXtzxjjxqxxb(@Param("data") Xtzxjjxqxxb record);

}