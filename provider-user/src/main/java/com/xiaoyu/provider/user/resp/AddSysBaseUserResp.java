package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddSysBaseUserResp", description = "添加系统人员基础信息接口返回实体类")
public class AddSysBaseUserResp extends BaseReqBean {
    private static final long serialVersionUID = -992613760150469547L;
}
