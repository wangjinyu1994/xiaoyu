package com.xiaoyu.provider.dao.ex;

import com.xiaoyu.provider.base.entity.Xttgxmddxxb;
import org.apache.ibatis.annotations.Param;

public interface XttgxmddxxbMapperEx {

    int insertXttgxmddxxb(@Param("data") Xttgxmddxxb record);
}