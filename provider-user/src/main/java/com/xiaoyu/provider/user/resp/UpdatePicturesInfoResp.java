package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "UpdatePicturesInfoResp", description = "修改精彩图片详情请求接口返回实体类")
public class UpdatePicturesInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -4261326643605597632L;
}
