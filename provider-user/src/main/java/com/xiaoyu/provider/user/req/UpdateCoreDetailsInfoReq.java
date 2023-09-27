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
@ApiModel(value = "UpdateCoreDetailsInfoReq", description = "修改中心简介详情请求接口请求入参")
public class UpdateCoreDetailsInfoReq extends BaseReqBean {
    private static final long serialVersionUID = 2496919121356546675L;

    @ApiModelProperty(value = "主键", name = "zj")
    @NotNull(message = "主键不能为空")
    private Long zj;

    @ApiModelProperty(value = "名称", name = "name")
    private String name;

    @ApiModelProperty(value = "电话", name = "phone")
    private String phone;

    @ApiModelProperty(value = "地址", name = "address")
    private String address;

    @ApiModelProperty(value = "qq地址", name = "qq")
    private String qq;

    @ApiModelProperty(value = "vx地址", name = "vx")
    private String vx;

    @ApiModelProperty(value = "机构主键", name = "orgId")
    private Long orgId;

}
