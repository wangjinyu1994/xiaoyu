package com.xiaoyu.feign.express.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "GetVerificationCodeByOrderResp", description = "根据快递单号获取验证码返回实体类")
public class GetVerificationCodeByOrderResp extends BaseRespBean {
    private static final long serialVersionUID = 3445564042648102649L;

    @ApiModelProperty(value = "token",name = "token")
    private String token;

    @ApiModelProperty(value = "验证码",name = "code")
    private String code;

}
