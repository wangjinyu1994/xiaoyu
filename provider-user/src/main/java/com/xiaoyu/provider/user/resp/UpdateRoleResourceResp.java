package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "UpdateRoleResourceResp", description = "修改角色资源详情请求接口返回实体类")
public class UpdateRoleResourceResp extends BaseRespBean {
    private static final long serialVersionUID = -1617156556069902522L;
}
