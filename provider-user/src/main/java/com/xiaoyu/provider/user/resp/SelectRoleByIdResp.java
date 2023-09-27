package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectRoleByIdResp", description = "根据主键查询角色请求接口返回实体类")
public class SelectRoleByIdResp extends BaseRespBean {

    @ApiModelProperty(value = "主键", name = "zj" )
    private Long zj;

    @ApiModelProperty(value = "所属机构主键", name = "orgId" )
    private Long orgId;

    @ApiModelProperty(value = "角色名称", name = "name" )
    private String name;

    @ApiModelProperty(value = "角色描述", name = "describe" )
    private String describe;

    @ApiModelProperty(value = "角色代码", name = "code" )
    private String code;

    @ApiModelProperty(value = "顺序", name = "sx" )
    private Integer sx;

}
