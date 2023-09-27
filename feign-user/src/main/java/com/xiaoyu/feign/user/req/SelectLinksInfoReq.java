package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectLinksInfoReq", description = "查询友情链接请求接口请求实体类")
public class SelectLinksInfoReq extends BaseReqBean {
    private static final long serialVersionUID = 1332784044597398549L;
}
