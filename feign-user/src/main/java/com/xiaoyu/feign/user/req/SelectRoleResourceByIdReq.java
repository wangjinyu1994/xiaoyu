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
@ApiModel(value = "SelectRoleResourceByIdReq", description = "根据主键查看角色资源详情请求接口请求入参")
public class SelectRoleResourceByIdReq extends BaseReqBean {
    private static final long serialVersionUID = 7119645873811703671L;

    @ApiModelProperty(value = "主键", name = "zj" ,required = true)
    @NotNull(message = "主键不能为空")
    private Long zj;
}
