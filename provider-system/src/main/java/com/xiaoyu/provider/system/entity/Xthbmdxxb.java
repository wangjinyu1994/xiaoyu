/*
* 生成时间： 2022-11-16 16:41:20
* 生成人：WJY
*/
package com.xiaoyu.provider.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "Xthbmdxxb", description = "系统黑白名单信息表")
public class Xthbmdxxb implements Serializable {
    private static final long serialVersionUID = 6473948557639612173L;
    @ApiModelProperty(value = "主键", name="zj")
    private Long zj;

    @ApiModelProperty(value = "类型（1 黑名单 2 白名单）", name="lx")
    private String lx;

    @ApiModelProperty(value = "ip地址", name="dz")
    private String dz;

    @ApiModelProperty(value = "启用状态（1 使用 2 停用）", name="qyzt")
    private String qyzt;

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

    @ApiModelProperty(value = "说明", name="sm")
    private String sm;

    @ApiModelProperty(value = "备注", name="bz")
    private String bz;

}