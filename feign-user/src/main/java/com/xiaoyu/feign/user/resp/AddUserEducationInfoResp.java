package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddUserEducationInfoResp", description = "添加系统人员教育情况信息接口返回实体类")
public class AddUserEducationInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -5205843163640330177L;
}
