package com.xiaoyu.provider.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "UpdateUserMemberOfFamilyReq", description = "更新家庭成员信息请求接口请求入参")
public class UpdateUserMemberOfFamilyReq extends BaseReqBean {
    private static final long serialVersionUID = 6996290275374934959L;

    @ApiModelProperty(value = "成员表主键", name = "zj")
    private Long zj;

    @ApiModelProperty(value = "人员类型主键", name = "typeId")
    private Long typeId;

    @ApiModelProperty(value = "姓名", name = "name")
    private String name;

    @ApiModelProperty(value = "职业", name = "occupation")
    private String occupation;

}
