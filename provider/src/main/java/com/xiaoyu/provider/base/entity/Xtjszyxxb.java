/*
* 生成时间： 2022-10-15 16:37:28
* 生成人：WJY
*/
package com.xiaoyu.provider.base.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
@ApiModel(value = "Xtjszyxxb", description = "系统角色资源信息表")
public class Xtjszyxxb implements Serializable {
    private static final long serialVersionUID = 6292481734272320726L;
    @ApiModelProperty(value = "主键", name="zj")
    private Long zj;

    @ApiModelProperty(value = "系统角色主键", name="xtjszj")
    private Long xtjszj;

    @ApiModelProperty(value = "系统资源主键", name="xtzyzj")
    private Long xtzyzj;

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