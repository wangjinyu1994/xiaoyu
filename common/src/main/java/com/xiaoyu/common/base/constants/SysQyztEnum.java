package com.xiaoyu.common.base.constants;

/**
 * WJY
 * 黑名单启用状态枚举类
 */
public enum SysQyztEnum {

    HMD_QY("1", "启用"),
    HMD_JY("2", "禁用"),
    ;

    private String code;
    private String value;

    SysQyztEnum(String code, String value) {
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
