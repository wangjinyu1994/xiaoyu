package com.xiaoyu.oss.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "UploadLocalImgResp", description = "上传本地图片信息返回实体类")
public class UploadLocalImgResp extends BaseRespBean {

    @ApiModelProperty(value = "路径",name = "path")
    private String path;

    @ApiModelProperty(value = "文件老名",name = "oldName")
    private String oldName;

    @ApiModelProperty(value = "文件新名",name = "name")
    private String name;

}
