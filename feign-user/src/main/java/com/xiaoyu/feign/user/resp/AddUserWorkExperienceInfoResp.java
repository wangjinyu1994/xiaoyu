package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddUserWorkExperienceInfoResp", description = "添加人员工作经历请求接口返回实体类")
public class AddUserWorkExperienceInfoResp extends BaseRespBean {
    private static final long serialVersionUID = -4884959695602925874L;
}
