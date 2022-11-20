package com.xiaoyu.provider.system.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * WJY
 */
@Data
@ApiModel(value = "DeleteBlackByIdReq", description = "根据主键删除黑名单请求接口请求入参")
public class DeleteBlackByIdReq extends BaseReqBean {
    private static final long serialVersionUID = -6095657252786129633L;

    @ApiModelProperty(value = "主键", name = "zj" ,required = true)
    @NotNull(message = "主键不能为空")
    private Long zj;
}
