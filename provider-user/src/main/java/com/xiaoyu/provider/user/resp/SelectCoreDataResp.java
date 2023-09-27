package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectCoreDataResp", description = "查询中心简介请求接口返回实体类")
public class SelectCoreDataResp extends BaseRespBean {
    private static final long serialVersionUID = 328666008233610372L;

    @ApiModelProperty(value = "主键", name = "zj")
    private Long zj;

    @ApiModelProperty(value = "名称", name = "name")
    private String name;

    @ApiModelProperty(value = "电话", name = "phone")
    private String phone;

    @ApiModelProperty(value = "地址", name = "address")
    private String address;

    @ApiModelProperty(value = "qq地址", name = "qq")
    private String qq;

    @ApiModelProperty(value = "vx地址", name = "vx")
    private String vx;

    @ApiModelProperty(value = "中心简介内容", name = "data")
    private SelectCoreInfoResp data;
}
