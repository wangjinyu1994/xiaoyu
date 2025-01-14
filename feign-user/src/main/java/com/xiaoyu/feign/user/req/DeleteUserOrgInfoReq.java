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
@ApiModel(value = "DeleteUserOrgInfoReq", description = "根据机构主键分页查询人员请求接口请求入参")
public class DeleteUserOrgInfoReq extends BaseReqBean {
    private static final long serialVersionUID = 8151686870730142477L;

    @ApiModelProperty(value = "主键", name = "zj" ,required = true)
    @NotNull(message = "主键不能为空")
    private Long zj;
}
