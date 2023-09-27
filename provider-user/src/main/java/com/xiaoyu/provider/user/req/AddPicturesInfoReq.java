package com.xiaoyu.provider.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddPicturesInfoReq", description = "添加精彩图片详情请求接口请求实体类")
public class AddPicturesInfoReq extends BaseReqBean {
    private static final long serialVersionUID = -1526785971010451835L;

    @ApiModelProperty(value = "图片名称", name = "name")
    @NotBlank(message = "图片名称不能为空")
    private String name;

    @ApiModelProperty(value = "图片地址", name = "address")
    @NotBlank(message = "图片地址不能为空")
    private String address;

    @ApiModelProperty(value = "图片类型主键", name = "typeZj")
    @NotNull(message = "图片类型主键不能为空")
    private Long typeZj;

}
