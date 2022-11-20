package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddSysUserResp", description = "添加系统人员信息接口返回实体类")
public class AddSysUserResp extends BaseRespBean {
    private static final long serialVersionUID = 1246398286335104895L;
}
