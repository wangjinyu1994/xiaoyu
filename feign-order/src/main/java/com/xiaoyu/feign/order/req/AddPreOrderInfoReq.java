package com.xiaoyu.feign.order.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddPreOrderInfoReq", description = "添加预处理订单详情请求接口请求入参")
public class AddPreOrderInfoReq extends BaseReqBean {
    private static final long serialVersionUID = -2055101171420669692L;

    @ApiModelProperty(value = "流水号", name = "serialNumber")
    private String serialNumber;

    @ApiModelProperty(value = "机构主键", name = "orgId")
    private Long orgId;

    @ApiModelProperty(value = "项目主键", name = "projectId")
    private Long projectId;

    @ApiModelProperty(value = "数量", name = "number")
    private Integer number;

    @ApiModelProperty(value = "金额", name = "money")
    private String money;

    @ApiModelProperty(value = "支付方式（1 支付宝 2 微信 3 银联）", name = "payMethod")
    private String payMethod;

    @ApiModelProperty(value = "付款状态（1 未付款 2 已付款）", name = "payStatus")
    private String payStatus;

    @ApiModelProperty(value = "收货地址", name = "address")
    private String address;

}
