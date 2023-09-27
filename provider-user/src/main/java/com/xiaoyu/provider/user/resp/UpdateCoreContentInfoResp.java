package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "UpdateCoreContentInfoResp", description = "修改中心简介内容请求接口返回实体类")
public class UpdateCoreContentInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -7422263895519303606L;
}
