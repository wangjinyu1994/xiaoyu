/*
* 生成时间： 2022-10-15 16:37:42
* 生成人：WJY
*/
package com.xiaoyu.provider.base.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
@ApiModel(value = "Xtryglxtxxb", description = "系统人员关联系统信息表")
public class Xtryglxtxxb implements Serializable {
    private static final long serialVersionUID = -4473015556037251571L;
    @ApiModelProperty(value = "主键", name="zj")
    private Long zj;

    @ApiModelProperty(value = "系统人员主键", name="xtryzj")
    private Long xtryzj;

    @ApiModelProperty(value = "系统类型（1 PC 2 公众号 3 小程序）", name="xtlx")
    private String xtlx;

    @ApiModelProperty(value = "最后一次登录时间", name="zhycdlsj")
    private Long zhycdlsj;

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