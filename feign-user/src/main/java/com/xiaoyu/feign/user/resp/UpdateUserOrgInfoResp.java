package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "UpdateUserOrgInfoResp", description = "修改人员机构请求接口返回实体类")
public class UpdateUserOrgInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -2822270391197545453L;
}
