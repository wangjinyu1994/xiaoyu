package com.xiaoyu.provider.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SysyUpdateUserReq", description = "修改系统人员信息表请求接口")
public class SysyUpdateUserReq extends BaseReqBean {
    private static final long serialVersionUID = 8782108765364553961L;

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

}
