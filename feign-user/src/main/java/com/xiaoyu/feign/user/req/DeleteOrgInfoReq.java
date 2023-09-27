package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * WJY
 */
@Data
@ApiModel(value = "DeleteOrgInfoReq", description = "删除机构详情请求接口请求实体类")
public class DeleteOrgInfoReq extends BaseReqBean {
    private static final long serialVersionUID = 1332615251800838852L;

    @ApiModelProperty(value = "主键", name = "zj",required = true)
    @NotNull(message = "主键不能为空")
    private Long zj;
}
