/*
* 生成时间： 2022-10-15 16:48:50
* 生成人：WJY
*/
package com.xiaoyu.provider.user.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "Xttgxmfjxxb", description = "系统团购项目附件信息表")
public class Xttgxmfjxxb implements Serializable {
    private static final long serialVersionUID = -4947090893847752222L;
    @ApiModelProperty(value = "主键", name="zj")
    private Long zj;

    @ApiModelProperty(value = "团购项目表主键", name="tgxmbzj")
    private Long tgxmbzj;

    @ApiModelProperty(value = "附件标题", name="fjbt")
    private String fjbt;

    @ApiModelProperty(value = "附件大小", name="fjdx")
    private String fjdx;

    @ApiModelProperty(value = "附件地址", name="fjdz")
    private String fjdz;

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