package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "DeleteOrgInfoResp", description = "删除机构详情请求接口返回实体类")
public class DeleteOrgInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -9037320420494588170L;
}
