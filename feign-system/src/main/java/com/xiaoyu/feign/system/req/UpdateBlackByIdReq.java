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
@ApiModel(value = "UpdateBlackByIdReq", description = "根据主键修改黑名单请求接口请求入参")
public class UpdateBlackByIdReq extends BaseReqBean {
    private static final long serialVersionUID = 7107606295672734684L;

    @ApiModelProperty(value = "主键", name = "zj" ,required = true)
    @NotNull(message = "主键不能为空")
    private Long zj;

    @ApiModelProperty(value = "类型（类型1 黑名单 2 白名单）", name = "type")
    private String type;

    @ApiModelProperty(value = "ip地址", name = "address")
    private String address;

    @ApiModelProperty(value = "启用状态（1 使用 2 停用）", name = "status")
    private String status;
}
