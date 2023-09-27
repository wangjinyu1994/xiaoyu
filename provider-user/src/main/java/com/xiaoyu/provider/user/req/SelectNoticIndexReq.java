package com.xiaoyu.provider.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectNoticIndexReq", description = "首页查询消息通知请求接口请求实体类")
public class SelectNoticIndexReq extends BaseReqBean {
    private static final long serialVersionUID = -7680855836799947535L;
}
