/*
* 生成时间： 2022-10-15 16:40:55
* 生成人：WJY
*/
package com.xiaoyu.provider.user.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "Xtxxtzxxb", description = "系统消息通知信息表")
public class Xtxxtzxxb implements Serializable {
    private static final long serialVersionUID = 8881743730876321664L;
    @ApiModelProperty(value = "主键", name="zj")
    private Long zj;

    @ApiModelProperty(value = "消息类型（数据字典表主键）", name="xxlx")
    private Long xxlx;

    @ApiModelProperty(value = "标题", name="bt")
    private String bt;

    @ApiModelProperty(value = "摘要", name="zy")
    private String zy;

    @ApiModelProperty(value = "发布机构名称", name="fbjgmc")
    private String fbjgmc;

    @ApiModelProperty(value = "发布机构主键", name="fbjgzj")
    private Long fbjgzj;

    @ApiModelProperty(value = "来源", name="ly")
    private String ly;

    @ApiModelProperty(value = "访问量", name="fwl")
    private String fwl;

    @ApiModelProperty(value = "发布时间", name="fbsj")
    private Date fbsj;

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

    @ApiModelProperty(value = "内容", name="nr")
    private String nr;

    @ApiModelProperty(value = "备注", name="bz")
    private String bz;

}