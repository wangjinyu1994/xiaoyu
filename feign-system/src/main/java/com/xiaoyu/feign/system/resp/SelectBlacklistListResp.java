package com.xiaoyu.feign.system.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectBlacklistListResp", description = "获取所有黑名单请求接口返回实体类")
public class SelectBlacklistListResp extends BaseRespBean {
    private static final long serialVersionUID = 6864321571395955183L;

    @ApiModelProperty(value = "主键", name = "zj")
    private Long zj;

    @ApiModelProperty(value = "类型（类型1 黑名单 2 白名单）", name = "zj")
    private String type;

    @ApiModelProperty(value = "ip地址", name = "address")
    private String address;

    @ApiModelProperty(value = "启用状态（1 使用 2 停用）", name = "status")
    private String status;

    @ApiModelProperty(value = "添加时间", name = "addTime")
    private String addTime;

    @ApiModelProperty(value = "添加人", name = "addUser")
    private String addUser;

}
