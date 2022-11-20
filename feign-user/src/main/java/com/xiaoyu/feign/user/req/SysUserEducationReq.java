package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * WJY
 */
@Data
@ApiModel(value = "SysUserEducationReq", description = "根据人员主键获取人员教育情况请求接口请求入参")
public class SysUserEducationReq extends BaseReqBean {
    private static final long serialVersionUID = 2681667847460549378L;

    @ApiModelProperty(value = "教育表主键", name = "zj")
    @NotNull(message = "教育表主键不能为空")
    private Long zj;

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
