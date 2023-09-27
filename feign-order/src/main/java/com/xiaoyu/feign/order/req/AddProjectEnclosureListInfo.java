package com.xiaoyu.feign.order.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddProjectEnclosureListInfo", description = "添加团购项目附件请求接口请求入参")
public class AddProjectEnclosureListInfo extends BaseReqBean {
    private static final long serialVersionUID = -2920841521682239408L;

    @ApiModelProperty(value = "团购项目附件", name = "body")
    private List<AddProjectEnclosureInfoReq> body;

}
