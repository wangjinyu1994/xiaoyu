package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddRoleResourceResp", description = "添加角色资源详情请求接口返回实体类")
public class AddRoleResourceResp extends BaseRespBean {
    private static final long serialVersionUID = 9104313018514376951L;
}
