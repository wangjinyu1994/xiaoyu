package com.xiaoyu.feign.order.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddProjectInfoResp", description = "添加团购项目详情请求接口返回实体类")
public class AddProjectInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -6308650789873394401L;
}
