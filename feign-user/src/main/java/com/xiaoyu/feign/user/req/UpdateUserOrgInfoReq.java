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
@ApiModel(value = "UpdateUserOrgInfoReq", description = "根据机构主键分页查询人员请求接口请求入参")
public class UpdateUserOrgInfoReq extends BaseReqBean {
    private static final long serialVersionUID = 149951871170504602L;

    @ApiModelProperty(value = "主键", name = "zj" ,required = true)
    @NotNull(message = "主键不能为空")
    private Long zj;

    @ApiModelProperty(value = "人员主键", name = "userId"  ,required = true)
    @NotNull(message = "人员主键不能为空")
    private Long userId;

    @ApiModelProperty(value = "所属机构主键", name = "orgId"  ,required = true)
    @NotNull(message = "机构主键不能为空")
    private Long orgId;

}
