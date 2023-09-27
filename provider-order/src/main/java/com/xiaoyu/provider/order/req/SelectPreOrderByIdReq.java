package com.xiaoyu.provider.order.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectPreOrderByIdReq", description = "根据主键查询预处理订单请求接口请求入参")
public class SelectPreOrderByIdReq extends BaseReqBean {
    private static final long serialVersionUID = -5013048880532871941L;

    @ApiModelProperty(value = "主键", name = "zj",required = true)
    @NotNull(message = "主键不能为空")
    private Long zj;

}
