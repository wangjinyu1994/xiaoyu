package com.xiaoyu.provider.user.resp;

import com.xiaoyu.common.base.resp.BaseRespBean;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * WJY
 */
@Data
@ApiModel(value = "AddNoticEnclosureInfoResp", description = "添加通知公告附件信息接口返回实体类")
public class AddNoticEnclosureInfoResp extends BaseRespBean {
    private static final long serialVersionUID = 5720714380337702362L;
}
