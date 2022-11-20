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
@ApiModel(value = "SysUserInitPasswordReq", description = "系统人员初始化密码请求接口")
public class SysUserInitPasswordReq extends BaseReqBean {

    private static final long serialVersionUID = 3993493825010176163L;
    @ApiModelProperty(value = "初始化人员主键", name = "userId", required = true)
    @NotBlank(message = "初始化人员主键不能为空")
    private Long userId;

}
