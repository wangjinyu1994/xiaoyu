/*
* 生成时间： 2022-10-15 16:39:33
* 生成人：WJY
*/
package com.xiaoyu.provider.user.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "Xtsjzdxxb", description = "系统数据字典信息表")
public class Xtsjzdxxb implements Serializable {
    private static final long serialVersionUID = -8839519866454505361L;
    @ApiModelProperty(value = "主键", name="zj")
    private Long zj;

    @ApiModelProperty(value = "父类主键", name="flzj")
    private Long flzj;

    @ApiModelProperty(value = "字典类型主键", name="zdlxzj")
    private Long zdlxzj;

    @ApiModelProperty(value = "字典名称", name="zdmc")
    private String zdmc;

    @ApiModelProperty(value = "字典等级", name="zddj")
    private String zddj;

    @ApiModelProperty(value = "字典说明", name="zdsm")
    private String zdsm;

    @ApiModelProperty(value = "字典代码", name="zddm")
    private String zddm;

    @ApiModelProperty(value = "排序（数字越大越考前）", name="px")
    private Integer px;

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