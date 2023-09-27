package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddPicturesInfoResp", description = "添加精彩图片详情请求接口返回实体类")
public class AddPicturesInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -8694984408443019525L;
}
