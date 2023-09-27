package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectLinksTableResp", description = "分页查询友情链接请求接口返回实体类")
public class SelectLinksTableResp extends BaseRespBean {
    private static final long serialVersionUID = -7346829032734343435L;

    @ApiModelProperty(value = "主键", name = "zj")
    private Long zj;

    @ApiModelProperty(value = "名称", name = "name")
    private String name;

    @ApiModelProperty(value = "地址", name = "address")
    private String address;

    @ApiModelProperty(value = "图片地址", name = "tpAddress")
    private String tpAddress;

}
