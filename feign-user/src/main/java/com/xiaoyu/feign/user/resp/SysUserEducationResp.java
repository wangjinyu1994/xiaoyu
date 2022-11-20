package com.xiaoyu.feign.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "SysUserEducationResp", description = "根据人员主键获取人员教育情况请求接口返回实体类")
public class SysUserEducationResp extends BaseRespBean {
    private static final long serialVersionUID = 1886132827224342914L;

    @ApiModelProperty(value = "教育表主键", name = "zj")
    private Long zj;

    @ApiModelProperty(value = "学历", name = "education")
    private String education;

    @ApiModelProperty(value = "学历主键", name = "educationId")
    private Long educationId;

    @ApiModelProperty(value = "是否毕业（1 未毕业 2 已毕业）", name = "graduation")
    private String graduation;

    @ApiModelProperty(value = "专业", name = "major")
    private String major;

    @ApiModelProperty(value = "学校名称", name = "schoolName")
    private String schoolName;

    @ApiModelProperty(value = "学校地址", name = "schoolAddress")
    private String schoolAddress;

    @ApiModelProperty(value = "入学时间", name = "schoolSatrtDate")
    private String schoolSatrtDate;

    @ApiModelProperty(value = "毕业时间", name = "schoolEndDate")
    private String schoolEndDate;



}
