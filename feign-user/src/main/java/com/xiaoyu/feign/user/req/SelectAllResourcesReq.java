package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectAllResourcesReq", description = "查询所有资源请求接口请求实体类")
public class SelectAllResourcesReq extends BaseReqBean {
    private static final long serialVersionUID = 3699100436607850939L;
}
