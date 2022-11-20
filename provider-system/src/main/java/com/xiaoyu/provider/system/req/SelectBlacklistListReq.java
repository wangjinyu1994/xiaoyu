package com.xiaoyu.provider.system.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectBlacklistListReq", description = "获取所有黑名单请求接口请求入参")
public class SelectBlacklistListReq extends BaseReqBean {
    private static final long serialVersionUID = -2075579222867417887L;
}
