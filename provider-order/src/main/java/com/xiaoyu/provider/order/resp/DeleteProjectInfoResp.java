package com.xiaoyu.provider.order.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "DeleteProjectInfoResp", description = "删除团购项目详情请求接口返回实体类")
public class DeleteProjectInfoResp extends BaseRespBean {
    private static final long serialVersionUID = 5921853769919705941L;
}
