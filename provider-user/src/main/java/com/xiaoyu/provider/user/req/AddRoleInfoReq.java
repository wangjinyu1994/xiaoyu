package com.xiaoyu.provider.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddRoleInfoReq", description = "添加角色详情请求接口请求入参")
public class AddRoleInfoReq extends BaseReqBean {

    @ApiModelProperty(value = "所属机构主键", name = "orgId" )
    private Long orgId;

    @ApiModelProperty(value = "角色名称", name = "name" )
    private String name;

    @ApiModelProperty(value = "角色描述", name = "describe" )
    private String describe;

    @ApiModelProperty(value = "角色代码", name = "code" )
    private String code;
}
