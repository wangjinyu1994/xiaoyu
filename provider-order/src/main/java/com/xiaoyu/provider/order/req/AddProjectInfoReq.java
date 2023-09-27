package com.xiaoyu.provider.order.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddProjectInfoReq", description = "添加团购项目详情请求接口请求入参")
public class AddProjectInfoReq extends BaseReqBean {
    private static final long serialVersionUID = -7616953252294074410L;

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

    @ApiModelProperty(value = "团购项目附件信息", name = "body")
    private List<AddProjectEnclosureInfo> body;

}
