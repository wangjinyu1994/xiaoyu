package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * WJY
 */
@Data
@ApiModel(value = "SysUserUpdatePasswordReq", description = "系统人员修改密码请求实体类")
public class SysUserUpdatePasswordReq extends BaseReqBean {
    private static final long serialVersionUID = -9151692608697532705L;

    @ApiModelProperty(value = "新密码", name = "newPassword", required = true)
    @NotBlank(message = "新设置的登录密码不能为空")
    private String newPassword;

}
