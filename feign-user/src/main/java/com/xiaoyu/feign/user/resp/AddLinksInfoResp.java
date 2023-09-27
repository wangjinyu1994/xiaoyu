package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectLinksDataResp", description = "新增友情链接请求接口返回实体类")
public class AddLinksInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -4376522522174598947L;
}
