package com.xiaoyu.provider.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * WJY
 */
@Data
@ApiModel(value = "UpdateRoleResourceReq", description = "修改角色资源详情请求接口请求入参")
public class UpdateRoleResourceReq extends BaseReqBean {
    private static final long serialVersionUID = 2917464881988856522L;

    @ApiModelProperty(value = "主键", name = "zj" ,required = true)
    @NotNull(message = "主键不能为空")
    private Long zj;

    @ApiModelProperty(value = "角色主键", name = "roleId" )
    private Long roleId;

    @ApiModelProperty(value = "资源主键", name = "resourceId" )
    private Long resourceId;

}
