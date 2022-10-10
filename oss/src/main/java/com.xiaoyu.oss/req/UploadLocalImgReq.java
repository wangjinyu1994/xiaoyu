package com.xiaoyu.oss.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "UploadLocalImgReq", description = "上传本地图片信息请求入参")
public class UploadLocalImgReq extends BaseReqBean {

    @ApiModelProperty(value = "路径",name = "path")
    private String path;

    @ApiModelProperty(value = "文件名",name = "name")
    private String name;
}
