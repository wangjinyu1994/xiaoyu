package com.xiaoyu.provider.user.dao.ex;


import com.xiaoyu.provider.user.entity.Xtxxtzfjxxb;
import com.xiaoyu.provider.user.resp.NoticEnclosureResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XtxxtzfjxxbMapperEx {

    int insertXtxxtzfjxxb(@Param("data") Xtxxtzfjxxb xtxxtzfjxxb);

    int insertXtxxtzfjxxbBath(@Param("data")List<Xtxxtzfjxxb> xtxxtzfjxxbs);

    List<NoticEnclosureResp> selectXtxxtzfjxxbByXxtzzj(@Param("data")Long zj);
}