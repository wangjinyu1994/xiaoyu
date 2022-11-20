package com.xiaoyu.provider.system.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectLoginInterListReq", description = "获取所有登录放行请求接口请求入参")
public class SelectLoginInterListReq extends BaseReqBean {
    private static final long serialVersionUID = 5086714071182189177L;
}
