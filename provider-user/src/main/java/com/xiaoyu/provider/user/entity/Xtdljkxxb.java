/*
* 生成时间： 2022-11-17 10:37:03
* 生成人：WJY
*/
package com.xiaoyu.provider.user.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
@ApiModel(value = "Xtdljkxxb", description = "系统登录接口信息表")
public class Xtdljkxxb implements Serializable {
    private static final long serialVersionUID = -9087759861329247987L;
    @ApiModelProperty(value = "主键", name="zj")
    private Long zj;

    @ApiModelProperty(value = "服务名称", name="fwmc")
    private String fwmc;

    @ApiModelProperty(value = "接口名称", name="jkmc")
    private String jkmc;

    @ApiModelProperty(value = "接口状态（1 使用 2 停用）", name="jkzt")
    private String jkzt;

    @ApiModelProperty(value = "说明", name="sm")
    private String sm;

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