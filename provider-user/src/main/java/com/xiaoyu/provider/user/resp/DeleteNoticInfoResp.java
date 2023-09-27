package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "DeleteNoticInfoResp", description = "删除消息通知详情请求接口返回实体类")
public class DeleteNoticInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -3120757410794221259L;
}
