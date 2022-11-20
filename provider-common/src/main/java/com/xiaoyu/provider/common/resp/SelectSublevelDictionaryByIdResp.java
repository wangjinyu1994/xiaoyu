package com.xiaoyu.provider.common.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectSublevelDictionaryByIdResp", description = "根据数据字典主键获取子级数据字典请求接口返回实体类返回实体类")
public class SelectSublevelDictionaryByIdResp extends BaseRespBean {
    private static final long serialVersionUID = 3492933536614687171L;

    @ApiModelProperty(value = "字典表主键", name = "zj")
    private Long zj;

    @ApiModelProperty(value = "字典名称", name = "name")
    private String name;

    @ApiModelProperty(value = "字典说明", name = "explain")
    private String explain;

    @ApiModelProperty(value = "字典代码", name = "code")
    private String code;

    @ApiModelProperty(value = "字典类型主键", name = "typeId")
    private Long typeId;

    @ApiModelProperty(value = "父级字典主键", name = "parentZj")
    private Long parentZj;
}
