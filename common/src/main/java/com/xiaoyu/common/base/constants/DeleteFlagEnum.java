package com.xiaoyu.common.base.constants;

/**
 * WJY
 */
public enum DeleteFlagEnum {

    LUOJI_DELETE("0", "逻辑删除", "#EE2C2C"),
    NOT_DELETE("1", "未删除", "#6B8E23"),
    WULI_DELETE("2", "物理删除", "#000000");

    private String delFlagCode;
    private String delFlagDesc;
    private String color;

    DeleteFlagEnum(String delFlagCode, String delFlagDesc, String color) {
        this.delFlagCode = delFlagCode;
        this.delFlagDesc = delFlagDesc;
        this.color = color;
    }

    public static String getHtmlShowDesc(String delFlagCode) {
        for (DeleteFlagEnum deleteFlagEnum : DeleteFlagEnum.values()) {
            if (deleteFlagEnum.getDelFlagCode().equals(delFlagCode)) {
                return "<span style='font-weight:bold;color:" + deleteFlagEnum.getColor() + ";'>" + deleteFlagEnum.getDelFlagDesc() + "</span>";
            }
        }
        return null;
    }

    public String getDelFlagCode() {
        return delFlagCode;
    }

    public void setDelFlagCode(String delFlagCode) {
        this.delFlagCode = delFlagCode;
    }

    public String getDelFlagDesc() {
        return delFlagDesc;
    }

    public void setDelFlagDesc(String delFlagDesc) {
        this.delFlagDesc = delFlagDesc;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
