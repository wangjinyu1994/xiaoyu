package com.xiaoyu.feign.system.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddLoginInterListInfoReq", description = "批量添加登录放行请求接口请求入参")
public class AddLoginInterListInfoReq extends BaseReqBean {
    private static final long serialVersionUID = -2537447144147972227L;

    @ApiModelProperty(value = "登录放行接口", name = "body")
    private List<AddLoginInterInfoReq> body;

}
