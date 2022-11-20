package com.xiaoyu.provider.service.impl;

import com.xiaoyu.common.base.constants.ResponseEnum;
import com.xiaoyu.common.base.exception.CommonServiceException;
import com.xiaoyu.common.base.req.LoginUserInfo;
import com.xiaoyu.common.base.resp.CommonResult;
import com.xiaoyu.common.base.util.SecretUtil;
import com.xiaoyu.provider.base.entity.Xtryxxb;
import com.xiaoyu.provider.dao.XtryxxbMapper;
import com.xiaoyu.provider.dao.ex.XtryxxbMapperEx;
import com.xiaoyu.provider.req.SysUserUpdatePasswordReq;
import com.xiaoyu.provider.resp.SysUserUpdatePasswordResp;
import com.xiaoyu.provider.service.SysUserService;
import com.xiaoyu.provider.util.ReqParamToEntityUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * WJY
 */
@Service
@Slf4j
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private XtryxxbMapper xtryxxbMapper;
    @Autowired
    private XtryxxbMapperEx xtryxxbMapperEx;


    @Override
    public CommonResult<SysUserUpdatePasswordResp> sysUserUpdatePassword(SysUserUpdatePasswordReq req, HttpServletRequest request) {
        LoginUserInfo loginUserInfo = HttpServletRequestUtil.getLoginUserInfo(req,request);
        String password;
        try {
            password = SecretUtil.decryptByRsa(req.getNewPassword());
        } catch (Exception e){
            e.printStackTrace();
            log.error("系统人员修改密码失败，密码秘钥的rsa密文用rsa秘钥解码失败，密码待解密的密文：{}，异常信息：{}", req.getNewPassword(), e);
            throw new CommonServiceException(ResponseEnum.FAIL.getCode(),"新密码不合法");
        }
        Xtryxxb xtryxxb = ReqParamToEntityUtils.sysUserUpdatePassword(SecretUtil.encryptUserPwdBySalt(password),loginUserInfo.getUserId());
        xtryxxbMapper.updateByPrimaryKeySelective(xtryxxb);
        return CommonResult.success();
    }
}
