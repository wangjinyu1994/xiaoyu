package com.xiaoyu.provider.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectSysUserWorkExperienceReq", description = "获取人员工作经历请求接口请求入参")
public class SelectSysUserWorkExperienceReq extends BaseReqBean {
    private static final long serialVersionUID = -6639383729984489958L;
}
