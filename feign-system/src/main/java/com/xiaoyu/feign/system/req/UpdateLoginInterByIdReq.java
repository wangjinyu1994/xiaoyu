package com.xiaoyu.feign.system.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectLoginInterListReq", description = "获取所有登录放行请求接口请求入参")
public class UpdateLoginInterByIdReq extends BaseReqBean {
    private static final long serialVersionUID = 6526430709350314130L;

    @ApiModelProperty(value = "主键", name = "zj" ,required = true)
    @NotNull(message = "主键不能为空")
    private Long zj;

    @ApiModelProperty(value = "地址", name = "address")
    private String address;

    @ApiModelProperty(value = "服务名称", name = "serviceName")
    private String serviceName;

    @ApiModelProperty(value = "启用状态（1 使用 2 停用）", name = "status")
    private String status;

    @ApiModelProperty(value = "说明", name = "explain")
    private String explain;

}
