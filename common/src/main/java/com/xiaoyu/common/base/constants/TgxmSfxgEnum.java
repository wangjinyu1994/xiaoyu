package com.xiaoyu.common.base.constants;

/**
 * WJY
 * 团购项目是否限购枚举类
 */
public enum TgxmSfxgEnum {

    TGXM_XG("1", "限购"),
    TGXM_BXG("2", "不限购"),
    ;

    private String code;
    private String value;

    TgxmSfxgEnum(String code, String value) {
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
