package com.xiaoyu.feign.system.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddLoginInterInfoResp", description = "添加登录放行请求接口返回实体类")
public class AddLoginInterInfoResp extends BaseRespBean {
    private static final long serialVersionUID = 2074305341306102881L;
}
