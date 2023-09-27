package com.xiaoyu.feign.order.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * WJY
 */
@Data
@ApiModel(value = "ExamProOrderInfoReq", description = "审核预处理订单详情请求接口请求入参")
public class ExamProOrderInfoReq extends BaseReqBean {
    private static final long serialVersionUID = 2812533344165216335L;

    @ApiModelProperty(value = "主键", name = "zj",required = true)
    @NotNull(message = "主键不能为空")
    private Long zj;

    @ApiModelProperty(value = "审核状态（1 审核中 2 审核通过 3 审核驳回）", name = "examStatus",required = true)
    @NotNull(message = "主键不能为空")
    private String examStatus;

    @ApiModelProperty(value = "驳回原因", name = "reason")
    private String reason;

}
