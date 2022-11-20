package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtryjsxxb;
import org.apache.ibatis.annotations.Param;

public interface XtryjsxxbMapperEx {

    int insertXtryjsxxb(@Param("data") Xtryjsxxb record);


}