package com.xiaoyu.feign.common.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectDictionaryTypeReq", description = "获取数据字典类型请求接口请求入参")
public class SelectDictionaryTypeReq extends BaseReqBean {
    private static final long serialVersionUID = 6851710520686700552L;
}
