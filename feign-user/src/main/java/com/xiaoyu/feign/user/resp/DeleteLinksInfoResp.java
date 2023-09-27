package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "DeleteLinksInfoResp", description = "删除友情链接请求接口返回实体类")
public class DeleteLinksInfoResp extends BaseRespBean {
    private static final long serialVersionUID = 120123985630900168L;
}
