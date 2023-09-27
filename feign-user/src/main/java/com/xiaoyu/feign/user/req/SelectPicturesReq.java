package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectPicturesReq", description = "查询所有精彩图片请求接口请求实体类")
public class SelectPicturesReq extends BaseReqBean {
    private static final long serialVersionUID = -6333895770213858454L;
}
