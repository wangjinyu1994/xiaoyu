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
@ApiModel(value = "SelectSublevelDictionaryByTypeIdReq", description = "根据数据字典主键获取子级数据字典请求接口请求入参")
public class SelectSublevelDictionaryByTypeIdReq extends BaseReqBean {
    private static final long serialVersionUID = -4068821437728171304L;

    @ApiModelProperty(value = "字典主键主键", name = "zj",required = true)
    @NotNull(message = "字典主键主键不能为空")
    private Long zj;

    @ApiModelProperty(value = "字典主键等级", name = "zj")
    private String level;
}
