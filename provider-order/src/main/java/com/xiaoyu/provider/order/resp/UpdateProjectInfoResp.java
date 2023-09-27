package com.xiaoyu.provider.order.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "UpdateProjectInfoResp", description = "修改团购项目详情请求接口返回实体类")
public class UpdateProjectInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -4862749578396606715L;
}
