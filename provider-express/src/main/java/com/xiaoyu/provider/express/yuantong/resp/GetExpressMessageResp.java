package com.xiaoyu.provider.express.yuantong.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * WJY
 */
@Data
@ApiModel(value = "GetExpressMessageResp", description = "获取快递信息返回实体类")
public class GetExpressMessageResp extends BaseRespBean {
    private static final long serialVersionUID = 6617823167295657929L;

    @ApiModelProperty(value = "订单号",name = "waybillNo")
    private String waybillNo;

    private boolean isS;

    private String empCodeS;

    private String empNameS;

    private String stationCodeS;

    private String stationNameS;

    private boolean isP;

    private String empCodeP;

    private String empNameP;

    private String stationCodeP;

    private String stationNameP;

    private boolean isC;

    private boolean isQ;

    private boolean isD;

    private String flagging;

    private String documents;

    private List<ExpressMessageData> traces;

}
