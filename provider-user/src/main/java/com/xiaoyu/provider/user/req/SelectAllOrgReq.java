package com.xiaoyu.provider.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectAllOrgReq", description = "查询所有机构请求接口请求实体类")
public class SelectAllOrgReq extends BaseReqBean {

    @ApiModelProperty(value = "父级主键", name = "parentId")
    private Long parentId;

    @ApiModelProperty(value = "机构级别", name = "orgLevel")
    private String orgLevel;

}
