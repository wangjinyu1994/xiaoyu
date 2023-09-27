package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddUserRoleInfoReq", description = "添加人员角色请求接口请求入参")
public class AddUserRoleInfoReq extends BaseReqBean {
    private static final long serialVersionUID = 6200729362680362558L;

    @ApiModelProperty(value = "人员主键", name = "userId" )
    private Long userId;

    @ApiModelProperty(value = "角色主键", name = "roleId" )
    private Long roleId;
}
