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
@ApiModel(value = "UpdateProjectInfoReq", description = "修改团购项目详情请求接口请求入参")
public class UpdateProjectInfoReq extends BaseReqBean {
    private static final long serialVersionUID = 8279637600933129326L;

    @ApiModelProperty(value = "主键", name = "zj",required = true)
    @NotNull(message = "主键不能为空")
    private Long zj;

    @ApiModelProperty(value = "项目名称", name = "name")
    private String name;

    @ApiModelProperty(value = "摘要", name = "summary")
    private String summary;

    @ApiModelProperty(value = "描述", name = "describe" )
    private String describe;

    @ApiModelProperty(value = "是否限购（1 限购 2 不限购）", name = "quota")
    private String quota;

    @ApiModelProperty(value = "最大购买数量", name = "max")
    private String max;

    @ApiModelProperty(value = "商品单价", name = "number")
    private String number;

    @ApiModelProperty(value = "当前状态（1 启用 2 停用）", name = "status")
    private String status;
}
