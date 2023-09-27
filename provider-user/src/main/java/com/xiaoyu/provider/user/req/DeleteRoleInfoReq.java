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
@ApiModel(value = "DeleteRoleInfoReq", description = "删除角色详情请求接口请求入参")
public class DeleteRoleInfoReq extends BaseReqBean {

    @ApiModelProperty(value = "主键", name = "zj" ,required = true)
    @NotNull(message = "主键不能为空")
    private Long zj;
}
