/*
* 生成时间： 2022-10-15 16:31:30
* 生成人：WJY
*/
package com.xiaoyu.provider.user.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "Xtjctpxxb", description = "系统精彩图片信息表")
public class Xtjctpxxb implements Serializable {
    private static final long serialVersionUID = -7043913924441037803L;
    @ApiModelProperty(value = "主键", name="zj")
    private Long zj;

    @ApiModelProperty(value = "图片名称", name="tpmc")
    private String tpmc;

    @ApiModelProperty(value = "图片地址", name="tpdz")
    private String tpdz;

    @ApiModelProperty(value = "图片类型（数据字典表主键）", name="tplx")
    private Long tplx;

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