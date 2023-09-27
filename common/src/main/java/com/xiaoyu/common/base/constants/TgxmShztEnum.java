package com.xiaoyu.common.base.constants;

/**
 * WJY
 * 团购项目审核状态枚举类
 */
public enum  TgxmShztEnum {

    TGXM_SHZ("1", "审核中"),
    TGXM_TG("2", "审核通过"),
    TGXM_BH("3", "审核驳回"),
    ;

    private String code;
    private String value;

    TgxmShztEnum(String code, String value) {
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
