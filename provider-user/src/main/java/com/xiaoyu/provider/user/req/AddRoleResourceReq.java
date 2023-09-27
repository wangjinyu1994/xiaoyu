package com.xiaoyu.provider.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddRoleResourceReq", description = "添加角色资源详情请求接口请求入参")
public class AddRoleResourceReq extends BaseReqBean {
    private static final long serialVersionUID = -7877294658899208740L;

    @ApiModelProperty(value = "角色主键", name = "roleId" )
    private Long roleId;

    @ApiModelProperty(value = "资源主键", name = "resourceId" )
    private Long resourceId;
}
