package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SysUserByIdResp", description = "根据人员主键查询人员信息请求接口返回实体类")
public class SysUserByIdResp extends BaseRespBean {
    private static final long serialVersionUID = 5332841690088978815L;

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

    @ApiModelProperty(value = "血型说明", name = "bloodTypeStr")
    private String bloodTypeStr;
}
