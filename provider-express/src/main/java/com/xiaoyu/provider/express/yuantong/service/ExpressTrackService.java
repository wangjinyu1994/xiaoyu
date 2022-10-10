package com.xiaoyu.provider.express.yuantong.service;

import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.provider.express.yuantong.req.GetExpressMessageReq;
import com.xiaoyu.provider.express.yuantong.req.GetVerificationCodeByOrderReq;
import com.xiaoyu.provider.express.yuantong.resp.GetVerificationCodeByOrderResp;

/**
 * WJY
 */

public interface ExpressTrackService {

    CommonResult<GetVerificationCodeByOrderResp> getVerificationCodeByOrder(GetVerificationCodeByOrderReq req);

    CommonResult getExpressMessage(GetExpressMessageReq req);
}
