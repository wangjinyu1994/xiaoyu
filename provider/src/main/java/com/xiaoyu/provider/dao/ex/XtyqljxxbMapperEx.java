package com.xiaoyu.provider.dao.ex;

import com.xiaoyu.provider.base.entity.Xtyqljxxb;
import org.apache.ibatis.annotations.Param;

public interface XtyqljxxbMapperEx {


    int insertXtyqljxxb(@Param("data") Xtyqljxxb record);

}