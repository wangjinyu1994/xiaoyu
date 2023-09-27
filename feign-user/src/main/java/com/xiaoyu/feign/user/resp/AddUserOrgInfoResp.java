package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddUserOrgInfoResp", description = "添加人员机构请求接口返回实体类")
public class AddUserOrgInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -6854307689918309027L;
}
