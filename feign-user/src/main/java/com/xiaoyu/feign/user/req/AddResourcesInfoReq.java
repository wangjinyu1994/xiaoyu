package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddResourcesInfoReq", description = "添加资源详情请求接口请求实体类")
public class AddResourcesInfoReq extends BaseReqBean {
    private static final long serialVersionUID = -4319422488189671344L;

    @ApiModelProperty(value = "资源名称", name = "name" )
    private String name;

    @ApiModelProperty(value = "资源描述", name = "describe" )
    private String describe;

    @ApiModelProperty(value = "资源代码", name = "code" )
    private String code;

    @ApiModelProperty(value = "父级code", name = "parentCode")
    private String parentCode;

    @ApiModelProperty(value = "父级主键", name = "parentZj")
    private Long parentZj;

    @ApiModelProperty(value = "资源渠道1 PC 2 手机", name = "channel")
    private String channel;

    @ApiModelProperty(value = "资源类型 按钮 表单等等", name = "typeId")
    private Long typeId;
}
