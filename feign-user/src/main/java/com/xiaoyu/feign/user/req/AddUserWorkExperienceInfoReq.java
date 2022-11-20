package com.xiaoyu.feign.user.req;

import com.xiaoyu.common.base.req.BaseReqBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddUserWorkExperienceInfoReq", description = "添加人员工作经历请求接口请求入参")
public class AddUserWorkExperienceInfoReq extends BaseReqBean {
    private static final long serialVersionUID = -6417225405248025163L;


    @ApiModelProperty(value = "公司类型主键", name = "companyTypeId")
    private Long companyTypeId;

    @ApiModelProperty(value = "公司名称", name = "companyName")
    private String companyName;

    @ApiModelProperty(value = "公司地址", name = "companyAddress")
    private String companyAddress;

    @ApiModelProperty(value = "在职状态（1 离职 2 在职）", name = "status")
    private String status;

    @ApiModelProperty(value = "入职时间", name = "enrollingDate")
    private String enrollingDate;

    @ApiModelProperty(value = "离职时间", name = "quitDate")
    private String quitDate;
}
