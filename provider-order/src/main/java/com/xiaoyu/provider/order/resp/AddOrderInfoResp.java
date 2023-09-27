package com.xiaoyu.provider.order.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddOrderInfoResp", description = "添加订单详情请求接口返回实体类")
public class AddOrderInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -5766271088207784214L;
}
