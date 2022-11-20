package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "UpdateUserMemberOfFamilyResp", description = "更新家庭成员信息请求接口返回实体类")
public class UpdateUserMemberOfFamilyResp extends BaseRespBean {
    private static final long serialVersionUID = -8910604520119083181L;
}
