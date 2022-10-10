package com.xiaoyu.api.util;

import java.math.BigDecimal;

/**
 * WJY
 */
public class BigDecimalUtils {

    /******************************************加法开始******************************************/
    public static BigDecimal strAdd(String v1,String v2){
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.add(b2);
    }
    public static BigDecimal intAdd(int v1,int v2){
        BigDecimal b1 = new BigDecimal(Integer.toString(v1));
        BigDecimal b2 = new BigDecimal(Integer.toString(v2));
        return b1.add(b2);
    }
    public static BigDecimal doubleAdd(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2);
    }
    public static BigDecimal floatAdd(float v1, float v2) {
        BigDecimal b1 = new BigDecimal(Float.toString(v1));
        BigDecimal b2 = new BigDecimal(Float.toString(v2));
        return b1.add(b2);
    }
    /******************************************加法结束******************************************/

    /******************************************减法开始******************************************/
    public static BigDecimal strSub(String v1,String v2){
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.subtract(b2);
    }
    public static BigDecimal intSub(int v1,int v2){
        BigDecimal b1 = new BigDecimal(Integer.toString(v1));
        BigDecimal b2 = new BigDecimal(Integer.toString(v2));
        return b1.subtract(b2);
    }
    public static BigDecimal doubleSub(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2);
    }
    public static BigDecimal floatSub(float v1, float v2) {
        BigDecimal b1 = new BigDecimal(Float.toString(v1));
        BigDecimal b2 = new BigDecimal(Float.toString(v2));
        return b1.subtract(b2);
    }
    /******************************************减法结束******************************************/

    /******************************************乘法开始******************************************/
    public static BigDecimal strMul(String v1,String v2){
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.multiply(b2);
    }
    public static BigDecimal intMul(int v1,int v2){
        BigDecimal b1 = new BigDecimal(Integer.toString(v1));
        BigDecimal b2 = new BigDecimal(Integer.toString(v2));
        return b1.multiply(b2);
    }
    public static BigDecimal doubleMul(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.multiply(b2);
    }
    public static BigDecimal floatMul(float v1, float v2) {
        BigDecimal b1 = new BigDecimal(Float.toString(v1));
        BigDecimal b2 = new BigDecimal(Float.toString(v2));
        return b1.multiply(b2);
    }
    /******************************************减法结束******************************************/

    /******************************************除法开始******************************************/
    public static BigDecimal strDiv(String v1,String v2){
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.divide(b2, 2, BigDecimal.ROUND_HALF_UP);
    }
    public static BigDecimal intDiv(int v1,int v2){
        BigDecimal b1 = new BigDecimal(Integer.toString(v1));
        BigDecimal b2 = new BigDecimal(Integer.toString(v2));
        return b1.divide(b2, 2, BigDecimal.ROUND_HALF_UP);
    }
    public static BigDecimal doubleDiv(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        // 保留小数点后两位 ROUND_HALF_UP = 四舍五入
        return b1.divide(b2, 2, BigDecimal.ROUND_HALF_UP);
    }
    public static BigDecimal floatDiv(float v1, float v2) {
        BigDecimal b1 = new BigDecimal(Float.toString(v1));
        BigDecimal b2 = new BigDecimal(Float.toString(v2));
        // 保留小数点后两位 ROUND_HALF_UP = 四舍五入
        return b1.divide(b2, 2, BigDecimal.ROUND_HALF_UP);
    }
    public static BigDecimal strDivRound(String v1,String v2,int scale,int round){
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.divide(b2, scale, round);
    }
    public static BigDecimal intDivRound(int v1,int v2,int scale,int round){
        BigDecimal b1 = new BigDecimal(Integer.toString(v1));
        BigDecimal b2 = new BigDecimal(Integer.toString(v2));
        return b1.divide(b2, scale, round);
    }
    public static BigDecimal doubleDivRound(double v1, double v2,int scale,int round) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        // 保留小数点后两位 ROUND_HALF_UP = 四舍五入
        return b1.divide(b2, scale, round);
    }
    public static BigDecimal floatDivRound(float v1, float v2,int scale,int round) {
        BigDecimal b1 = new BigDecimal(Float.toString(v1));
        BigDecimal b2 = new BigDecimal(Float.toString(v2));
        // 保留小数点后两位 ROUND_HALF_UP = 四舍五入
        return b1.divide(b2, scale, round);
    }
    /******************************************除法结束******************************************/

    /******************************************比较方法开始******************************************/
    /**
     * 比较v1 v2大小
     * @param v1
     * @param v2
     * @return v1>v2 return 1  v1=v2 return 0 v1<v2 return -1
     */
    public static int strCompareTo(String v1,String v2){
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.compareTo(b2);
    }
    public static int intCompareTo(int v1,int v2){
        BigDecimal b1 = new BigDecimal(Integer.toString(v1));
        BigDecimal b2 = new BigDecimal(Integer.toString(v2));
        return b1.compareTo(b2);
    }
    public static int doubleCompareTo(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return  b1.compareTo(b2);
    }
    public static int floatCompareTo(float v1, float v2) {
        BigDecimal b1 = new BigDecimal(Float.toString(v1));
        BigDecimal b2 = new BigDecimal(Float.toString(v2));
        return  b1.compareTo(b2);
    }
    /******************************************比较方法结束******************************************/

}
