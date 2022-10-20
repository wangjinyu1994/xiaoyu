package com.xiaoyu.oss.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "UploadImgReq", description = "上传图片信息请求入参")
public class UploadImgReq extends BaseReqBean {
    private static final long serialVersionUID = -5640660160731135305L;
}
