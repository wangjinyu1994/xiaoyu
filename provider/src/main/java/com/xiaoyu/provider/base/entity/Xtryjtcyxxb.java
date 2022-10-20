/*
* 生成时间： 2022-10-15 16:38:42
* 生成人：WJY
*/
package com.xiaoyu.provider.base.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
@ApiModel(value = "Xtryjtcyxxb", description = "系统人员家庭成员信息表")
public class Xtryjtcyxxb implements Serializable {
    private static final long serialVersionUID = -8039114169978441885L;
    @ApiModelProperty(value = "主键", name="zj")
    private Long zj;

    @ApiModelProperty(value = "系统人员主键", name="xtryzj")
    private Long xtryzj;

    @ApiModelProperty(value = "人员类型（数据字典表主键）", name="rylx")
    private Long rylx;

    @ApiModelProperty(value = "人员姓名", name="ryxm")
    private String ryxm;

    @ApiModelProperty(value = "人员职业", name="ryzy")
    private String ryzy;

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