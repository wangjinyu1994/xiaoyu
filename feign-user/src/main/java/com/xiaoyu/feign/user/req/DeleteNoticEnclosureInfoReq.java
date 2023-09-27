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
@ApiModel(value = "DeleteNoticEnclosureInfoReq", description = "删除消息通知附件请求接口请求实体类")
public class DeleteNoticEnclosureInfoReq extends BaseReqBean {
    private static final long serialVersionUID = 1002190862103001481L;

    @ApiModelProperty(value = "主键", name = "zj",required = true)
    @NotNull(message = "主键不能为空")
    private Long zj;
}
