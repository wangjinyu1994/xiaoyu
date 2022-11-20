package com.xiaoyu.provider.common.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectSublevelAdministrativeRegionByIdResp", description = "根据行政区域主键获取下级行政区域请求接口返回实体类返回实体类")
public class SelectSublevelAdministrativeRegionByIdResp extends BaseRespBean {
    private static final long serialVersionUID = 2170833892720111687L;

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
