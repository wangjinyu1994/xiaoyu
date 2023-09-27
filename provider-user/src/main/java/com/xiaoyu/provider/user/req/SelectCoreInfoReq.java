package com.xiaoyu.provider.user.req;

import com.xiaoyu.common.base.req.BaseReqTableBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectCoreInfoReq", description = "查询中心简介请求接口请求入参")
public class SelectCoreInfoReq extends BaseReqTableBean {
    private static final long serialVersionUID = 1683360240838866624L;
}
