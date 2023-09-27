package com.xiaoyu.provider.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectUserRoleByUserIdReq", description = "根据人员主键查询角色信息请求接口请求入参")
public class SelectUserRoleByUserIdReq extends BaseReqBean {
    private static final long serialVersionUID = 1913940741177935347L;

    @ApiModelProperty(value = "人员主键", name = "userId" ,required = true)
    @NotNull(message = "人员主键不能为空")
    private Long userId;

}
