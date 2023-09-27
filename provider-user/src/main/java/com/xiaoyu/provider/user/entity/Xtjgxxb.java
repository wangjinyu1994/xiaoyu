/*
* 生成时间： 2022-10-19 11:15:02
* 生成人：WJY
*/
package com.xiaoyu.provider.user.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "Xtjgxxb", description = "系统机构信息表")
public class Xtjgxxb implements Serializable {
    private static final long serialVersionUID = 8329488895352903731L;
    @ApiModelProperty(value = "主键", name="zj")
    private Long zj;

    @ApiModelProperty(value = "机构名称", name="jgmc")
    private String jgmc;

    @ApiModelProperty(value = "机构全称", name="jgqc")
    private String jgqc;

    @ApiModelProperty(value = "机构地址", name="jgdz")
    private String jgdz;

    @ApiModelProperty(value = "机构编码", name="jgbm")
    private String jgbm;

    @ApiModelProperty(value = "上级机构主键", name="sjjgzj")
    private Long sjjgzj;

    @ApiModelProperty(value = "机构级别（1 总部 2 分部 3 支部）", name="jgjb")
    private String jgjb;

    @ApiModelProperty(value = "排序（数字越大越考前）", name="px")
    private Integer px;

    @ApiModelProperty(value = "机构简介", name="jgjj")
    private String jgjj;

    @ApiModelProperty(value = "机构图片", name="jgtp")
    private String jgtp;

    @ApiModelProperty(value = "机构所在省份编码", name="jgszsfbm")
    private String jgszsfbm;

    @ApiModelProperty(value = "机构所在城市编码", name="jgszcsbm")
    private String jgszcsbm;

    @ApiModelProperty(value = "机构所在区域编码", name="jgszqybm")
    private String jgszqybm;

    @ApiModelProperty(value = "机构所在经度", name="jgszjd")
    private String jgszjd;

    @ApiModelProperty(value = "机构所在纬度", name="jgszwd")
    private String jgszwd;

    @ApiModelProperty(value = "机构电话", name="jgdh")
    private String jgdh;

    @ApiModelProperty(value = "机构邮箱", name="jgyx")
    private String jgyx;

    @ApiModelProperty(value = "机构传真", name="jgcz")
    private String jgcz;

    @ApiModelProperty(value = "机构负责人姓名", name="jgfzrxm")
    private String jgfzrxm;

    @ApiModelProperty(value = "机构负责人电话", name="jgfzrdh")
    private String jgfzrdh;

    @ApiModelProperty(value = "机构联系人姓名", name="jglxrxm")
    private String jglxrxm;

    @ApiModelProperty(value = "机构联系人电话", name="jglxrdh")
    private String jglxrdh;

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