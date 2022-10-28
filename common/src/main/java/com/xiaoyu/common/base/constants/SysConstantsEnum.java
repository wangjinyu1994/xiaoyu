package com.xiaoyu.common.base.constants;

/**
 * WJY
 * 系统常用枚举类
 */
public enum  SysConstantsEnum {

    LOGIN_TOKEN("1","LOGINTOKEN","系统登录token标识"),
    SYS_ZFJ("2","UTF-8","系统字符集"),
    QQFS_POST("3","POST","请求方式POST"),
    QQFS_GET("4","GET","请求方式GET"),
    RZBS("5","logTraceId","日志标识"),
    ;

    private String code;

    private String value;

    private String desc;

    private SysConstantsEnum(String code,String value,String desc){
        this.code = code;
        this.value = value;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }
}
