package com.xiaoyu.provider.common.dao.ex;



import com.xiaoyu.provider.common.entity.Xtsjzdlxxxb;
import com.xiaoyu.provider.common.req.SelectDictionaryTypeReq;
import com.xiaoyu.provider.common.resp.SelectDictionaryTypeResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XtsjzdlxxxbMapperEx {

    int insertXtsjzdlxxxb(@Param("data") Xtsjzdlxxxb record);

    /**
     * 获取数据字典类型请求接口
     */
    List<SelectDictionaryTypeResp> selectDictionaryType(@Param("data")SelectDictionaryTypeReq req);
}