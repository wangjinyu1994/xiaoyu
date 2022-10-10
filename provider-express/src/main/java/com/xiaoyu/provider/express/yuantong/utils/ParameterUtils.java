package com.xiaoyu.provider.express.yuantong.utils;

import com.alibaba.fastjson.JSONObject;
import com.xiaoyu.common.base.constants.YuanTongRespEnum;
import com.xiaoyu.provider.express.yuantong.resp.GetExpressMessageResp;
import com.xiaoyu.provider.express.yuantong.resp.GetVerificationCodeByOrderResp;

import java.util.List;

/**
 * WJY
 */
public class ParameterUtils {

    public static boolean captchaVcode(String message){
        JSONObject jsonObject = JSONObject.parseObject(message);
        String code = jsonObject.getString("code");
        if (YuanTongRespEnum.SUCCESS.getValue().equals(code)){
            return true;
        }
        return false;
    }

    public static String captchaVcodeError(String message){
        JSONObject jsonObject = JSONObject.parseObject(message);
        return jsonObject.getString("message");
    }

    public static GetVerificationCodeByOrderResp captchaVcodeSuccess(String message){
        GetVerificationCodeByOrderResp resp = new GetVerificationCodeByOrderResp();
        JSONObject jsonObject = JSONObject.parseObject(message);
        JSONObject data = jsonObject.getJSONObject("data");
        resp.setCode(data.getString("base64Img"));
        resp.setToken(data.getString("token"));
        return resp;
    }

    public static List<GetExpressMessageResp> getExpressMessage(String message){
        JSONObject jsonObject = JSONObject.parseObject(message);
        String data = jsonObject.getString("data");
        List<GetExpressMessageResp> resp = JSONObject.parseArray(data,GetExpressMessageResp.class);
        return resp;
    }

}
