package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddCoreContentInfoResp", description = "添加中心简介内容请求接口返回实体类")
public class AddCoreContentInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -5601726059789587014L;
}
