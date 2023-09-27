package com.xiaoyu.provider.order.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * WJY
 */
@Data
@ApiModel(value = "ProjectEnclosureData", description = "团购项目附件返回实体类")
public class ProjectEnclosureData implements Serializable {

    @ApiModelProperty(value = "主键", name = "zj")
    private Long zj;

    @ApiModelProperty(value = "项目主键", name = "projectId")
    private Long projectId;

    @ApiModelProperty(value = "标题", name = "title")
    private String title;

    @ApiModelProperty(value = "大小", name = "ram")
    private String ram;

    @ApiModelProperty(value = "地址", name = "address")
    private String address;
}
