package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "DeleteUserOrgInfoResp", description = "删除人员机构请求接口返回实体类")
public class DeleteUserOrgInfoResp extends BaseRespBean {
    private static final long serialVersionUID = 8842487821431453357L;
}
