package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectUserRoleByUserIdResp", description = "根据人员主键查询角色信息请求接口返回实体类")
public class SelectUserRoleByUserIdResp extends BaseRespBean {
    private static final long serialVersionUID = -8708555476566051742L;

    @ApiModelProperty(value = "主键", name = "zj" )
    private Long zj;

    @ApiModelProperty(value = "角色主键", name = "roleId" )
    private Long roleId;

    @ApiModelProperty(value = "人员主键", name = "userId" )
    private Long userId;

    @ApiModelProperty(value = "角色名称", name = "roleName" )
    private String roleName;

    @ApiModelProperty(value = "人员姓名", name = "userName" )
    private String userName;

}
