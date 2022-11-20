package com.xiaoyu.provider.user.dao.ex;

import com.xiaoyu.provider.user.entity.Xtryjgxxb;
import org.apache.ibatis.annotations.Param;

public interface XtryjgxxbMapperEx {


    int insertXtryjgxxb(@Param("data") Xtryjgxxb record);

}