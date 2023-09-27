package com.xiaoyu.provider.order.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * WJY
 */
@Data
@ApiModel(value = "UpdateProjectEnclosureInfoReq", description = "修改团购项目附件请求接口请求入参")
public class UpdateProjectEnclosureInfoReq extends BaseReqBean {
    private static final long serialVersionUID = -3124759823745549673L;

    @ApiModelProperty(value = "主键", name = "zj",required = true)
    @NotNull(message = "主键不能为空")
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
