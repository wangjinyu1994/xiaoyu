package com.xiaoyu.provider.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SysUserByIdReq", description = "根据人员主键查询人员信息请求接口请求入参")
public class SysUserByIdReq extends BaseReqBean {
    private static final long serialVersionUID = -1183944450710913401L;
}
