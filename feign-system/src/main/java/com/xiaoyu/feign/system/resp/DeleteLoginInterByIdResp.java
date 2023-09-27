package com.xiaoyu.feign.system.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "DeleteLoginInterByIdResp", description = "根据主键删除登录放行请求接口返回实体类")
public class DeleteLoginInterByIdResp extends BaseRespBean {
    private static final long serialVersionUID = 3648338397784471621L;
}
