package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqTableBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectResourcesTableReq", description = "分页查询资源请求接口请求实体类")
public class SelectResourcesTableReq extends BaseReqTableBean {
    private static final long serialVersionUID = -8929256543531608603L;
}
