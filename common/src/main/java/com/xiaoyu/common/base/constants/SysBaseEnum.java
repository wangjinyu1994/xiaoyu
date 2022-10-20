package com.xiaoyu.common.base.constants;

/**
 * WJY
 * 系统基础枚举类
 */
public enum  SysBaseEnum {

    TOKEN("TOKEN", "请求头中的token"),
    ;

    private String code;
    private String value;

    SysBaseEnum(String code, String value) {
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
