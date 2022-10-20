/*
* 生成时间： 2022-10-15 16:41:52
* 生成人：WJY
*/
package com.xiaoyu.provider.base.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
@ApiModel(value = "Xtzyxxb", description = "系统资源信息表")
public class Xtzyxxb implements Serializable {
    private static final long serialVersionUID = 3103703522710215329L;
    @ApiModelProperty(value = "主键", name="zj")
    private Long zj;

    @ApiModelProperty(value = "资源名称", name="zymc")
    private String zymc;

    @ApiModelProperty(value = "资源描述", name="zyms")
    private String zyms;

    @ApiModelProperty(value = "父级资源主键", name="fjzyzj")
    private Long fjzyzj;

    @ApiModelProperty(value = "父级资源唯一代码", name="fjzywydm")
    private String fjzywydm;

    @ApiModelProperty(value = "资源唯一代码", name="zywydm")
    private String zywydm;

    @ApiModelProperty(value = "资源渠道类型（1 PC 2 手机）", name="zyqdlx")
    private String zyqdlx;

    @ApiModelProperty(value = "资源类型，查询按钮 删除按钮等（数据字典表主键）", name="zylx")
    private Long zylx;

    @ApiModelProperty(value = "排序（数字越大越考前）", name="px")
    private Integer px;

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