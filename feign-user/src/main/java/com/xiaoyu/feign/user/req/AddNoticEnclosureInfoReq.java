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
@ApiModel(value = "AddNoticEnclosureInfoReq", description = "添加消息通知附件请求接口请求实体类")
public class AddNoticEnclosureInfoReq extends BaseReqBean {
    private static final long serialVersionUID = 1094818480304993235L;

    @ApiModelProperty(value = "标题", name = "title")
    private String title;

    @ApiModelProperty(value = "大小", name = "ram")
    private String ram;

    @ApiModelProperty(value = "地址", name = "address")
    private String address;

    @ApiModelProperty(value = "消息通知主键", name = "noticId",required = true)
    @NotNull(message = "消息通知主键不能为空")
    private Long noticId;

}
