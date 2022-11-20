package com.xiaoyu.common.base.constants;

/**
 * WJY
 *
 * 黑名单标志枚举类
 */
public enum SysDisableIpSigEnum {

    XIAOYU_HMD("XIAOYU_HMD", "黑名单"),
    XIAOYU_DLJK("XIAOYU_DLJK", "登录接口"),
    ;

    private String code;
    private String value;

    SysDisableIpSigEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }
}
