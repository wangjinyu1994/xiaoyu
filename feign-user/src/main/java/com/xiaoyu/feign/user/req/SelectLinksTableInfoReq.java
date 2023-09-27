package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqTableBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectLinksTableInfoReq", description = "分页查询友情链接请求接口请求实体类")
public class SelectLinksTableInfoReq extends BaseReqTableBean {
    private static final long serialVersionUID = -8560707562836906311L;
}
