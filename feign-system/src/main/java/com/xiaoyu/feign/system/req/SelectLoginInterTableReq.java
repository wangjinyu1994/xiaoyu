package com.xiaoyu.feign.system.req;

import com.xiaoyu.common.base.req.BaseReqTableBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectLoginInterListReq", description = "获取所有登录放行请求接口请求入参")
public class SelectLoginInterTableReq extends BaseReqTableBean {
    private static final long serialVersionUID = 2402428425123041959L;
}
