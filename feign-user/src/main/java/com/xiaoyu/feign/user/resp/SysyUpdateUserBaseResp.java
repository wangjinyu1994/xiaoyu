package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SysyUpdateUserBaseResp", description = "修改人员基础信息请求接口返回实体类")
public class SysyUpdateUserBaseResp extends BaseRespBean {
    private static final long serialVersionUID = 6504646593166116398L;
}
