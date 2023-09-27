package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "DeleteRoleResourceResp", description = "删除角色资源详情请求接口返回实体类")
public class DeleteRoleResourceResp extends BaseRespBean {
    private static final long serialVersionUID = -6825847939235107494L;
}
