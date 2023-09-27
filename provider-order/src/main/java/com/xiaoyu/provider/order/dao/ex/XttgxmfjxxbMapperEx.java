package com.xiaoyu.provider.order.dao.ex;


import com.xiaoyu.provider.order.entity.Xttgxmfjxxb;
import com.xiaoyu.provider.order.resp.ProjectEnclosureData;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XttgxmfjxxbMapperEx {

    int insertXttgxmfjxxb(@Param("data") Xttgxmfjxxb record);

    int insertXttgxmfjxxbBath(@Param("data")List<Xttgxmfjxxb> xtxxtzfjxxbs);

    List<ProjectEnclosureData> selectXttgxmfjxxbByXmzj(@Param("data")Long zj);
}