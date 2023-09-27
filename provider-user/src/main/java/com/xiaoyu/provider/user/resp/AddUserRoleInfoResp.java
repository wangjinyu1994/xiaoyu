package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddUserRoleInfoResp", description = "添加人员角色请求接口返回实体类")
public class AddUserRoleInfoResp extends BaseRespBean {
    private static final long serialVersionUID = 1199032611308949583L;
}
