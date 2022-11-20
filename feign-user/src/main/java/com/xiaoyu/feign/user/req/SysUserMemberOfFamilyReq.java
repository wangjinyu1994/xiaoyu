package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SysUserMemberOfFamilyReq", description = "获取家庭成员接口请求入参")
public class SysUserMemberOfFamilyReq extends BaseReqBean {
    private static final long serialVersionUID = 866150536991105222L;
}
