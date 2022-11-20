/*
* 生成时间： 2022-10-15 16:39:48
* 生成人：WJY
*/
package com.xiaoyu.provider.user.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "Xttgxmddxxb", description = "系统团购项目订单信息表")
public class Xttgxmddxxb implements Serializable {
    private static final long serialVersionUID = 6781925370553198373L;
    @ApiModelProperty(value = "主键", name="zj")
    private Long zj;

    @ApiModelProperty(value = "系统人员主键", name="xtryzj")
    private Long xtryzj;

    @ApiModelProperty(value = "团购项目主键", name="tgxmzj")
    private Long tgxmzj;

    @ApiModelProperty(value = "团购数量", name="tgsl")
    private Integer tgsl;

    @ApiModelProperty(value = "付款金额", name="fkje")
    private String fkje;

    @ApiModelProperty(value = "付款方式（数据字典表主键）", name="fkfs")
    private Long fkfs;

    @ApiModelProperty(value = "付款状态（数据字典表主键）", name="fkzt")
    private Long fkzt;

    @ApiModelProperty(value = "发货状态（数据字典表主键）", name="fhzt")
    private Long fhzt;

    @ApiModelProperty(value = "签收状态（数据字典表主键）", name="qszt")
    private Long qszt;

    @ApiModelProperty(value = "收货地址", name="shdz")
    private String shdz;

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