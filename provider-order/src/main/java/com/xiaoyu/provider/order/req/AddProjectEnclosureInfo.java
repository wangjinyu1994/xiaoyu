package com.xiaoyu.provider.order.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddProjectEnclosureInfo", description = "添加团购项目附件请求接口请求入参")
public class AddProjectEnclosureInfo implements Serializable {
    private static final long serialVersionUID = 2010204779595614112L;

    @ApiModelProperty(value = "标题", name = "title")
    private String title;

    @ApiModelProperty(value = "大小", name = "ram")
    private String ram;

    @ApiModelProperty(value = "地址", name = "address")
    private String address;
}
