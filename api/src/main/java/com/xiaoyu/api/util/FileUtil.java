package com.xiaoyu.api.util;

import com.xiaoyu.common.base.constants.FileFormatEunm;
import com.xiaoyu.common.base.constants.ImageFormatEnum;
import com.xiaoyu.common.base.constants.ResponseEnum;
import com.xiaoyu.common.base.constants.SymbolEnum;
import com.xiaoyu.common.base.exception.CommonServiceException;

/**
 * WJY
 */
public class FileUtil {

    private static final String BASE64_DATA_IMAGE = "data:image/";
    private static final String BASE64 = "base64";

    public static String getFileSuffix(String fileName){
        int last = fileName.lastIndexOf(SymbolEnum.EN_DIANHAO.getCode());
        if (last == -1){
            throw new CommonServiceException(ResponseEnum.FAIL.getCode(),"该文件不合法");
        } else {
            String suffix = fileName.substring(last,fileName.length());
            if (! ImageFormatEnum.contain(suffix.substring(1,suffix.length())) || ! FileFormatEunm.contain(suffix.substring(1,suffix.length()))){
                throw new CommonServiceException(ResponseEnum.FAIL.getCode(),"非法文件");
            }
            return suffix;
        }
    }

    /**
     * 获取图片后缀
     */
    public static String getSuffix(String fileName){
        int last = fileName.lastIndexOf(SymbolEnum.EN_DIANHAO.getCode());
        if (last == -1){
            throw new CommonServiceException(ResponseEnum.FAIL.getCode(),"该图片不合法");
        } else {
            String suffix = fileName.substring(last,fileName.length());
            if (! ImageFormatEnum.contain(suffix.substring(1,suffix.length()))){
                throw new CommonServiceException(ResponseEnum.FAIL.getCode(),"非法图片");
            }
            return suffix;
        }
    }

    /**
     * 获取base64图片后缀
     */
    public static String getSuffixBase64(String base64){
        if (! legal(base64)){
            throw new CommonServiceException(ResponseEnum.FAIL.getCode(),"base64不合法");
        }
        String[] suffixs = base64.split(SymbolEnum.EN_FENHAO.getCode());
        String[] suffix = suffixs[0].split(SymbolEnum.TY_XIEGANG.getCode());
        return SymbolEnum.EN_DIANHAO.getCode() + suffix[1];
    }

    /**
     * 校验base64合法性
     */
    private static boolean legal(String base64){
        int baseFormat = base64.indexOf(SymbolEnum.EN_DOUHAO.getCode());
        if (baseFormat == -1){
            return false;
        }
        String basePrefix = base64.substring(0,baseFormat);
        if (basePrefix.contains(BASE64) && basePrefix.contains(BASE64_DATA_IMAGE)){
            return true;
        }
        return false;
    }

    /**
     * 获取base64前缀
     */
    public static String getBase64Prefix(String base64){
        int baseFormat = base64.indexOf(SymbolEnum.EN_DOUHAO.getCode());
        String basePrefix = base64.substring(0,baseFormat);
        return basePrefix + SymbolEnum.EN_DOUHAO.getCode();
    }

    public static void main(String[] args) {
        System.out.println(getSuffix("D:\\9dc818bb41ee45089e04ee86abf2ec35ac.jpg"));
        String aa = "data:image/png;base64,";
        System.out.println(getBase64Prefix(aa));
    }

}
