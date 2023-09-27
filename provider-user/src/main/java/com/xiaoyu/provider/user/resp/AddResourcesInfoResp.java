package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddCoreDetailsInfoResp", description = "添加资源详情请求接口返回实体类")
public class AddResourcesInfoResp extends BaseRespBean {
    private static final long serialVersionUID = 3421698534921289391L;
}
