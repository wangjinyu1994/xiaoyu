package com.xiaoyu.provider.user.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * WJY
 */
@Data
@ApiModel(value = "Xxqqsjxxb", description = "腾讯qq手机信息表")
public class Xxqqsjxxb implements Serializable {
    private static final long serialVersionUID = 6999105259537742L;
    @ApiModelProperty(value = "主键", name="zj")
    private Long zj;

    @ApiModelProperty(value = "qq号码", name="qqhm")
    private String qqhm;

    @ApiModelProperty(value = "手机号码", name="sjhm")
    private String sjhm;

    @ApiModelProperty(value = "使用状态状态（1 使用 2 停用）", name="syzt")
    private String syzt;

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
