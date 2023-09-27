package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddCoreDetailsInfoResp", description = "删除资源详情请求接口返回实体类")
public class DeleteResourcesInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -3728483011439581830L;
}
