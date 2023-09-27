package com.xiaoyu.feign.order.req;

import com.xiaoyu.common.base.req.BaseReqTableBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectProjectTableReq", description = "分页查询团购项目请求接口请求入参")
public class SelectProjectTableReq extends BaseReqTableBean {
    private static final long serialVersionUID = -5979103404624855925L;
}
