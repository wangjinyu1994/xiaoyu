package com.xiaoyu.provider.common.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectSublevelAdministrativeRegionByIdReq", description = "根据行政区域主键获取下级行政区域请求接口请求入参")
public class SelectSublevelAdministrativeRegionByIdReq extends BaseReqBean {
    private static final long serialVersionUID = -637961104047870456L;

    @ApiModelProperty(value = "行政区域主键", name = "zj",required = true)
    @NotBlank(message = "行政区域主键不能为空")
    private Long zj;
}
