package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "DeleteCoreDetailsInfoResp", description = "删除中心简介详情请求接口返回实体类")
public class DeleteCoreDetailsInfoResp extends BaseRespBean {
    private static final long serialVersionUID = 5245242291318304084L;
}
