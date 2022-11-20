/*
* 生成时间： 2022-10-15 16:41:41
* 生成人：WJY
*/
package com.xiaoyu.provider.user.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "Xtzxjjxxb", description = "系统中心简介信息表")
public class Xtzxjjxxb implements Serializable {
    private static final long serialVersionUID = -4251830211453619274L;
    @ApiModelProperty(value = "主键", name="zj")
    private Long zj;

    @ApiModelProperty(value = "名称", name="mc")
    private String mc;

    @ApiModelProperty(value = "电话", name="dh")
    private String dh;

    @ApiModelProperty(value = "地址", name="dz")
    private String dz;

    @ApiModelProperty(value = "QQ地址", name="qqdz")
    private String qqdz;

    @ApiModelProperty(value = "VX地址", name="wxdz")
    private String wxdz;

    @ApiModelProperty(value = "机构主键", name="jgzj")
    private Long jgzj;

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