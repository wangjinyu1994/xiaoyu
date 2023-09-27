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
@ApiModel(value = "UpdateOrgInfoReq", description = "修改机构详情请求接口请求实体类")
public class UpdateOrgInfoReq extends BaseReqBean {

    @ApiModelProperty(value = "主键", name = "zj",required = true)
    @NotNull(message = "主键不能为空")
    private Long zj;

    @ApiModelProperty(value = "机构简称", name = "name")
    private String name;

    @ApiModelProperty(value = "机构全称", name = "fullName")
    private String fullName;

    @ApiModelProperty(value = "机构地址", name = "address")
    private String address;

    @ApiModelProperty(value = "机构编码", name = "code")
    private String code;

    @ApiModelProperty(value = "机构父级主键", name = "parentId")
    private Long parentId;

    @ApiModelProperty(value = "机构级别（1 总部 2 分部 3 支部）", name = "orgLevel")
    private String orgLevel;

    @ApiModelProperty(value = "顺序", name = "sx")
    private Integer sx;

    @ApiModelProperty(value = "机构简介", name = "briefIntroduction")
    private String briefIntroduction;

    @ApiModelProperty(value = "机构图片", name = "photo")
    private String photo;

    @ApiModelProperty(value = "所在省份编码", name = "provinceCode")
    private String provinceCode;

    @ApiModelProperty(value = "所在城市编码", name = "cityCode")
    private String cityCode;

    @ApiModelProperty(value = "所在区县编码", name = "areaCode")
    private String areaCode;

    @ApiModelProperty(value = "经度", name = "longitude")
    private String longitude;

    @ApiModelProperty(value = "纬度", name = "latitude")
    private String latitude;

    @ApiModelProperty(value = "电话", name = "phone")
    private String phone;

    @ApiModelProperty(value = "电子邮箱", name = "email")
    private String email;

    @ApiModelProperty(value = "传真", name = "fax")
    private String fax;

    @ApiModelProperty(value = "负责人姓名", name = "fzrName")
    private String fzrName;

    @ApiModelProperty(value = "负责人电话", name = "fzrPhone")
    private String fzrPhone;

    @ApiModelProperty(value = "联系人姓名", name = "lxrName")
    private String lxrName;

    @ApiModelProperty(value = "联系人电话", name = "lxrPhone")
    private String lxrPhone;
}
