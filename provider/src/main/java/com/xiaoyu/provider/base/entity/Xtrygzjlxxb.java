/*
* 生成时间： 2022-10-15 16:37:53
* 生成人：WJY
*/
package com.xiaoyu.provider.base.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
@ApiModel(value = "Xtrygzjlxxb", description = "系统人员工作经历信息表")
public class Xtrygzjlxxb implements Serializable {
    private static final long serialVersionUID = -1158863098028484628L;
    @ApiModelProperty(value = "主键", name="zj")
    private Long zj;

    @ApiModelProperty(value = "系统人员主键", name="xtryzj")
    private Long xtryzj;

    @ApiModelProperty(value = "公司类型（数据字典表主键）", name="gslx")
    private Long gslx;

    @ApiModelProperty(value = "是否在职（1 离职 2 在职）", name="sfzz")
    private String sfzz;

    @ApiModelProperty(value = "公司名称", name="gsmc")
    private String gsmc;

    @ApiModelProperty(value = "公司地址", name="gsdz")
    private String gsdz;

    @ApiModelProperty(value = "入职时间", name="rzsj")
    private Date rzsj;

    @ApiModelProperty(value = "离职时间", name="lzsj")
    private Date lzsj;

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