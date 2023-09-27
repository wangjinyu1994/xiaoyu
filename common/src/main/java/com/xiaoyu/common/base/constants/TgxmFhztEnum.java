package com.xiaoyu.common.base.constants;

/**
 * WJY
 */
public enum TgxmFhztEnum {

    TGXM_WFH("1", "未发货"),
    TGXM_PSZ("2", "派送中"),
    TGXM_PSJS("3", "派送结束"),
    ;

    private String code;
    private String value;

    TgxmFhztEnum(String code, String value) {
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
