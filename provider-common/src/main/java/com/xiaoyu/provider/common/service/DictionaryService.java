package com.xiaoyu.provider.common.service;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.provider.common.req.SelectDictionaryByTypeIdReq;
import com.xiaoyu.provider.common.req.SelectDictionaryTypeReq;
import com.xiaoyu.provider.common.req.SelectSublevelDictionaryByTypeIdReq;
import com.xiaoyu.provider.common.resp.SelectDictionaryByTypeIdResp;
import com.xiaoyu.provider.common.resp.SelectDictionaryTypeResp;
import com.xiaoyu.provider.common.resp.SelectSublevelDictionaryByIdResp;

import java.util.List;

/**
 * WJY
 */
public interface DictionaryService {

    /**
     * 获取数据字典类型请求接口
     */
    CommonResult<List<SelectDictionaryTypeResp>> selectDictionaryType(SelectDictionaryTypeReq req);

    /**
     * 根据数据字典类型主键获取数据字典请求接口
     */
    CommonResult<List<SelectDictionaryByTypeIdResp>> selectDictionaryByTypeId(SelectDictionaryByTypeIdReq req);

    /**
     * 根据数据字典主键获取子级数据字典请求接口
     */
    CommonResult<List<SelectSublevelDictionaryByIdResp>> selectSublevelDictionaryById(SelectSublevelDictionaryByTypeIdReq req);
}
