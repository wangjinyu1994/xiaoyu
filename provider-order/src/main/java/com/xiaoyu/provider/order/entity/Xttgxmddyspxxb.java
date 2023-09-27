/*
* 生成时间： 2022-12-16 08:28:57
* 生成人：WJY
*/
package com.xiaoyu.provider.order.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
@ApiModel(value = "Xttgxmddyspxxb", description = "系统团购项目订单预审批信息表")
public class Xttgxmddyspxxb implements Serializable {
    private static final long serialVersionUID = -6634019375724512459L;
    @ApiModelProperty(value = "主键", name="zj")
    private Long zj;

    @ApiModelProperty(value = "系统人员主键", name="xtryzj")
    private Long xtryzj;

    @ApiModelProperty(value = "机构主键", name="jgzj")
    private Long jgzj;

    @ApiModelProperty(value = "团购项目主键", name="tgxmzj")
    private Long tgxmzj;

    @ApiModelProperty(value = "团购数量", name="tgsl")
    private Integer tgsl;

    @ApiModelProperty(value = "付款金额", name="fkje")
    private String fkje;

    @ApiModelProperty(value = "付款方式（1 支付宝 2 微信 3 银联）", name="fkfs")
    private String fkfs;

    @ApiModelProperty(value = "付款状态（1 未付款 2 已付款）", name="fkzt")
    private String fkzt;

    @ApiModelProperty(value = "流水号", name="lsh")
    private String lsh;

    @ApiModelProperty(value = "审核状态（1 审核中 2 审核通过 3 审核驳回）", name="shzt")
    private String shzt;

    @ApiModelProperty(value = "审核人主键", name="shrzj")
    private Long shrzj;

    @ApiModelProperty(value = "审核时间", name="shsj")
    private Date shsj;

    @ApiModelProperty(value = "收货地址", name="shdz")
    private String shdz;

    @ApiModelProperty(value = "驳回原因", name="bhyy")
    private String bhyy;

    @ApiModelProperty(value = "创建人主键", name="cjrzj")
    private Long cjrzj;

    @ApiModelProperty(value = "创建时间", name="cjsj")
    private Date cjsj;

    @ApiModelProperty(value = "修改时间", name="xgsj")
    private Date xgsj;

    @ApiModelProperty(value = "修改人主键", name="xgrzj")
    private Long xgrzj;

    @ApiModelProperty(value = "是否删除，0逻辑删除、1未删除、2物理删除", name="scbz")
    private String scbz;

    @ApiModelProperty(value = "备注", name="bz")
    private String bz;

}