package com.xiaoyu.common.base.constants;

/**
 * WJY
 * 黑名单类型枚举类
 */
public enum SysHmdLxEnum {

    HMD("1", "黑名单"),
    BMD("2", "白名单"),
    ;

    private String code;
    private String value;

    SysHmdLxEnum(String code, String value) {
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
