package com.xiaoyu.feign.common.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectSublevelAdministrativeRegionByCodeReq", description = "根据行政区域编码获取下级行政区域请求接口请求入参")
public class SelectSublevelAdministrativeRegionByCodeReq extends BaseReqBean {
    private static final long serialVersionUID = -4318213328602828951L;

    @ApiModelProperty(value = "行政区域代码", name = "code",required = true)
    @NotBlank(message = "行政区域代码不能为空")
    private String code;
}
