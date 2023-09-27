package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddCoreContentInfoReq", description = "添加中心简介内容请求接口请求入参")
public class AddCoreContentInfoReq extends BaseReqBean {
    private static final long serialVersionUID = 2996473045588738272L;

    @ApiModelProperty(value = "内容", name = "content",required = true)
    @NotBlank(message = "内容不能为空")
    private String content;

    @ApiModelProperty(value = "中心简介主键", name = "zxjjzj",required = true)
    @NotNull(message = "中心简介主键不能为空")
    private Long zxjjzj;
}
