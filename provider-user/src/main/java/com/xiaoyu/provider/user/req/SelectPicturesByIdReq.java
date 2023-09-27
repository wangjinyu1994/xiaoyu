package com.xiaoyu.provider.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectPicturesByIdReq", description = "根据主键查询精彩图片请求接口请求实体类")
public class SelectPicturesByIdReq extends BaseReqBean {
    private static final long serialVersionUID = 6841347171585872654L;

    @ApiModelProperty(value = "主键", name = "zj")
    @NotNull(message = "主键不能为空")
    private Long zj;
}
