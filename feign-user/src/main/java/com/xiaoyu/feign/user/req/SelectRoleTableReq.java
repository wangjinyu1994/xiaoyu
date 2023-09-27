package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqTableBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectRoleTableReq", description = "分页查询角色请求接口请求入参")
public class SelectRoleTableReq extends BaseReqTableBean {
}
