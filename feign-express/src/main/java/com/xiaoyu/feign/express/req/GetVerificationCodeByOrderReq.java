package com.xiaoyu.feign.express.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "GetVerificationCodeByOrderReq", description = "根据快递单号获取验证码请求入参")
public class GetVerificationCodeByOrderReq extends BaseReqBean {
    private static final long serialVersionUID = -1783668921391350L;

    @ApiModelProperty(value = "快递单号",name = "code")
    private String code;

}
