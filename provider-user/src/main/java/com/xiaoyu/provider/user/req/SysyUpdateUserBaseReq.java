package com.xiaoyu.provider.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * WJY
 */
@Data
@ApiModel(value = "SysyUpdateUserBaseReq", description = "修改人员基础信息请求接口请求入参")
public class SysyUpdateUserBaseReq extends BaseReqBean {
    private static final long serialVersionUID = -6490152757802466207L;

    @ApiModelProperty(value = "基础表主键", name = "zj")
    @NotNull(message = "基础表主键不能为空")
    private Long zj;

    @ApiModelProperty(value = "姓名", name = "name")
    private String name;

    @ApiModelProperty(value = "婚姻状况（1 未婚 2 已婚）", name = "marriage")
    private String marriage;

    @ApiModelProperty(value = "最高学历", name = "education")
    private Long educationId;

    @ApiModelProperty(value = "政治面貌", name = "politicalOutlook")
    private Long politicalOutlookId;

    @ApiModelProperty(value = "身份证号", name = "sfId")
    private String sfzId;

    @ApiModelProperty(value = "电话", name = "phone")
    private String phone;

    @ApiModelProperty(value = "邮箱", name = "email")
    private String email;

    @ApiModelProperty(value = "职业", name = "occupation")
    private Long occupationId;

    @ApiModelProperty(value = "省份", name = "province")
    private String province;

    @ApiModelProperty(value = "城市", name = "city")
    private String city;

    @ApiModelProperty(value = "地区", name = "region")
    private String region;

    @ApiModelProperty(value = "公司", name = "company")
    private String company;

    @ApiModelProperty(value = "公司地址", name = "companyAddr")
    private String companyAddr;

    @ApiModelProperty(value = "居住地址", name = "residential")
    private String residential;

    @ApiModelProperty(value = "身份证地址", name = "sfAddress")
    private String sfzAddress;

}
