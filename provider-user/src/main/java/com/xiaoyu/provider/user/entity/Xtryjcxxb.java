/*
* 生成时间： 2022-10-15 16:38:03
* 生成人：WJY
*/
package com.xiaoyu.provider.user.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "Xtryjcxxb", description = "系统人员基础信息表")
public class Xtryjcxxb implements Serializable {
    private static final long serialVersionUID = -7763975110088896214L;
    @ApiModelProperty(value = "主键", name="zj")
    private Long zj;

    @ApiModelProperty(value = "系统人员主键", name="xtryzj")
    private Long xtryzj;

    @ApiModelProperty(value = "姓名", name="xm")
    private String xm;

    @ApiModelProperty(value = "婚姻状况（1 未婚 2 已婚）", name="hyzk")
    private String hyzk;

    @ApiModelProperty(value = "最高学历（数据字典表主键）", name="zgxl")
    private Long zgxl;

    @ApiModelProperty(value = "政治面貌（数据字典表主键）", name="zzmm")
    private Long zzmm;

    @ApiModelProperty(value = "身份证号", name="sfzh")
    private String sfzh;

    @ApiModelProperty(value = "手机号", name="sjh")
    private String sjh;

    @ApiModelProperty(value = "邮箱", name="yx")
    private String yx;

    @ApiModelProperty(value = "职业（数据字典表主键）", name="zy")
    private Long zy;

    @ApiModelProperty(value = "人员所在省份编码", name="ryszsfbm")
    private String ryszsfbm;

    @ApiModelProperty(value = "人员所在城市编码", name="ryszcsbm")
    private String ryszcsbm;

    @ApiModelProperty(value = "人员所在区域编码", name="ryszqybm")
    private String ryszqybm;

    @ApiModelProperty(value = "当前公司", name="dqgs")
    private String dqgs;

    @ApiModelProperty(value = "公司地址", name="gsdz")
    private String gsdz;

    @ApiModelProperty(value = "居住地址", name="jzdz")
    private String jzdz;

    @ApiModelProperty(value = "身份证地址", name="sfzdz")
    private String sfzdz;

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