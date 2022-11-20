package com.xiaoyu.provider.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SysUserBaseByIdReq", description = "根据人员主键查询人员基础信息请求接口请求入参")
public class SysUserBaseByIdReq extends BaseReqBean {
    private static final long serialVersionUID = -8557173900775970847L;
}
