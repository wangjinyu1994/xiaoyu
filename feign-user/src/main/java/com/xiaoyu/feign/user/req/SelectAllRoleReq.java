package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectAllRoleReq", description = "查询所有角色请求接口请求入参")
public class SelectAllRoleReq extends BaseReqBean {
}
