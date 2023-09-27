package com.xiaoyu.feign.order.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "UpdateOrderInfoResp", description = "修改订单详情请求接口返回实体类")
public class UpdateOrderInfoResp extends BaseRespBean {
    private static final long serialVersionUID = 7268706285787679476L;
}
