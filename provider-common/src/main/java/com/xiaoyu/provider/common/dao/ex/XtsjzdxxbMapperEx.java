package com.xiaoyu.provider.common.dao.ex;



import com.xiaoyu.provider.common.entity.Xtsjzdxxb;
import com.xiaoyu.provider.common.req.SelectDictionaryByTypeIdReq;
import com.xiaoyu.provider.common.req.SelectSublevelDictionaryByTypeIdReq;
import com.xiaoyu.provider.common.resp.SelectDictionaryByTypeIdResp;
import com.xiaoyu.provider.common.resp.SelectSublevelDictionaryByIdResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XtsjzdxxbMapperEx {

    int insertXtsjzdxxb(@Param("data") Xtsjzdxxb record);

    /**
     * 根据数据字典类型主键获取数据字典请求接口
     */
    List<SelectDictionaryByTypeIdResp> selectDictionaryByTypeId(@Param("data")SelectDictionaryByTypeIdReq req);

    /**
     * 根据数据字典主键获取子级数据字典请求接口
     */
    List<SelectSublevelDictionaryByIdResp> selectSublevelDictionaryById(@Param("data")SelectSublevelDictionaryByTypeIdReq req);
}