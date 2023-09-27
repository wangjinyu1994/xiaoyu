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
@ApiModel(value = "SelectLinksInfoReq", description = "新增友情链接请求接口请求实体类")
public class AddLinksInfoReq extends BaseReqBean {
    private static final long serialVersionUID = 5187789523648965092L;

    @ApiModelProperty(value = "名称", name = "name")
    @NotBlank(message = "名称不能为空")
    private String name;

    @ApiModelProperty(value = "地址", name = "address")
    @NotBlank(message = "地址不能为空")
    private String address;

    @ApiModelProperty(value = "图片地址", name = "tpAddress")
    private String tpAddress;

}
