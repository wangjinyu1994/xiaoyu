package com.xiaoyu.common.base.constants;

/**
 * WJY
 */
public enum  ImageFormatEnum {

    IMG_BMP("1","bmp"),
    IMG_JPG("2","jpg"),
    IMG_PNG("3","png"),
    IMG_TIF("4","tif"),
    IMG_GIF("5","gif"),
    IMG_PCX("6","pcx"),
    IMG_TGA("7","tga"),
    IMG_EXIF("8","exif"),
    IMG_FPX("9","fpx"),
    IMG_SVG("10","svg"),
    IMG_PSD("11","psd"),
    IMG_CDR("12","cdr"),
    IMG_PCD("13","pcd"),
    IMG_DXF("14","dxf"),
    IMG_UFO("15","ufo"),
    IMG_EPS("16","eps"),
    IMG_AI("17","ai"),
    IMG_RAW("18","raw"),
    IMG_WMF("19","WMF"),
    IMG_WEBP("20","webp"),
    IMG_AVIF("21","avif"),
    IMG_APNG("22","apng"),
    IMG_JPEG("23","jpeg"),
    ;

    private ImageFormatEnum(String code,String value){
        this.code = code;
        this.value = value;
    }

    private String code;

    private String value;

    /**
     * 检查图片格式是否正确
     */
    public static boolean contain(String value){
        ImageFormatEnum[] values  = ImageFormatEnum.values();
        for (ImageFormatEnum data : values){
            if (value.toUpperCase().equals(data.getValue().toUpperCase())){
                return true;
            }
        }
        return false;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }
}
