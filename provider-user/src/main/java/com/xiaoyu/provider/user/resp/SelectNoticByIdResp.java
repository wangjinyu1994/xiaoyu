package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;


/**
 * WJY
 */
@Data
@ApiModel(value = "SelectNoticByIdResp", description = "根据主键查询消息通知请求接口返回实体类")
public class SelectNoticByIdResp extends BaseRespBean {
    private static final long serialVersionUID = -7960992016747425147L;

    @ApiModelProperty(value = "主键", name = "zj",required = true)
    private Long zj;

    @ApiModelProperty(value = "消息类型主键", name = "type")
    private Long typeZj;

    @ApiModelProperty(value = "消息类型字符", name = "typeStr")
    private String typeStr;

    @ApiModelProperty(value = "标题", name = "title")
    private String title;

    @ApiModelProperty(value = "摘要", name = "summary")
    private String summary;

    @ApiModelProperty(value = "内容", name = "content")
    private String content;

    @ApiModelProperty(value = "机构名称", name = "orgName")
    private String orgName;

    @ApiModelProperty(value = "机构主键", name = "orgId")
    private String orgId;

    @ApiModelProperty(value = "来源", name = "source")
    private String source;

    @ApiModelProperty(value = "发布时间", name = "releaseDate")
    private String releaseDate;

    @ApiModelProperty(value = "访问量", name = "visits")
    private String visits;

    @ApiModelProperty(value = "附件集合", name = "body")
    private List<NoticEnclosureResp> body;
}
