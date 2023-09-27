package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * WJY
 */
@Data
@ApiModel(value = "UpdateRoleInfoReq", description = "修改角色详情请求接口请求入参")
public class UpdateRoleInfoReq extends BaseReqBean {

    @ApiModelProperty(value = "主键", name = "zj" ,required = true)
    @NotNull(message = "主键不能为空")
    private Long zj;

    @ApiModelProperty(value = "所属机构主键", name = "orgId" )
    private Long orgId;

    @ApiModelProperty(value = "角色名称", name = "name" )
    private String name;

    @ApiModelProperty(value = "角色描述", name = "describe" )
    private String describe;

    @ApiModelProperty(value = "角色代码", name = "code" )
    private String code;

    @ApiModelProperty(value = "顺序", name = "sx" )
    private Integer sx;

}
