package com.xiaoyu.gateway.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * WJY
 */
@Data
@ApiModel(value = "LoginUserInfo", description = "登录人员的基本信息")
public class LoginUserInfo implements Serializable {
    private static final long serialVersionUID = -2858488512445215415L;

    @ApiModelProperty(value = "登录的用户表主键", name = "userId")
    private String userId;

    @ApiModelProperty(value = "登录的用户姓名", name = "userName")
    private String userName;

    @ApiModelProperty(value = "登录的用户类型（1 管理员 2 用户）", name = "userType")
    private String userType;

}
