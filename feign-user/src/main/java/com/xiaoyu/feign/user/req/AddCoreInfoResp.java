package com.xiaoyu.feign.user.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddCoreInfoResp", description = "添加中心简介内容请求接口请求入参")
public class AddCoreInfoResp implements Serializable {
    private static final long serialVersionUID = -3152963027137796263L;

    @ApiModelProperty(value = "内容", name = "content")
    private String content;

}
