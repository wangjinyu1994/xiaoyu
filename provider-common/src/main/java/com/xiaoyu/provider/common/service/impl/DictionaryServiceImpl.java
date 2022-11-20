package com.xiaoyu.provider.common.service.impl;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.provider.common.dao.XtsjzdlxxxbMapper;
import com.xiaoyu.provider.common.dao.XtsjzdxxbMapper;
import com.xiaoyu.provider.common.dao.ex.XtsjzdlxxxbMapperEx;
import com.xiaoyu.provider.common.dao.ex.XtsjzdxxbMapperEx;
import com.xiaoyu.provider.common.req.SelectDictionaryByTypeIdReq;
import com.xiaoyu.provider.common.req.SelectDictionaryTypeReq;
import com.xiaoyu.provider.common.req.SelectSublevelDictionaryByTypeIdReq;
import com.xiaoyu.provider.common.resp.SelectDictionaryByTypeIdResp;
import com.xiaoyu.provider.common.resp.SelectDictionaryTypeResp;
import com.xiaoyu.provider.common.resp.SelectSublevelDictionaryByIdResp;
import com.xiaoyu.provider.common.service.DictionaryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * WJY
 */
@Service
@Slf4j
public class DictionaryServiceImpl implements DictionaryService {

    @Autowired
    private XtsjzdlxxxbMapper xtsjzdlxxxbMapper;
    @Autowired
    private XtsjzdlxxxbMapperEx xtsjzdlxxxbMapperEx;
    @Autowired
    private XtsjzdxxbMapper xtsjzdxxbMapper;
    @Autowired
    private XtsjzdxxbMapperEx xtsjzdxxbMapperEx;

    /**
     * 获取数据字典类型请求接口
     */
    @Override
    public CommonResult<List<SelectDictionaryTypeResp>> selectDictionaryType(SelectDictionaryTypeReq req) {
        List<SelectDictionaryTypeResp> resps = xtsjzdlxxxbMapperEx.selectDictionaryType(req);
        return CommonResult.success(resps);
    }

    /**
     * 根据数据字典类型主键获取数据字典请求接口
     */
    @Override
    public CommonResult<List<SelectDictionaryByTypeIdResp>> selectDictionaryByTypeId(SelectDictionaryByTypeIdReq req) {
        List<SelectDictionaryByTypeIdResp> resps = xtsjzdxxbMapperEx.selectDictionaryByTypeId(req);
        return CommonResult.success(resps);
    }

    /**
     * 根据数据字典主键获取子级数据字典请求接口
     */
    @Override
    public CommonResult<List<SelectSublevelDictionaryByIdResp>> selectSublevelDictionaryById(SelectSublevelDictionaryByTypeIdReq req) {
        List<SelectSublevelDictionaryByIdResp> resps = xtsjzdxxbMapperEx.selectSublevelDictionaryById(req);
        return CommonResult.success(resps);
    }
}
