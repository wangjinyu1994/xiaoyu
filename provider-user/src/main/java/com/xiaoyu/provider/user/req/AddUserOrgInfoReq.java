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
@ApiModel(value = "AddUserOrgInfoReq", description = "添加人员机构请求接口请求入参")
public class AddUserOrgInfoReq extends BaseReqBean {
    private static final long serialVersionUID = -5953452048813163092L;

    @ApiModelProperty(value = "人员主键", name = "userId" )
    @NotNull(message = "人员主键不能为空")
    private Long userId;

    @ApiModelProperty(value = "所属机构主键", name = "orgId" )
    @NotNull(message = "机构主键不能为空")
    private Long orgId;

}
