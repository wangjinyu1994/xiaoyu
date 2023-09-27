package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddOrgInfoResp", description = "添加机构详情请求接口返回实体类")
public class AddOrgInfoResp extends BaseRespBean {
    private static final long serialVersionUID = 3456353893209247622L;
}
