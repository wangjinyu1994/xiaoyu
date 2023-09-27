package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddCoreDetailsInfoResp", description = "修改资源详情请求接口返回实体类")
public class UpdateResourcesInfoResp extends BaseRespBean {
    private static final long serialVersionUID = 2626268645099445758L;
}
