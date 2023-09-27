package com.xiaoyu.provider.order.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "UpdateProjectEnclosureInfoResp", description = "修改团购项目附件请求接口返回实体类")
public class UpdateProjectEnclosureInfoResp extends BaseRespBean {
    private static final long serialVersionUID = 785125240494439744L;
}
