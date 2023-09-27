package com.xiaoyu.feign.order.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddProjectEnclosureInfoResp", description = "添加团购项目附件请求接口返回实体类")
public class AddProjectEnclosureInfoResp extends BaseRespBean {
    private static final long serialVersionUID = 594278370487941544L;
}
