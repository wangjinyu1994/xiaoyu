package com.xiaoyu.common.base.constants;

/**
 * WJY
 */
public enum  TgxmQsztEnum {

    TGXM_WFH("1", "未签收"),
    TGXM_PSZ("2", "已签收"),
    ;

    private String code;
    private String value;

    TgxmQsztEnum(String code, String value) {
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
