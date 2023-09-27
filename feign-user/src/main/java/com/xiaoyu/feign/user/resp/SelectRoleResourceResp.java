package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectRoleResourceResp", description = "查看角色资源详情请求接口返回实体类")
public class SelectRoleResourceResp extends BaseRespBean {
    private static final long serialVersionUID = 8180016734421247556L;

    @ApiModelProperty(value = "主键", name = "zj" )
    private Long zj;

    @ApiModelProperty(value = "角色主键", name = "roleId" )
    private Long roleId;

    @ApiModelProperty(value = "资源主键", name = "resourceId" )
    private Long resourceId;

    @ApiModelProperty(value = "角色名", name = "roleName" )
    private String roleName;

    @ApiModelProperty(value = "资源名", name = "resourceName" )
    private String resourceName;
}
