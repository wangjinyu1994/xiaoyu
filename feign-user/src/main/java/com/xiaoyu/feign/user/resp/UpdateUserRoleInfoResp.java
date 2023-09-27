package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "UpdateUserRoleInfoResp", description = "修改人员角色请求接口返回实体类")
public class UpdateUserRoleInfoResp extends BaseRespBean {
    private static final long serialVersionUID = 3471432881924999760L;
}
