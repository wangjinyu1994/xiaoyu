package com.xiaoyu.common.base.constants;

/**
 * WJY
 * 人员审核状态枚举类
 */
public enum SysUserShztEnum {

    SHZ("1", "审核中"),
    SHTG("2", "审核通过"),
    SHBH("3", "审核驳回"),
    ;

    private String code;
    private String value;

    SysUserShztEnum(String code, String value) {
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
