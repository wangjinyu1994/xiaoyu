package com.xiaoyu.provider.util;

import com.xiaoyu.provider.base.entity.Xtryxxb;

import java.util.Date;

/**
 * WJY
 * 请求参数转实体类工具类
 */
public class ReqParamToEntityUtils {

    /**
     * 系统人员修改密码
     * @param password 新密码
     * @param userId 人员主键
     */
    public static Xtryxxb sysUserUpdatePassword(String password,Long userId) {
        Xtryxxb xtryxxb = new Xtryxxb();
        xtryxxb.setXgsj(new Date());
        xtryxxb.setXgrzj(userId);
        xtryxxb.setRydlmm(password);
        xtryxxb.setZj(userId);
        return xtryxxb;
    }
}
