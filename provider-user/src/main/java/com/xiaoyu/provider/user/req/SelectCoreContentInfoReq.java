package com.xiaoyu.provider.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectCoreContentInfoResp", description = "查询中心简介内容请求接口请求入参")
public class SelectCoreContentInfoReq extends BaseReqBean {
    private static final long serialVersionUID = 5069636959798329890L;

    @ApiModelProperty(value = "主键", name = "zj")
    @NotNull(message = "主键不能为空")
    private Long zj;

}
