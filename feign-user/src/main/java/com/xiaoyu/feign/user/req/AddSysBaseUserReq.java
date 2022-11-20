package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddSysBaseUserReq", description = "添加系统人员基础信息接口请求入参")
public class AddSysBaseUserReq extends BaseReqBean {
    private static final long serialVersionUID = -8846385752247102864L;

    @ApiModelProperty(value = "姓名", name = "name")
    private String name;

    @ApiModelProperty(value = "婚姻状况（1 未婚 2 已婚）", name = "marriage")
    private String marriage;

    @ApiModelProperty(value = "最高学历主键", name = "educationId")
    private Long educationId;

    @ApiModelProperty(value = "政治面貌主键", name = "politicalOutlookId")
    private Long politicalOutlookId;

    @ApiModelProperty(value = "身份证号", name = "sfId")
    private String sfzId;

    @ApiModelProperty(value = "电话", name = "phone")
    private String phone;

    @ApiModelProperty(value = "邮箱", name = "email")
    private String email;

    @ApiModelProperty(value = "职业主键", name = "occupationId")
    private Long occupationId;

    @ApiModelProperty(value = "省份代码", name = "provinceDm")
    private String provinceDm;

    @ApiModelProperty(value = "城市代码", name = "region")
    private String cityDm;

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
