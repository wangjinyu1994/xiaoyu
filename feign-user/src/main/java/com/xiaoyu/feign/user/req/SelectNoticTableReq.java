package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqTableBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * WJY
 */
@Data
@ApiModel(value = "SelectNoticTableReq", description = "分页查询消息通知请求接口请求实体类")
public class SelectNoticTableReq extends BaseReqTableBean {
    private static final long serialVersionUID = 5371943902756470465L;

    @ApiModelProperty(value = "消息类型主键", name = "typeZj",required = true)
    private Long typeZj;

}
