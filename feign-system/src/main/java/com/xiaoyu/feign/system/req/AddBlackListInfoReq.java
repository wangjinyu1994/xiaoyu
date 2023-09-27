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
@ApiModel(value = "AddBlackListInfoReq", description = "批量添加黑名单请求接口请求入参")
public class AddBlackListInfoReq extends BaseReqBean {
    private static final long serialVersionUID = 1243722137325347855L;

    @ApiModelProperty(value = "黑名单信息", name = "body")
    private List<AddBlackInfoReq> body;

}
