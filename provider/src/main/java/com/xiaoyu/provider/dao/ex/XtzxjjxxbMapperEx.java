package com.xiaoyu.provider.dao.ex;

import com.xiaoyu.provider.base.entity.Xtzxjjxxb;
import org.apache.ibatis.annotations.Param;

public interface XtzxjjxxbMapperEx {

    int insertXtzxjjxxb(@Param("data") Xtzxjjxxb record);
}