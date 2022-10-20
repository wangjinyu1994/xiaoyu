package com.xiaoyu.provider.dao.ex;

import com.xiaoyu.provider.base.entity.Xtzxjjxqxxb;
import org.apache.ibatis.annotations.Param;

public interface XtzxjjxqxxbMapperEx {

    int insertXtzxjjxqxxb(@Param("data") Xtzxjjxqxxb record);

}