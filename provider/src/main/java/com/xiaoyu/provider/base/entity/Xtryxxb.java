/*
* 生成时间： 2022-10-15 16:39:10
* 生成人：WJY
*/
package com.xiaoyu.provider.base.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
@ApiModel(value = "Xtryxxb", description = "系统人员信息表")
public class Xtryxxb implements Serializable {
    private static final long serialVersionUID = -1030589731560489355L;
    @ApiModelProperty(value = "主键", name="zj")
    private Long zj;

    @ApiModelProperty(value = "人员昵称", name="rync")
    private String rync;

    @ApiModelProperty(value = "人员唯一代码", name="rywydm")
    private String rywydm;

    @ApiModelProperty(value = "人员编号", name="rybh")
    private String rybh;

    @ApiModelProperty(value = "人员登录账号", name="rydlzh")
    private String rydlzh;

    @ApiModelProperty(value = "人员登录密码", name="rydlmm")
    private String rydlmm;

    @ApiModelProperty(value = "人员类型（1 管理员 2 用户）", name="rylx")
    private String rylx;

    @ApiModelProperty(value = "人员性别（1 男 2 女 3 未知）", name="ryxb")
    private String ryxb;

    @ApiModelProperty(value = "人员头像", name="rytx")
    private String rytx;

    @ApiModelProperty(value = "人员生日", name="rysr")
    private Date rysr;

    @ApiModelProperty(value = "个性签名", name="gxqm")
    private String gxqm;

    @ApiModelProperty(value = "个人说明", name="grsm")
    private String grsm;

    @ApiModelProperty(value = "用户openId", name="ryopenid")
    private String ryopenid;

    @ApiModelProperty(value = "人员所在经度", name="ryszjd")
    private String ryszjd;

    @ApiModelProperty(value = "人员所在纬度", name="ryszwd")
    private String ryszwd;

    @ApiModelProperty(value = "人员血型（数据字典表主键）", name="ryxx")
    private Long ryxx;

    @ApiModelProperty(value = "排序（数字越大越考前）", name="px")
    private Integer px;

    @ApiModelProperty(value = "人员审核状态（1 审核中 2 审核通过 3 审核驳回）", name="ryshzt")
    private String ryshzt;

    @ApiModelProperty(value = "审核人主键", name="shrzj")
    private Long shrzj;

    @ApiModelProperty(value = "审核时间", name="shsj")
    private Long shsj;

    @ApiModelProperty(value = "人员是否登录过（1 未登录 2 已登录）", name="rysfdlg")
    private String rysfdlg;

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