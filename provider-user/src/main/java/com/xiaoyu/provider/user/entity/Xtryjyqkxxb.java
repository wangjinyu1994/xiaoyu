/*
* 生成时间： 2022-10-15 16:38:53
* 生成人：WJY
*/
package com.xiaoyu.provider.user.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "Xtryjyqkxxb", description = "系统人员教育情况信息表")
public class Xtryjyqkxxb implements Serializable {
    private static final long serialVersionUID = -5470707065526475622L;
    @ApiModelProperty(value = "主键", name="zj")
    private Long zj;

    @ApiModelProperty(value = "系统人员主键", name="xtryzj")
    private Long xtryzj;

    @ApiModelProperty(value = "学历（数据字典表主键）", name="xl")
    private Long xl;

    @ApiModelProperty(value = "是否毕业（1 未毕业 2 已毕业）", name="sfby")
    private String sfby;

    @ApiModelProperty(value = "专业", name="zy")
    private String zy;

    @ApiModelProperty(value = "学校名称", name="xxmc")
    private String xxmc;

    @ApiModelProperty(value = "学校地址", name="xxdz")
    private String xxdz;

    @ApiModelProperty(value = "入学时间", name="rxsj")
    private Date rxsj;

    @ApiModelProperty(value = "毕业时间", name="bysj")
    private Date bysj;

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