package com.xiaoyu.feign.common.controller;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.feign.common.req.SelectDictionaryByTypeIdReq;
import com.xiaoyu.feign.common.req.SelectDictionaryTypeReq;
import com.xiaoyu.feign.common.req.SelectSublevelDictionaryByTypeIdReq;
import com.xiaoyu.feign.common.resp.SelectDictionaryByTypeIdResp;
import com.xiaoyu.feign.common.resp.SelectDictionaryTypeResp;
import com.xiaoyu.feign.common.resp.SelectSublevelDictionaryByIdResp;
import com.xiaoyu.feign.common.service.DictionaryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.List;

/**
 * WJY
 */
@RestController
@RequestMapping("/sys/xiaoyu/common/dictionary")
public class DictionaryController {

    @Autowired
    private DictionaryService dictionaryService;

    @PostMapping(value = "/selectDictionaryType")
    @ApiOperation(value = "获取数据字典类型请求接口", httpMethod = "POST",notes = "获取数据字典类型请求接口")
    public CommonResult<List<SelectDictionaryTypeResp>> selectDictionaryType(@RequestBody @Valid SelectDictionaryTypeReq req){
        return dictionaryService.selectDictionaryType(req);
    }

    @PostMapping(value = "/selectDictionaryByTypeId")
    @ApiOperation(value = "根据数据字典类型主键获取数据字典请求接口", httpMethod = "POST",notes = "根据数据字典类型主键获取数据字典请求接口")
    public CommonResult<List<SelectDictionaryByTypeIdResp>> selectDictionaryByTypeId(@RequestBody @Valid SelectDictionaryByTypeIdReq req){
        return dictionaryService.selectDictionaryByTypeId(req);
    }

    @PostMapping(value = "/selectSublevelDictionaryById")
    @ApiOperation(value = "根据数据字典主键获取子级数据字典请求接口", httpMethod = "POST",notes = "根据数据字典主键获取子级数据字典请求接口")
    public CommonResult<List<SelectSublevelDictionaryByIdResp>> selectSublevelDictionaryById(@RequestBody @Valid SelectSublevelDictionaryByTypeIdReq req){
        return dictionaryService.selectSublevelDictionaryById(req);
    }

}
