package com.xiaoyu.provider.system.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectLoginInterlistListResp", description = "获取所有登录放行请求接口返回实体类")
public class SelectLoginInterlistListResp extends BaseRespBean {

    private static final long serialVersionUID = 2481605432469182491L;
    @ApiModelProperty(value = "主键", name = "zj")
    private Long zj;

    @ApiModelProperty(value = "地址", name = "address")
    private String address;

    @ApiModelProperty(value = "服务名称", name = "serviceName")
    private String serviceName;

    @ApiModelProperty(value = "启用状态（1 使用 2 停用）", name = "status")
    private String status;

    @ApiModelProperty(value = "说明", name = "explain")
    private String explain;

    @ApiModelProperty(value = "添加时间", name = "addTime")
    private String addTime;

    @ApiModelProperty(value = "添加人", name = "addUser")
    private String addUser;

}
