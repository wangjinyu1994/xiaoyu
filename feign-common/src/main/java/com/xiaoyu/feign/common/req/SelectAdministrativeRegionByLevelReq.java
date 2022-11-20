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
@ApiModel(value = "SelectAdministrativeRegionByLevelReq", description = "根据行政区域等级获取行政区域请求接口请求入参")
public class SelectAdministrativeRegionByLevelReq extends BaseReqBean {
    private static final long serialVersionUID = -4671274031781574511L;

    @ApiModelProperty(value = "行政级别(1省-自治区-直辖市、2地级市、3市辖区-县-县级市、4乡-镇-街道)", name = "level",required = true)
    @NotBlank(message = "行政区域级别不能为空")
    private String level;

}
