package com.xiaoyu.oss.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "UploadBase64ImgReq", description = "上传base64图片信息请求入参")
public class UploadBase64ImgReq extends BaseReqBean {
    private static final long serialVersionUID = -6497468750544969651L;

    @ApiModelProperty(value = "base64",name = "base64")
    private String base64;

    @ApiModelProperty(value = "文件名",name = "name")
    private String name;

}
