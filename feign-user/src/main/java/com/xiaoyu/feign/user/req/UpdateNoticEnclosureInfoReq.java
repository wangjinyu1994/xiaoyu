package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * WJY
 */
@Data
@ApiModel(value = "UpdateNoticEnclosureInfoReq", description = "修改消息通知附件请求接口请求实体类")
public class UpdateNoticEnclosureInfoReq extends BaseReqBean {
    private static final long serialVersionUID = 8724818731787251059L;

    @ApiModelProperty(value = "主键", name = "zj")
    @NotNull(message = "主键不能为空")
    private Long zj;

    @ApiModelProperty(value = "标题", name = "title")
    private String title;

    @ApiModelProperty(value = "大小", name = "ram")
    private String ram;

    @ApiModelProperty(value = "地址", name = "address")
    private String address;
}
