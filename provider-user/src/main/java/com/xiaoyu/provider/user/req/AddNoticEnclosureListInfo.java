package com.xiaoyu.provider.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddNoticEnclosureListInfo", description = "添加消息通知附件请求接口请求实体类")
public class AddNoticEnclosureListInfo extends BaseReqBean {
    private static final long serialVersionUID = -460673026149079679L;

    @ApiModelProperty(value = "附件集合", name = "body")
    private List<AddNoticEnclosureInfoReq> body;
}
