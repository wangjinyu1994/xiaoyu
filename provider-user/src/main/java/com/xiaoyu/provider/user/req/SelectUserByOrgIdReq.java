package com.xiaoyu.provider.user.req;

import com.xiaoyu.common.base.req.BaseReqTableBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectUserByOrgIdReq", description = "根据机构主键分页查询人员请求接口请求入参")
public class SelectUserByOrgIdReq extends BaseReqTableBean {
    private static final long serialVersionUID = 5531975609346489935L;

    @ApiModelProperty(value = "机构主键", name = "orgId" ,required = true)
    @NotNull(message = "机构主键不能为空")
    private Long orgId;

}
