package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqTableBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectPicturesTableReq", description = "分页查询精彩图片请求接口请求实体类")
public class SelectPicturesTableReq extends BaseReqTableBean {
    private static final long serialVersionUID = 7823316734085534178L;
}
