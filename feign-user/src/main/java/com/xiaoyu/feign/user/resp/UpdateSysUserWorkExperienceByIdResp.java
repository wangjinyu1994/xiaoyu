package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "UpdateSysUserWorkExperienceByIdResp", description = "修改人员工作经历返回实体类")
public class UpdateSysUserWorkExperienceByIdResp extends BaseRespBean {
    private static final long serialVersionUID = 7924019208598170078L;
}
