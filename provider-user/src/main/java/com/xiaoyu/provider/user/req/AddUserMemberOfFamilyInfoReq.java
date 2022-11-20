package com.xiaoyu.provider.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddUserMemberOfFamilyInfoReq", description = "添加系统人员家庭成员信息接口请求入参")
public class AddUserMemberOfFamilyInfoReq extends BaseReqBean {
    private static final long serialVersionUID = 8101506095636044125L;

    @ApiModelProperty(value = "人员类型主键", name = "typeId")
    private Long typeId;

    @ApiModelProperty(value = "姓名", name = "name")
    private String name;

    @ApiModelProperty(value = "职业", name = "occupation")
    private String occupation;

}
