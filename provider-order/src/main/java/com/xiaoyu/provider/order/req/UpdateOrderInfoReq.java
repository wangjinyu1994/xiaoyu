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
@ApiModel(value = "UpdateOrderInfoReq", description = "修改订单详情请求接口请求入参")
public class UpdateOrderInfoReq extends BaseReqBean {
    private static final long serialVersionUID = -1831589298131277941L;

    @ApiModelProperty(value = "主键", name = "zj",required = true)
    @NotNull(message = "主键不能为空")
    private Long zj;

    @ApiModelProperty(value = "收货地址", name = "address")
    private String address;

    @ApiModelProperty(value = "发货状态（1 未发货 2 派送中 3 派送结束）", name = "deliverStatus")
    public String deliverStatus;

    @ApiModelProperty(value = "签收状态（1 未签收 2 已签收）", name = "sigStatus")
    private String sigStatus;

    @ApiModelProperty(value = "签收时间", name = "sigDate")
    private String sigDate;

}
