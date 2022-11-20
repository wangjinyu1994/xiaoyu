package com.xiaoyu.provider.common.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectDictionaryTypeResp", description = "获取数据字典类型请求接口返回实体类")
public class SelectDictionaryTypeResp extends BaseRespBean {
    private static final long serialVersionUID = -1347184992963267110L;

    @ApiModelProperty(value = "字典类型表主键", name = "zj")
    private Long zj;

    @ApiModelProperty(value = "字典类型名称", name = "name")
    private String name;

    @ApiModelProperty(value = "字典类型说明", name = "explain")
    private String explain;

    @ApiModelProperty(value = "字典类型代码", name = "code")
    private String code;

}
