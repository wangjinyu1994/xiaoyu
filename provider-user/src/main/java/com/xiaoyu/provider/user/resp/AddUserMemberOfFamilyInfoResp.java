package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddUserMemberOfFamilyInfoResp", description = "添加系统人员家庭成员信息接口返回实体类")
public class AddUserMemberOfFamilyInfoResp extends BaseReqBean {
    private static final long serialVersionUID = -5431629855479058190L;
}
