package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqTableBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectOrgTableReq", description = "分页查询机构请求接口请求实体类")
public class SelectOrgTableReq extends BaseReqTableBean {

    @ApiModelProperty(value = "父级主键", name = "parentId")
    private Long parentId;

    @ApiModelProperty(value = "机构级别", name = "orgLevel")
    private String orgLevel;


}
