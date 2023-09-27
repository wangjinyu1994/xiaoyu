package com.xiaoyu.feign.system.req;

import com.xiaoyu.common.base.req.BaseReqTableBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectBlacklistTableReq", description = "获取所有黑名单请求接口分页请求入参")
public class SelectBlacklistTableReq extends BaseReqTableBean {
    private static final long serialVersionUID = -6602712087156686596L;
}
