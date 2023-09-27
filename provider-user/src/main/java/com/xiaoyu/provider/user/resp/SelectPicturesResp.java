package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectPicturesResp", description = "查询所有精彩图片请求接口返回实体类")
public class SelectPicturesResp extends BaseRespBean {
    private static final long serialVersionUID = -2507984808048897677L;

    @ApiModelProperty(value = "主键", name = "zj",required = true)
    private Long zj;

    @ApiModelProperty(value = "图片名称", name = "name")
    private String name;

    @ApiModelProperty(value = "图片地址", name = "address")
    private String address;

    @ApiModelProperty(value = "图片类型主键", name = "typeZj")
    private Long typeZj;

    @ApiModelProperty(value = "图片类型名称", name = "typeStr")
    private String typeStr;

    @ApiModelProperty(value = "图片顺序", name = "sx")
    private Integer sx;

}
