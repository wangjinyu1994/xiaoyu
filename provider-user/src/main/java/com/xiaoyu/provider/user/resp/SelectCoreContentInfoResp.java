package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectCoreContentInfoResp", description = "查询中心简介内容请求接口返回实体类")
public class SelectCoreContentInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -8628572036365037622L;

    @ApiModelProperty(value = "主键", name = "zj")
    private Long zj;

    @ApiModelProperty(value = "中心简介主键", name = "zxjjzj")
    private Long zxjjzj;

    @ApiModelProperty(value = "内容", name = "content")
    private String content;

}
