package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SysUserUpdatePasswordResp", description = "系统人员修改密码返回实体类")
public class SysUserUpdatePasswordResp extends BaseRespBean {
    private static final long serialVersionUID = -7178753423808963956L;
}
