package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectNoticIndexResp", description = "首页查询消息通知请求接口返回实体类")
public class SelectNoticIndexResp extends BaseRespBean {
    private static final long serialVersionUID = 5888741328225811874L;

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

}
