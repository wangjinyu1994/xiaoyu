package com.xiaoyu.provider.system.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "DeleteBlackByIdResp", description = "根据主键删除黑名单请求接口返回实体类")
public class DeleteBlackByIdResp extends BaseRespBean {
    private static final long serialVersionUID = -5456602919161698134L;
}
