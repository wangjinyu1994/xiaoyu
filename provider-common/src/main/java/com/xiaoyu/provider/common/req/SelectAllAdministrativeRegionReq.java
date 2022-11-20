package com.xiaoyu.provider.common.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectAllAdministrativeRegionReq", description = "获取所有行政区域接口请求入参")
public class SelectAllAdministrativeRegionReq extends BaseReqBean {
    private static final long serialVersionUID = 8865293706748318317L;
}
