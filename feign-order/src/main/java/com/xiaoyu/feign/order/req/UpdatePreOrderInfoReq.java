package com.xiaoyu.feign.order.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * WJY
 */
@Data
@ApiModel(value = "UpdatePreOrderInfoReq", description = "修改预处理订单详情请求接口请求入参")
public class UpdatePreOrderInfoReq extends BaseReqBean {
    private static final long serialVersionUID = -829935538576153045L;

    @ApiModelProperty(value = "主键", name = "zj",required = true)
    @NotNull(message = "主键不能为空")
    private Long zj;

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

    @ApiModelProperty(value = "审核状态（1 审核中 2 审核通过 3 审核驳回）", name = "examStatus")
    private String examStatus;

    @ApiModelProperty(value = "驳回原因", name = "reject")
    private String reject;

    @ApiModelProperty(value = "收货地址", name = "address")
    private String address;

}
