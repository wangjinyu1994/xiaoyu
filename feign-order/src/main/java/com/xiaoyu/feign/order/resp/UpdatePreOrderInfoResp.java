package com.xiaoyu.feign.order.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "UpdatePreOrderInfoResp", description = "修改预处理订单详情请求接口返回实体类")
public class UpdatePreOrderInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -418955509386507034L;
}
