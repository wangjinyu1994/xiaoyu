package com.xiaoyu.provider.system.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddLoginInterListInfoResp", description = "批量添加登录放行请求接口返回实体类")
public class AddLoginInterListInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -3534065040980706125L;
}
