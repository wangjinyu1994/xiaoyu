package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "DeletePicturesInfoResp", description = "删除精彩图片详情请求接口返回实体类")
public class DeletePicturesInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -4051880083800446810L;
}
