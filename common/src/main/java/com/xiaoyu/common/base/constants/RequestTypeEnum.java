package com.xiaoyu.common.base.constants;

/**
 * WJY
 */
public enum RequestTypeEnum {

    POST("POST", "POST"),
    GET("GET", "GET"),
    ;

    private String code;
    private String value;

    RequestTypeEnum(String code, String value) {
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
