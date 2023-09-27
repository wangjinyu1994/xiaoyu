/*
* 生成时间： 2022-10-15 16:48:37
* 生成人：WJY
*/
package com.xiaoyu.provider.order.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "Xttgxmxxb", description = "系统团购项目信息表")
public class Xttgxmxxb implements Serializable {
    private static final long serialVersionUID = -1617906694354836591L;
    @ApiModelProperty(value = "主键", name="zj")
    private Long zj;

    @ApiModelProperty(value = "项目名称", name="xmmc")
    private String xmmc;

    @ApiModelProperty(value = "摘要", name="zy")
    private String zy;

    @ApiModelProperty(value = "是否限购（1 限购 2 不限购）", name="sfxg")
    private String sfxg;

    @ApiModelProperty(value = "最大购买数量", name="zdgmsl")
    private String zdgmsl;

    @ApiModelProperty(value = "商品单价", name="spdj")
    private String spdj;

    @ApiModelProperty(value = "排序（数字越大越考前）", name="px")
    private Integer px;

    @ApiModelProperty(value = "当前状态（1 启用 2 停用）", name="dqzt")
    private String dqzt;

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

    @ApiModelProperty(value = "项目描述", name="xmms")
    private String xmms;

    @ApiModelProperty(value = "备注", name="bz")
    private String bz;


}