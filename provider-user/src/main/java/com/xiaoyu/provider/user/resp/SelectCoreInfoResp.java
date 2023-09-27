package com.xiaoyu.provider.user.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * WJY
 */
@Data
@ApiModel(value = "SelectCoreInfoResp", description = "查询中心简介请求接口返回实体类")
public class SelectCoreInfoResp implements Serializable {
    private static final long serialVersionUID = 6154847668343942112L;

    @ApiModelProperty(value = "内容", name = "content")
    private String content;

    @ApiModelProperty(value = "中心简介主键", name = "zxjjzj")
    private Long zxjjzj;

    @ApiModelProperty(value = "主键", name = "zj")
    private Long zj;
}
