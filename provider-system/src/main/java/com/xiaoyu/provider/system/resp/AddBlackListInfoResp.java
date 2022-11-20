package com.xiaoyu.provider.system.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddBlackListInfoResp", description = "批量添加黑名单请求接口返回实体类")
public class AddBlackListInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -3402418650614333720L;
}
