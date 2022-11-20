package com.xiaoyu.provider.system.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectLoginInterListReq", description = "获取所有登录放行请求接口请求入参")
public class DeleteLoginInterByIdReq extends BaseReqBean {
    private static final long serialVersionUID = 255152357712859790L;

    @ApiModelProperty(value = "主键", name = "zj" ,required = true)
    @NotNull(message = "主键不能为空")
    private Long zj;

}
