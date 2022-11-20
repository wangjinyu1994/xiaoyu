package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SysUserInitPasswordResp", description = "系统人员初始化密码返回实体类")
public class SysUserInitPasswordResp extends BaseRespBean {
    private static final long serialVersionUID = 2766043917934936548L;
}
