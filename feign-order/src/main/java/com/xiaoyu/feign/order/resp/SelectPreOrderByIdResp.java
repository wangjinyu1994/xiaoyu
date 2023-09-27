package com.xiaoyu.feign.order.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectPreOrderByIdResp", description = "根据主键查询预处理订单请求接口返回实体类")
public class SelectPreOrderByIdResp extends BaseRespBean {
    private static final long serialVersionUID = 2209008581147699319L;

    @ApiModelProperty(value = "主键", name = "zj")
    private Long zj;

    @ApiModelProperty(value = "流水号", name = "serialNumber")
    private String serialNumber;

    @ApiModelProperty(value = "机构主键", name = "orgId")
    private Long orgId;

    @ApiModelProperty(value = "机构名称", name = "orgName")
    private String orgName;

    @ApiModelProperty(value = "用户姓名", name = "userName")
    private String userName;

    @ApiModelProperty(value = "审核人姓名", name = "examName")
    private String examName;

    @ApiModelProperty(value = "项目主键", name = "projectId")
    private Long projectId;

    @ApiModelProperty(value = "项目主键", name = "projectName")
    private String projectName;

    @ApiModelProperty(value = "数量", name = "number")
    private String number;

    @ApiModelProperty(value = "金额", name = "money")
    private String money;

    @ApiModelProperty(value = "支付方式（1 支付宝 2 微信 3 银联）", name = "payMethod")
    private String payMethod;

    @ApiModelProperty(value = "付款状态（1 未付款 2 已付款）", name = "payStatus")
    private String payStatus;

    @ApiModelProperty(value = "审核状态（1 审核中 2 审核通过 3 审核驳回）", name = "examStatus")
    private String examStatus;

    @ApiModelProperty(value = "审核时间", name = "examDate")
    private String examDate;

    @ApiModelProperty(value = "驳回原因", name = "reason")
    private String reason;

    @ApiModelProperty(value = "收货地址", name = "receiptAddress")
    private String address;

}
