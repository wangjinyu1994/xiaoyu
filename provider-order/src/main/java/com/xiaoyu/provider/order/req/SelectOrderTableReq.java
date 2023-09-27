package com.xiaoyu.provider.order.req;

import com.xiaoyu.common.base.req.BaseReqTableBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectOrderTableReq", description = "分页查询订单请求接口请求入参")
public class SelectOrderTableReq extends BaseReqTableBean {
    private static final long serialVersionUID = 4358871372184579372L;

    @ApiModelProperty(value = "机构主键", name = "orgId")
    private Long orgId;

    @ApiModelProperty(value = "流水号", name = "serialNumber")
    private String serialNumber;

    @ApiModelProperty(value = "模糊查找名", name = "likeName")
    private String likeName;

}
