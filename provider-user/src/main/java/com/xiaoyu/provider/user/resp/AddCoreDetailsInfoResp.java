package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddCoreDetailsInfoResp", description = "添加中心简介详情请求接口返回实体类")
public class AddCoreDetailsInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -5346054174972563013L;
}
