package com.xiaoyu.provider.dao.ex;

import com.xiaoyu.provider.base.entity.Xttgxmfjxxb;
import org.apache.ibatis.annotations.Param;

public interface XttgxmfjxxbMapperEx {

    int insertXttgxmfjxxb(@Param("data") Xttgxmfjxxb record);
}