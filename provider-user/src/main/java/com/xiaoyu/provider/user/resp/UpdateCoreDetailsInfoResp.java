package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "UpdateCoreDetailsInfoResp", description = "修改中心简介详情请求接口返回实体类")
public class UpdateCoreDetailsInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -5824734482318352779L;
}
