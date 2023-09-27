package com.xiaoyu.provider.order.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectOrderByIdResp", description = "根据主键查询订单请求接口返回实体类")
public class SelectOrderByIdResp extends BaseRespBean {
    private static final long serialVersionUID = 99627406560988662L;

    @ApiModelProperty(value = "主键", name = "zj")
    private Long zj;

    @ApiModelProperty(value = "流水号", name = "serialNumber")
    private String serialNumber;

    @ApiModelProperty(value = "系统人员姓名", name = "userName")
    private String userName;

    @ApiModelProperty(value = "机构主键", name = "orgId")
    private Long orgId;

    @ApiModelProperty(value = "机构名称", name = "orgName")
    private String orgName;

    @ApiModelProperty(value = "项目主键", name = "projectId")
    private Long projectId;

    @ApiModelProperty(value = "项目名称", name = "projectName")
    private String projectName;

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

    @ApiModelProperty(value = "审核人姓名", name = "examUserName")
    private String examName;

    @ApiModelProperty(value = "审核时间", name = "examDate")
    private String examDate;

    @ApiModelProperty(value = "收货地址", name = "address")
    private String address;

    @ApiModelProperty(value = "发货状态（1 未发货 2 派送中 3 派送结束）", name = "transportStatus")
    public String transportStatus;

    @ApiModelProperty(value = "签收状态（1 未签收 2 已签收）", name = "sigStatus")
    private String sigStatus;

    @ApiModelProperty(value = "签收时间", name = "sigDate")
    private String sigDate;

}
