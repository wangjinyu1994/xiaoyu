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
@ApiModel(value = "UpdatePicturesInfoReq", description = "修改精彩图片详情请求接口请求实体类")
public class UpdatePicturesInfoReq extends BaseReqBean {
    private static final long serialVersionUID = -1038911057341676144L;

    @ApiModelProperty(value = "主键", name = "zj",required = true)
    @NotNull(message = "主键不能为空")
    private Long zj;

    @ApiModelProperty(value = "图片名称", name = "name")
    private String name;

    @ApiModelProperty(value = "图片地址", name = "address")
    private String address;

    @ApiModelProperty(value = "图片类型主键", name = "typeZj")
    private Long typeZj;

    @ApiModelProperty(value = "图片顺序", name = "sx")
    private Integer sx;

}
