package com.xiaoyu.provider.dao.ex;

import com.xiaoyu.provider.base.entity.Xttgxmxxb;
import org.apache.ibatis.annotations.Param;

public interface XttgxmxxbMapperEx {

    int insertXttgxmxxb(@Param("data") Xttgxmxxb record);

}