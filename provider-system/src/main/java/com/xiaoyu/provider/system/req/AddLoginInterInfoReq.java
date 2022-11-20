package com.xiaoyu.provider.system.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddLoginInterInfoReq", description = "添加登录放行请求接口请求入参")
public class AddLoginInterInfoReq extends BaseReqBean {
    private static final long serialVersionUID = 2700307563505709756L;

    @ApiModelProperty(value = "服务名称", name = "serviceName")
    @NotBlank(message = "服务名称不能为空")
    private String serviceName;

    @ApiModelProperty(value = "接口地址", name = "address")
    @NotBlank(message = "接口地址不能为空")
    private String address;

    @ApiModelProperty(value = "说明", name = "explain")
    private String explain;

}
