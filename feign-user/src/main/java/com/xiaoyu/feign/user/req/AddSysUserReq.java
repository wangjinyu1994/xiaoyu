package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddSysUserReq", description = "添加系统人员信息接口请求入参")
public class AddSysUserReq extends BaseReqBean {
    private static final long serialVersionUID = -6757382901827259765L;

    @ApiModelProperty(value = "昵称", name = "nickname")
    private String nickname;

    @ApiModelProperty(value = "性别（1 男 2 女 3 未知）", name = "sex")
    private String sex;

    @ApiModelProperty(value = "头像地址", name = "headImgAddress")
    private String headImgAddress;

    @ApiModelProperty(value = "生日", name = "birthday")
    private String birthday;

    @ApiModelProperty(value = "个性签名", name = "autograph")
    private String autograph;

    @ApiModelProperty(value = "个性说明", name = "explain")
    private String explain;

    @ApiModelProperty(value = "经度", name = "longitude")
    private String longitude;

    @ApiModelProperty(value = "纬度", name = "latitude")
    private String latitude;

    @ApiModelProperty(value = "血型", name = "bloodType")
    private Long bloodType;

    @ApiModelProperty(value = "登录账号", name = "loginName")
    private String loginName;

    @ApiModelProperty(value = "人员类型（1 管理员 2 用户）", name = "userType")
    private String userType;

    @ApiModelProperty(value = "人员所属机构主键", name = "orgId")
    private Long orgId;

}
