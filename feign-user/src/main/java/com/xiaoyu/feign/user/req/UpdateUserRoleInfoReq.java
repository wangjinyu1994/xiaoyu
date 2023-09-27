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
@ApiModel(value = "UpdateUserRoleInfoReq", description = "修改人员角色请求接口请求入参")
public class UpdateUserRoleInfoReq extends BaseReqBean {
    private static final long serialVersionUID = 7004815910681034833L;

    @ApiModelProperty(value = "主键", name = "zj" ,required = true)
    @NotNull(message = "主键不能为空")
    private Long zj;

    @ApiModelProperty(value = "人员主键", name = "userId" )
    private Long userId;

    @ApiModelProperty(value = "角色主键", name = "roleId" )
    private Long roleId;
}
