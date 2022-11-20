package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SysUserBaseByIdResp", description = "根据人员主键查询人员基础信息请求接口返回实体类")
public class SysUserBaseByIdResp extends BaseRespBean {
    private static final long serialVersionUID = -886661183503589881L;

    @ApiModelProperty(value = "基础表主键", name = "zj")
    private Long zj;

    @ApiModelProperty(value = "姓名", name = "name")
    private String name;

    @ApiModelProperty(value = "婚姻状况（1 未婚 2 已婚）", name = "marriage")
    private String marriage;

    @ApiModelProperty(value = "最高学历", name = "education")
    private String education;

    @ApiModelProperty(value = "最高学历主键", name = "educationId")
    private Long educationId;

    @ApiModelProperty(value = "政治面貌", name = "politicalOutlook")
    private String politicalOutlook;

    @ApiModelProperty(value = "政治面貌主键", name = "politicalOutlookId")
    private Long politicalOutlookId;

    @ApiModelProperty(value = "身份证号", name = "sfId")
    private String sfzId;

    @ApiModelProperty(value = "电话", name = "phone")
    private String phone;

    @ApiModelProperty(value = "邮箱", name = "email")
    private String email;

    @ApiModelProperty(value = "职业", name = "occupation")
    private String occupation;

    @ApiModelProperty(value = "职业主键", name = "occupationId")
    private Long occupationId;

    @ApiModelProperty(value = "省份", name = "province")
    private String province;

    @ApiModelProperty(value = "省份代码", name = "provinceDm")
    private String provinceDm;

    @ApiModelProperty(value = "城市", name = "city")
    private String city;

    @ApiModelProperty(value = "城市代码", name = "region")
    private String cityDm;

    @ApiModelProperty(value = "地区", name = "region")
    private String region;

    @ApiModelProperty(value = "地区代码", name = "region")
    private String regionDm;

    @ApiModelProperty(value = "公司", name = "company")
    private String company;

    @ApiModelProperty(value = "公司地址", name = "companyAddr")
    private String companyAddr;

    @ApiModelProperty(value = "居住地址", name = "residential")
    private String residential;

    @ApiModelProperty(value = "身份证地址", name = "sfAddress")
    private String sfzAddress;

}
