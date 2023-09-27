package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddNoticInfoReq", description = "添加消息通知详情请求接口请求实体类")
public class AddNoticInfoReq extends BaseReqBean {
    private static final long serialVersionUID = -8650891084165952375L;

    @ApiModelProperty(value = "标题", name = "title")
    private String title;

    @ApiModelProperty(value = "消息类型主键", name = "typeZj")
    private Long typeZj;

    @ApiModelProperty(value = "摘要", name = "summary")
    private String summary;

    @ApiModelProperty(value = "内容", name = "content")
    private String content;

    @ApiModelProperty(value = "机构名称", name = "orgName")
    private String orgName;

    @ApiModelProperty(value = "机构主键", name = "orgId")
    private Long orgId;

    @ApiModelProperty(value = "来源", name = "source")
    private String source;

    @ApiModelProperty(value = "附件信息", name = "body")
    private List<AddNoticEnclosure> body;

}
