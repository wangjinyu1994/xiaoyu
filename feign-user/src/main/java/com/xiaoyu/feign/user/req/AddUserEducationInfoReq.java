package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddUserEducationInfoReq", description = "添加系统人员教育情况信息接口请求入参")
public class AddUserEducationInfoReq extends BaseReqBean {
    private static final long serialVersionUID = -3022823120571893970L;


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
