package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "UpdateOrgInfoResp", description = "修改机构详情请求接口返回实体类")
public class UpdateOrgInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -7797979280022819809L;
}
