package com.xiaoyu.feign.common.service;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.feign.common.req.SelectDictionaryByTypeIdReq;
import com.xiaoyu.feign.common.req.SelectDictionaryTypeReq;
import com.xiaoyu.feign.common.req.SelectSublevelDictionaryByTypeIdReq;
import com.xiaoyu.feign.common.resp.SelectDictionaryByTypeIdResp;
import com.xiaoyu.feign.common.resp.SelectDictionaryTypeResp;
import com.xiaoyu.feign.common.resp.SelectSublevelDictionaryByIdResp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * WJY
 */
@FeignClient(value = "xiaoyu-provider-common")
public interface DictionaryService {

    @PostMapping(value = "/sys/xiaoyu/common/dictionary/selectDictionaryType")
    CommonResult<List<SelectDictionaryTypeResp>> selectDictionaryType(SelectDictionaryTypeReq req);

    @PostMapping(value = "/sys/xiaoyu/common/dictionary/selectDictionaryByTypeId")
    CommonResult<List<SelectDictionaryByTypeIdResp>> selectDictionaryByTypeId(SelectDictionaryByTypeIdReq req);

    @PostMapping(value = "/sys/xiaoyu/common/dictionary/selectSublevelDictionaryById")
    CommonResult<List<SelectSublevelDictionaryByIdResp>> selectSublevelDictionaryById(SelectSublevelDictionaryByTypeIdReq req);
}
