package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xttgxmxxb;
import org.apache.ibatis.annotations.Param;

public interface XttgxmxxbMapperEx {

    int insertXttgxmxxb(@Param("data") Xttgxmxxb record);

}