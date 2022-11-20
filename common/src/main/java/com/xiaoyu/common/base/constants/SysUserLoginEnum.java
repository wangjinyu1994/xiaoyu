package com.xiaoyu.common.base.constants;

/**
 * WJY
 * 系统人员登录状态枚举类
 */
public enum SysUserLoginEnum {

    WDL("1", "未登录"),
    YDL("2", "已登录"),
    ;

    private String code;
    private String value;

    SysUserLoginEnum(String code, String value) {
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
