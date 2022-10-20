package com.xiaoyu.common.base.constants;

/**
 * WJY
 * 文件格式枚举类
 */
public enum FileFormatEunm {

    WJGS_TXT("1","txt"),
    WJGS_EXE("2","exe"),
    WJGS_DOC("3","doc"),
    WJGS_DOCX("4","docx"),
    WJGS_XLS("5","xls"),
    WJGS_XLSX("6","xlsx"),
    WJGS_RAR("7","rar"),
    WJGS_ZIP("8","zip"),
    WJGS_PPT("9","ppt"),
    WJGS_WPS("10","wps"),
    WJGS_RM("11","rm"),
    WJGS_RMVB("12","rmvb"),
    WJGS_MP3("13","mp3"),
    WJGS_WMA("14","wma"),
    WJGS_WAV("15","wav"),
    WJGS_MP4("16","mp4"),
    WJGS_M3U8("17","m3u8"),
    WJGS_WFS("18","wfs"),
    WJGS_TORRENT("19","torrent"),
    WJGS_IOS("20","ios"),
    WJGS_AAC("21","aac"),
    WJGS_CDA("22","cda"),
    WJGS_FLAC("23","flac"),
    WJGS_M4A("24","m4a"),
    WJGS_MID("25","mid"),
    WJGS_MKA("26","mka"),
    WJGS_MP2("27","mp2"),
    WJGS_MPA("28","mpa"),
    WJGS_MPC("29","mpc"),
    WJGS_APE("30","ape"),
    WJGS_OFR("31","ofr"),
    WJGS_OGG("32","ogg"),
    WJGS_RA("33","ra"),
    WJGS_WV("34","wv"),
    WJGS_TTA("35","tta"),
    WJGS_AC3("36","ac3"),
    WJGS_DT3("37","dt3"),
    WJGS_TAK("38","tak"),
    WJGS_OPTIMFROG("39","OptimFROG"),
    WJGS_SHORTEN("40","Shorten"),
    WJGS_NCM("41","ncm"),
    WJGS_MFLAC("42","mflac"),
    WJGS_KGM("43","kgm"),
    WJGS_XM("44","xm"),
    ;

    private String code;

    private String value;

    /**
     * 检查文件格式
     */
    public static boolean contain(String value){
        FileFormatEunm[] eunm = FileFormatEunm.values();
        for (FileFormatEunm data : eunm){
            if (value.toUpperCase().equals(data.getValue().toUpperCase())){
                return true;
            }
        }
        return false;
    }

    private FileFormatEunm(String code , String value){
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
