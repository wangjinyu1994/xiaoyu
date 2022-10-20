package com.xiaoyu.common.base.constants;

/**
 * WJY
 */
public enum  SymbolEnum {

    EN_DOUHAO(",", "英文逗号"),
    CN_DOUHAO("，", "中文逗号"),
    EN_WENHAO("?", "英文问号"),
    CN_WENHAO("？", "中文问号"),
    DUNHAO("、", "中文问号"),
    EN_MAOHAO(":", "英文冒号"),
    EN_XIAHUAXIAN("_", "英文下划线"),
    EN_JINGHAO("#", "英文#号"),
    EN_DIANHAO(".", "英文.号"),
    CN_DIANHAO(".", "中文.号"),
    EN_FENHAO(";", "英文分号"),
    CN_FENHAO("；", "中文分号"),
    TY_XIEGANG("/", "斜杠"),
    ;

    private String code;
    private String value;

    SymbolEnum(String code, String value) {
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
