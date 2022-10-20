package com.xiaoyu.common.base.resp;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "BaseRespBean", description = "返回数据公共bean")
public class BaseRespBean implements Serializable {

    private static final long serialVersionUID = -2161924722535753719L;

}
