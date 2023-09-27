package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "DeleteCoreContentInfoResp", description = "删除中心简介内容请求接口返回实体类")
public class DeleteCoreContentInfoResp extends BaseRespBean {
    private static final long serialVersionUID = 9053629242442471296L;
}
