package com.xiaoyu.feign.order.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddProjectEnclosureListInfoResp", description = "添加团购项目附件请求接口返回实体类")
public class AddProjectEnclosureListInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -5126997539323242181L;
}
