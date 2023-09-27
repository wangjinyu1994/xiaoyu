package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddCoreDetailsInfoResp", description = "查询所有资源请求接口返回实体类")
public class SelectAllResourcesResp extends BaseRespBean {
    private static final long serialVersionUID = 5040176122403033820L;

    @ApiModelProperty(value = "主键", name = "zj")
    private Long zj;

    @ApiModelProperty(value = "资源名称", name = "name" )
    private String name;

    @ApiModelProperty(value = "资源描述", name = "describe" )
    private String describe;

    @ApiModelProperty(value = "资源代码", name = "code" )
    private String code;

    @ApiModelProperty(value = "排序", name = "sx")
    private Integer sx;

    @ApiModelProperty(value = "父级code", name = "parentCode")
    private String parentCode;

    @ApiModelProperty(value = "父级主键", name = "parentZj")
    private Long parentZj;

    @ApiModelProperty(value = "资源渠道1 PC 2 手机", name = "channel")
    private String channel;

    @ApiModelProperty(value = "资源类型 按钮 表单等等", name = "typeId")
    private Long typeId;

    @ApiModelProperty(value = "资源类型 按钮 表单等等", name = "typeStr")
    private String typeStr;
}
