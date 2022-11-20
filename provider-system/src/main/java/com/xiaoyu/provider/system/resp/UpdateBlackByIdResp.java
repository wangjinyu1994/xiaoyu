package com.xiaoyu.provider.system.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "UpdateBlackByIdResp", description = "根据主键修改黑名单请求接口返回实体类")
public class UpdateBlackByIdResp extends BaseRespBean {
    private static final long serialVersionUID = 1380892661984261592L;
}
