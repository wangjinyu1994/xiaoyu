package com.xiaoyu.feign.common.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectAllAdministrativeRegionResp", description = "获取所有行政区域接口返回实体类")
public class SelectAllAdministrativeRegionResp extends BaseRespBean {
    private static final long serialVersionUID = -3797464650466303053L;

    @ApiModelProperty(value = "行政区域表主键", name = "zj")
    private Long zj;

    @ApiModelProperty(value = "名称", name = "name")
    private String name;

    @ApiModelProperty(value = "编码", name = "code")
    private String code;

    @ApiModelProperty(value = "简称", name = "abbreviation")
    private String abbreviation;

    @ApiModelProperty(value = "等级（1省-自治区-直辖市、2地级市、3市辖区-县-县级市、4乡-镇-街道）", name = "level")
    private String level;

    @ApiModelProperty(value = "父级code", name = "parentCode")
    private String parentCode;

    @ApiModelProperty(value = "父级主键", name = "parentZj")
    private Long parentZj;
}
