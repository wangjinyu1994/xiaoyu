package com.xiaoyu.common.base.constants;

/**
 * WJY
 */
public enum TgxmDqztEnum {

    TGXM_QY("1", "启用"),
    TGXM_BXG("2", "停用"),
    ;

    private String code;
    private String value;

    TgxmDqztEnum(String code, String value) {
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
