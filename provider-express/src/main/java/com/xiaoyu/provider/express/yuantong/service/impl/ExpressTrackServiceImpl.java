package com.xiaoyu.provider.express.yuantong.service.impl;

import com.xiaoyu.common.base.constants.ResponseEnum;
import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.provider.express.yuantong.req.GetExpressMessageReq;
import com.xiaoyu.provider.express.yuantong.req.GetVerificationCodeByOrderReq;
import com.xiaoyu.provider.express.yuantong.resp.GetExpressMessageResp;
import com.xiaoyu.provider.express.yuantong.resp.GetVerificationCodeByOrderResp;
import com.xiaoyu.provider.express.yuantong.service.ExpressTrackService;
import com.xiaoyu.provider.express.yuantong.service.YuanTongExpressService;
import com.xiaoyu.provider.express.yuantong.utils.ParameterUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import javax.annotation.Resource;
import java.util.List;

/**
 * WJY
 */
@Service
@Slf4j
public class ExpressTrackServiceImpl implements ExpressTrackService {

    @Resource
    private YuanTongExpressService yuanTongExpressService;

    @Override
    public CommonResult<GetVerificationCodeByOrderResp> getVerificationCodeByOrder(GetVerificationCodeByOrderReq req) {
        String message = yuanTongExpressService.captchaVcode();
        if (! ParameterUtils.captchaVcode(message)){
            return CommonResult.build(ResponseEnum.FAIL.getCode(),ParameterUtils.captchaVcodeError(message));
        }
        GetVerificationCodeByOrderResp resp = ParameterUtils.captchaVcodeSuccess(message);
        return CommonResult.success(resp);
    }

    @Override
    public CommonResult getExpressMessage(GetExpressMessageReq req) {
        String message = yuanTongExpressService.waybill(getHeaders(req),req.getOrder());
        if (! ParameterUtils.captchaVcode(message)){
            return CommonResult.build(ResponseEnum.FAIL.getCode(),ParameterUtils.captchaVcodeError(message));
        }
        List<GetExpressMessageResp> resp = ParameterUtils.getExpressMessage(message);
        return CommonResult.success(resp);
    }

    private MultiValueMap<String,String> getHeaders(GetExpressMessageReq req){
        MultiValueMap<String,String> multiValueMap = new LinkedMultiValueMap<>();
        multiValueMap.add("x-cap-id",req.getToken());
        multiValueMap.add("x-cap-code",req.getCode());
        return multiValueMap;
    }

}
