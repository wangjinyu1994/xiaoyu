package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddCoreDetailsInfoReq", description = "添加中心简介详情请求接口请求入参")
public class AddCoreDetailsInfoReq extends BaseReqBean {
    private static final long serialVersionUID = -5786550702807939451L;

    @ApiModelProperty(value = "名称", name = "name",required = true)
    @NotBlank(message = "名称不能为空")
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

    @ApiModelProperty(value = "中心简介内容", name = "data")
    private AddCoreInfoResp data;

}
