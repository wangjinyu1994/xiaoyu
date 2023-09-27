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
@ApiModel(value = "DeleteCoreDetailsInfoReq", description = "删除中心简介详情请求接口请求入参")
public class DeleteCoreDetailsInfoReq extends BaseReqBean {
    private static final long serialVersionUID = -1174042010791640865L;

    @ApiModelProperty(value = "主键", name = "zj",required = true)
    @NotNull(message = "主键不能为空")
    private Long zj;
}
