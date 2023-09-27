package com.xiaoyu.provider.order.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectProjectByIdReq", description = "根据主键查询团购项目请求接口请求入参")
public class SelectProjectByIdReq extends BaseReqBean {
    private static final long serialVersionUID = -2805631442957299227L;
}
