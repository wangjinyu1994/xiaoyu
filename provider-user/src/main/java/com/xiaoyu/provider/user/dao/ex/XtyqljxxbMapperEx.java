package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtyqljxxb;
import org.apache.ibatis.annotations.Param;

public interface XtyqljxxbMapperEx {


    int insertXtyqljxxb(@Param("data") Xtyqljxxb record);

}