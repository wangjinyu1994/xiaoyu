package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqTableBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectRoleResourceTableReq", description = "分页查看角色资源详情请求接口请求入参")
public class SelectRoleResourceTableReq extends BaseReqTableBean {
    private static final long serialVersionUID = 5258414970239803070L;

    @ApiModelProperty(value = "角色主键", name = "roleId" )
    private Long roleId;

    @ApiModelProperty(value = "资源主键", name = "resourceId" )
    private Long resourceId;
}
