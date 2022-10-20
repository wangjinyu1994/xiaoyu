package com.xiaoyu.common.base.constants;

/**
 * WJY
 */
public enum YuanTongRespEnum {

    SUCCESS("1","success"),
    ERROR("2","error");

    private String code;

    private String value;

    private YuanTongRespEnum(String code,String value){
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
