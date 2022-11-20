/*
* 生成时间： 2022-10-19 11:21:13
* 生成人：WJY
*/
package com.xiaoyu.provider.user.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "Xtjsxxb", description = "系统角色信息表")
public class Xtjsxxb implements Serializable {
    private static final long serialVersionUID = -7580675856063546229L;
    @ApiModelProperty(value = "主键", name="zj")
    private Long zj;

    @ApiModelProperty(value = "角色所属机构主键", name="jsssjgzj")
    private Long jsssjgzj;

    @ApiModelProperty(value = "角色名称", name="jsmc")
    private String jsmc;

    @ApiModelProperty(value = "角色描述", name="jsms")
    private String jsms;

    @ApiModelProperty(value = "角色代码", name="jsdm")
    private String jsdm;

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