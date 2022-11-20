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
@ApiModel(value = "AddBlackInfoReq", description = "添加黑名单请求接口请求入参")
public class AddBlackInfoReq extends BaseReqBean {
    private static final long serialVersionUID = -1486275011204149190L;

    @ApiModelProperty(value = "类型（1 黑名单 2 白名单）", name = "type")
    @NotBlank(message = "类型不能为空")
    private String type;

    @ApiModelProperty(value = "ip地址", name = "address")
    @NotBlank(message = "ip地址不能为空")
    private String address;

    @ApiModelProperty(value = "说明", name = "explain")
    private String explain;
}
