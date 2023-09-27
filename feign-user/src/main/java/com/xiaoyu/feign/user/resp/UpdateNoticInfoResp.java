package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "UpdateNoticInfoResp", description = "修改消息通知详情请求接口返回实体类")
public class UpdateNoticInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -4023210289385614585L;
}
