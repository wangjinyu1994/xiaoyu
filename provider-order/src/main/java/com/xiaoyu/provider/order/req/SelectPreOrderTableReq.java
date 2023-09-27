package com.xiaoyu.provider.order.req;

import com.xiaoyu.common.base.req.BaseReqTableBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectPreOrderTableReq", description = "分页查询预处理订单请求接口请求入参")
public class SelectPreOrderTableReq extends BaseReqTableBean {
    private static final long serialVersionUID = -3043719286864640928L;

    @ApiModelProperty(value = "机构主键", name = "orgId")
    private Long orgId;

    @ApiModelProperty(value = "流水号", name = "serialNumber")
    private String serialNumber;

    @ApiModelProperty(value = "模糊查找名", name = "likeName")
    private String likeName;

}
