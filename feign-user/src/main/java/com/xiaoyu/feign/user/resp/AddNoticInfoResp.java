package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddNoticInfoResp", description = "添加消息通知详情请求接口返回实体类")
public class AddNoticInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -2274750553159747922L;
}
