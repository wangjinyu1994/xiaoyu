package com.xiaoyu.feign.common.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectDictionaryByTypeIdReq", description = "根据数据字典类型主键获取数据字典请求接口请求入参")
public class SelectDictionaryByTypeIdReq extends BaseReqBean {
    private static final long serialVersionUID = 153303871140182115L;

    @ApiModelProperty(value = "字典类型主键主键", name = "zj",required = true)
    @NotNull(message = "字典类型主键主键不能为空")
    private Long zj;

}
