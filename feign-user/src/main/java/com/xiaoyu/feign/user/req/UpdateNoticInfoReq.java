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
@ApiModel(value = "UpdateNoticInfoReq", description = "修改消息通知详情请求接口请求实体类")
public class UpdateNoticInfoReq extends BaseReqBean {
    private static final long serialVersionUID = 997203503856590161L;

    @ApiModelProperty(value = "主键", name = "zj",required = true)
    @NotNull(message = "主键不能为空")
    private Long zj;

    @ApiModelProperty(value = "消息类型主键", name = "typeZj")
    private Long typeZj;

    @ApiModelProperty(value = "标题", name = "title")
    private String title;

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

    @ApiModelProperty(value = "发布时间", name = "releaseDate")
    private String releaseDate;

    @ApiModelProperty(value = "访问量", name = "visits")
    private String visits;

}
