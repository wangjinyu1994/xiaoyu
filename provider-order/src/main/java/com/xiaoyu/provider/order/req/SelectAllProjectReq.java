package com.xiaoyu.provider.order.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectAllProjectReq", description = "查询全部团购项目请求接口请求入参")
public class SelectAllProjectReq extends BaseReqBean {
    private static final long serialVersionUID = -4836624776985091383L;
}
