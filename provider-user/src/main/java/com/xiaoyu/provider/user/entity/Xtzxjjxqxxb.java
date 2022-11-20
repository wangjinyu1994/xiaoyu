/*
* 生成时间： 2022-10-15 16:41:30
* 生成人：WJY
*/
package com.xiaoyu.provider.user.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "Xtzxjjxqxxb", description = "系统中心简介详情信息表")
public class Xtzxjjxqxxb implements Serializable {
    private static final long serialVersionUID = -4595601363359142222L;
    @ApiModelProperty(value = "主键", name="zj")
    private Long zj;

    @ApiModelProperty(value = "中心简介主键", name="zxjjzj")
    private Long zxjjzj;

    @ApiModelProperty(value = "标题", name="bt")
    private String bt;

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

    @ApiModelProperty(value = "内容", name="nr")
    private String nr;

    @ApiModelProperty(value = "备注", name="bz")
    private String bz;

}