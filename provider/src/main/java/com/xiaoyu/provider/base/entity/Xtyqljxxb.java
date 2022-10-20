/*
* 生成时间： 2022-10-15 16:41:17
* 生成人：WJY
*/
package com.xiaoyu.provider.base.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
@ApiModel(value = "Xtyqljxxb", description = "系统友情链接信息表")
public class Xtyqljxxb implements Serializable {
    private static final long serialVersionUID = -3805906387702493500L;
    @ApiModelProperty(value = "主键", name="zj")
    private Long zj;

    @ApiModelProperty(value = "友情链接名称", name="yqljmc")
    private String yqljmc;

    @ApiModelProperty(value = "友情链接地址", name="yqljdz")
    private String yqljdz;

    @ApiModelProperty(value = "友情链接图片地址", name="yqljtpdz")
    private String yqljtpdz;

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