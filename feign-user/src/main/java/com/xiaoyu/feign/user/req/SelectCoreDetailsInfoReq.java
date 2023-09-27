package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectCoreDetailsInfoReq", description = "查询中心简介详情请求接口请求入参")
public class SelectCoreDetailsInfoReq extends BaseReqBean {
    private static final long serialVersionUID = -7584728899326202425L;

    @ApiModelProperty(value = "主键", name = "zj")
    @NotNull(message = "主键不能为空")
    private Long zj;
}
