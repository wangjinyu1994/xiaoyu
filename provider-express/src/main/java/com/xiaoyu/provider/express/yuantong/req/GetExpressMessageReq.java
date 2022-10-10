package com.xiaoyu.provider.express.yuantong.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "GetExpressMessageReq", description = "获取快递信息请求入参")
public class GetExpressMessageReq extends BaseReqBean {
    private static final long serialVersionUID = -1641401738368161621L;

    @ApiModelProperty(value = "验证码",name = "code")
    private String code;

    @ApiModelProperty(value = "token",name = "token")
    private String token;

    @ApiModelProperty(value = "快递单号",name = "order")
    private String order;
}
