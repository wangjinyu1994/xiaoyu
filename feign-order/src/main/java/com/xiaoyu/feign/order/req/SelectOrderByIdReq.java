package com.xiaoyu.feign.order.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectOrderByIdReq", description = "根据主键查询订单请求接口请求入参")
public class SelectOrderByIdReq extends BaseReqBean {
    private static final long serialVersionUID = -126844038437249063L;
}
