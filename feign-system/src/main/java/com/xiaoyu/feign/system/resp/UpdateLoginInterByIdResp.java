package com.xiaoyu.feign.system.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "UpdateLoginInterByIdResp", description = "根据主键修改登录放行请求接口返回实体类")
public class UpdateLoginInterByIdResp extends BaseRespBean {
    private static final long serialVersionUID = 4325173347978801066L;
}
