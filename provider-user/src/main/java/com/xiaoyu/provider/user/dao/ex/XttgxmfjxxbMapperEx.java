package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xttgxmfjxxb;
import org.apache.ibatis.annotations.Param;

public interface XttgxmfjxxbMapperEx {

    int insertXttgxmfjxxb(@Param("data") Xttgxmfjxxb record);
}