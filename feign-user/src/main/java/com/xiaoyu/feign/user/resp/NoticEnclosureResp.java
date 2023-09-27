package com.xiaoyu.feign.user.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * WJY
 */
@Data
@ApiModel(value = "NoticEnclosureResp", description = "通知公共附件信息返回实体类")
public class NoticEnclosureResp implements Serializable {
    private static final long serialVersionUID = -5471715070297813161L;

    @ApiModelProperty(value = "主键", name = "zj")
    private Long zj;

    @ApiModelProperty(value = "标题", name = "title")
    private String title;

    @ApiModelProperty(value = "大小", name = "ram")
    private String ram;

    @ApiModelProperty(value = "地址", name = "address")
    private String address;

}
