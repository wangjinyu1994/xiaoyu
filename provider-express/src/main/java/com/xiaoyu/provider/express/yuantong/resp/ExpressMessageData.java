package com.xiaoyu.provider.express.yuantong.resp;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * WJY
 */
@Data
@ApiModel(value = "ExpressMessageData", description = "获取快递信息返回实体类")
public class ExpressMessageData implements Serializable {
    private static final long serialVersionUID = -5283703746340163542L;

    private Long time;

    private String info;

    private boolean needFixPhone;

    private boolean isStation;

    private String code;

    private String name;

    private String stationCode;

    private String stationName;

    private String mobile;

    private String type;

    private String empPhone;

    private String flagging;

    private String documents;

}
