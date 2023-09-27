package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "DeleteUserRoleInfoResp", description = "删除人员角色请求接口返回实体类")
public class DeleteUserRoleInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -1719076809103926693L;
}
