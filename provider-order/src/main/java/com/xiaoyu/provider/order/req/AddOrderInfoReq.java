package com.xiaoyu.provider.order.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddOrderInfoReq", description = "添加订单详情请求接口请求入参")
public class AddOrderInfoReq extends BaseReqBean {
    private static final long serialVersionUID = -9173841498678608834L;

    @ApiModelProperty(value = "流水号", name = "serialNumber")
    private String serialNumber;

    @ApiModelProperty(value = "系统人员主键", name = "userId")
    private Long userId;

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

    @ApiModelProperty(value = "审核状态（1 审核中 2 审核通过 3 审核驳回）", name = "examStatus")
    private String examStatus;

    @ApiModelProperty(value = "审核人主键", name = "examUserId")
    private Long examUserId;

    @ApiModelProperty(value = "审核时间", name = "examDate")
    private String examDate;

    @ApiModelProperty(value = "收货地址", name = "address")
    private String address;

    @ApiModelProperty(value = "发货状态（1 未发货 2 派送中 3 派送结束）", name = "deliverStatus")
    public String deliverStatus;

    @ApiModelProperty(value = "签收状态（1 未签收 2 已签收）", name = "sigStatus")
    private String sigStatus;

    @ApiModelProperty(value = "签收时间", name = "sigDate")
    private String sigDate;

}
