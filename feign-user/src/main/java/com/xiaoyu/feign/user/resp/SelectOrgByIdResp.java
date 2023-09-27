package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SelectOrgByIdResp", description = "根据主键查询机构请求接口返回实体类")
public class SelectOrgByIdResp extends BaseRespBean {
    private static final long serialVersionUID = 5738074911497364743L;

    @ApiModelProperty(value = "主键", name = "zj")
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

    @ApiModelProperty(value = "所在省份", name = "province")
    private String province;

    @ApiModelProperty(value = "所在城市编码", name = "cityCode")
    private String cityCode;

    @ApiModelProperty(value = "所在城市", name = "city")
    private String city;

    @ApiModelProperty(value = "所在区县编码", name = "areaCode")
    private String areaCode;

    @ApiModelProperty(value = "所在区县", name = "area")
    private String area;

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
