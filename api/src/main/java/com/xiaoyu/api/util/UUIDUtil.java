package com.xiaoyu.api.util;

import java.util.UUID;

/**
 * WJY
 */
public class UUIDUtil {

    /**
     * 不带横杠
     */
    public static String getUUIDShort(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    /**
     * 带横杠
     */
    public static String getUUIDLong(){
        return UUID.randomUUID().toString();
    }

}
