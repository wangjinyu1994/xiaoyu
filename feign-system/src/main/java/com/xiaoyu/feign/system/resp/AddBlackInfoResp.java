package com.xiaoyu.feign.system.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddBlackInfoResp", description = "添加黑名单请求接口返回实体类")
public class AddBlackInfoResp extends BaseRespBean {
    private static final long serialVersionUID = 7086453401067386380L;
}
