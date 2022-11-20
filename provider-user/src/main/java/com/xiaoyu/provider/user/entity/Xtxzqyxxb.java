/*
* 生成时间： 2022-10-15 16:41:06
* 生成人：WJY
*/
package com.xiaoyu.provider.user.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "Xtxzqyxxb", description = "系统行政区域信息表")
public class Xtxzqyxxb implements Serializable {
    private static final long serialVersionUID = -2060025556103326564L;
    @ApiModelProperty(value = "主键", name="zj")
    private Long zj;

    @ApiModelProperty(value = "行政区域名称", name="xzqymc")
    private Long xzqymc;

    @ApiModelProperty(value = "行政区域简称", name="xzqyjc")
    private String xzqyjc;

    @ApiModelProperty(value = "行政区域代码", name="xzqydm")
    private String xzqydm;

    @ApiModelProperty(value = "父级行政区域代码", name="fjxzqydm")
    private String fjxzqydm;

    @ApiModelProperty(value = "行政级别(1省-自治区-直辖市、2地级市、3市辖区-县-县级市、4乡-镇-街道)", name="xzqylx")
    private String xzqylx;

    @ApiModelProperty(value = "区域经度", name="xzqyszjd")
    private String xzqyszjd;

    @ApiModelProperty(value = "区域纬度", name="xzqyszwd")
    private String xzqyszwd;

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