package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "DeleteRoleInfoResp", description = "删除角色详情请求接口返回实体类")
public class DeleteRoleInfoResp extends BaseRespBean {
}
