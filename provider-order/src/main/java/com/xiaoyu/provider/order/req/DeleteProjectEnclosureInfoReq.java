package com.xiaoyu.provider.order.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * WJY
 */
@Data
@ApiModel(value = "DeleteProjectEnclosureInfoReq", description = "删除团购项目附件请求接口请求入参")
public class DeleteProjectEnclosureInfoReq extends BaseReqBean {
    private static final long serialVersionUID = -8097502734052881746L;

    @ApiModelProperty(value = "主键", name = "zj",required = true)
    @NotNull(message = "主键不能为空")
    private Long zj;
}
