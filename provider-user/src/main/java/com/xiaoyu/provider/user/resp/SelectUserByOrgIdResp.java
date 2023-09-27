package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectUserByOrgIdResp", description = "根据机构主键分页查询人员请求接口返回实体类")
public class SelectUserByOrgIdResp extends BaseRespBean {
    private static final long serialVersionUID = -1429806028624959159L;

    @ApiModelProperty(value = "人员主键", name = "userId" )
    private Long userId;

    @ApiModelProperty(value = "人员昵称", name = "userName" )
    private String userName;

}
