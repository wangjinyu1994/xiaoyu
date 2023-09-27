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
@ApiModel(value = "UpdateCoreContentInfoReq", description = "修改中心简介内容请求接口请求入参")
public class UpdateCoreContentInfoReq extends BaseReqBean {
    private static final long serialVersionUID = 2443865433556883849L;

    @ApiModelProperty(value = "内容", name = "content")
    private String content;

    @ApiModelProperty(value = "中心简介主键", name = "zxjjzj")
    private Long zxjjzj;

    @ApiModelProperty(value = "主键", name = "zj")
    @NotNull(message = "主键不能为空")
    private Long zj;
}
