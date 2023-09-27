package com.xiaoyu.feign.order.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "DeleteProjectEnclosureInfoResp", description = "删除团购项目附件请求接口返回实体类")
public class DeleteProjectEnclosureInfoResp extends BaseRespBean {
    private static final long serialVersionUID = 8047576245983741206L;
}
