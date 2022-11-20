package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xttgxmddxxb;
import org.apache.ibatis.annotations.Param;

public interface XttgxmddxxbMapperEx {

    int insertXttgxmddxxb(@Param("data") Xttgxmddxxb record);
}