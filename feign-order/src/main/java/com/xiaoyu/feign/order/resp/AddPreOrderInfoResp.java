package com.xiaoyu.feign.order.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddPreOrderInfoResp", description = "添加预处理订单详情请求接口返回实体类")
public class AddPreOrderInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -1093558621702278380L;
}
