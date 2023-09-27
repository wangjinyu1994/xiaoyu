package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectLinksDataResp", description = "修改友情链接请求接口返回实体类")
public class UpdateLinksInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -2908075057499446729L;
}
