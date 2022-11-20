package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SysUserMemberOfFamilyResp", description = "获取家庭成员接口返回实体类")
public class SysUserMemberOfFamilyResp extends BaseRespBean {
    private static final long serialVersionUID = 4724550266998294504L;

    @ApiModelProperty(value = "成员表主键", name = "zj")
    private Long zj;

    @ApiModelProperty(value = "人员类型", name = "type")
    private String type;

    @ApiModelProperty(value = "人员类型主键", name = "typeId")
    private Long typeId;

    @ApiModelProperty(value = "姓名", name = "name")
    private String name;

    @ApiModelProperty(value = "职业", name = "occupation")
    private String occupation;

}
