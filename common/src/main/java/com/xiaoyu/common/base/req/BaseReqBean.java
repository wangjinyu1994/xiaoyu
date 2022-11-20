package com.xiaoyu.common.base.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Date;

/**
 * WJY
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
@ApiModel(value = "BaseReqBean", description = "基础信息入参")
public class BaseReqBean implements Serializable {

    private static final long serialVersionUID = 4566424064009716063L;

    @ApiModelProperty(value = "登录的签名通用k-v，默认值：kega8dsw2291m5b，必填", name = "authKey", required = true)
    @NotBlank(message = "通用校验参数必填")
    @Pattern(regexp = "^kega8dsw2291m5b$", message = "通用校验参数不合法")
    private String authKey;

    @ApiModelProperty(value = "登录的参数签名，如果接口需要做签名验证，则必填", name = "authSign")
    private String authSign;

    @ApiModelProperty(value = "更新时间", name = "updateTime", hidden = true)
    private Date updateTime;
    @ApiModelProperty(value = "更新人主键", name = "updateUser", hidden = true)
    private Long updateUser;

    @ApiModelProperty(value = "系统的token", name = "xiaoyu")
    private String xiaoyu;

}
