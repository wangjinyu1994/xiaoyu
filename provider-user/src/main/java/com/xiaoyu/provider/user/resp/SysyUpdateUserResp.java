package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SysyUpdateUserResp", description = "修改系统人员信息表请求接口返回实体类")
public class SysyUpdateUserResp extends BaseRespBean {
    private static final long serialVersionUID = 1504847947011667494L;
}
