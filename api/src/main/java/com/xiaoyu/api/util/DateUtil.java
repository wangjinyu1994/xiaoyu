package com.xiaoyu.api.util;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * WJY
 */
public class DateUtil {

    public final static String DATE_PATTERN_1 = "yyyy-MM-dd HH:mm:ss";
    public final static String DATE_PATTERN_2 = "yyyyMMddHHmmss";
    public final static String DATE_PATTERN_3 = "yyyy-MM-dd HH:mm:ss:SSS";
    public final static String DATE_PATTERN_4 = "yyyy年MM月";
    public final static String DATE_PATTERN_5 = "yyyy-MM-dd";
    public final static String DATE_PATTERN_6 = "yyyy-MM";
    public final static String DATE_PATTERN_7 = "yyyyMM";
    public final static String DATE_PATTERN_8 = "yyyyMMdd";
    public final static String DATE_PATTERN_9 = "yyyyMMddHH";
    public final static String DATE_PATTERN_10 = "yyyyMMddHHmm";
    public final static String DATE_PATTERN_11 = "yyyyMMddHHmmss";
    public final static String DATE_PATTERN_12 = "yyyy";
    public final static String DATE_PATTERN_13 = "yyyy年MM月dd日";
    public final static String DATE_PATTERN_14 = "yyyy-MM-dd HH:mm";
    public final static String DATE_PATTERN_15 = "MM";
    public final static String DATE_PATTERN_16 = "dd";

    public final static int COMPAREDATE1 = 1;
    public final static int COMPAREDATE2 = -1;
    public final static int COMPAREDATE3 = 0;

    public static Date parseStr2DateDefault(String dateStr) throws ParseException {
        return parseStr2Date(dateStr, DATE_PATTERN_1);
    }

    public static Date parseStr2DateDefault(String dateStr, String pattern) throws ParseException {
        return parseStr2Date(dateStr, pattern);
    }

    public static String formatDate2Str(Date date, String pattern) {
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(date);
    }

    public static String formatDate2StrDefault(Date date) {
        return formatDate2Str(date, DATE_PATTERN_1);
    }

    public static Date parseStr2Date(String dateStr, String pattern) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.parse(dateStr);
    }

    public static Date getPreMonthDate(Date date) {
        return getPreNMonthDate(date, -1);
    }

    public static Date getPreNMonthDate(Date date, int amount) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, amount);
        return calendar.getTime();
    }

    public static Date getPreNYearDate(Date date, int amount) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, amount);
        return calendar.getTime();
    }

    public static void main22(String[] args) throws ParseException {
//        String data = "2020-09-28";
//        String nowDateStr = DateUtil.formatDate2Str(new Date(), DATE_PATTERN_5);
//        Date date1 = DateUtil.parseStr2DateDefault(data, DATE_PATTERN_5);
//        Date nowDayDate = DateUtil.parseStr2DateDefault(nowDateStr, DATE_PATTERN_5);
//        //System.out.println(formatDate2StrDefault(date));
//
//        List<String> someDays = getSomeDays("2020-09-22", "2020-09-30");
//        //System.out.println(someDays);
//        String cdata = "2022-09-28 00:00:00";
//        int comparedate = comparedate(DateUtil.parseStr2DateDefault(cdata,DATE_PATTERN_1), new Date());
//        System.out.println(comparedate);

        Date date = addDays(new Date(), 1);
        String dateStr = DateUtil.formatDate2Str(date, DATE_PATTERN_1);
        System.out.println(dateStr);
        List<String> list = getSomeDays("2020-12-21","2021-03-01");
        System.out.println(list);
        int aa = getDiffDinute("2020-12-23 15:25:00","2020-12-23 16:55:00");
        System.out.println(aa);

        List<String> someYears = getSomeYears("2020-12-23", 3);
        System.out.println(someYears);
        Random random = new Random();
        int sig = random.nextInt(1000);
        System.out.println(sig);
    }

    public static Date getPreTimeByMilliSeconds(Date date, long amount) {
        Long now = date.getTime();
        now = now - amount;
        return new Date(now);
    }

    public static Date getFirstDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        Date firstDayTime = calendar.getTime();
        String firstDayTimeStr = formatDate2Str(firstDayTime, DATE_PATTERN_5);
        try {
            return parseStr2Date(firstDayTimeStr + " 00:00:00", DATE_PATTERN_1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 时间戳转date
     *
     * @param timg
     * @return
     */
    public static Date longToDate(Long timg) {
        Date date = new Date(timg);
        return date;
    }

    public static Date getLastDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 0);
        Date lastDayTime = calendar.getTime();
        String lastDayTimeStr = formatDate2Str(lastDayTime, DATE_PATTERN_5);
        try {
            return parseStr2Date(lastDayTimeStr + " 23:59:59", DATE_PATTERN_1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Date addDays(Date date, Integer addDays) {
        if (date == null || addDays == 0) return date;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH,addDays);
        return calendar.getTime();
    }

    public static Date addSeconds(Date date, Integer addSeconds) {
        if (date == null || addSeconds == 0) return date;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.SECOND, addSeconds);
        return calendar.getTime();
    }

    public static Date addMinutes(Date date, Integer minutes) {
        if (date == null || minutes == 0) return date;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int minuts = calendar.get(Calendar.MINUTE);
        calendar.set(Calendar.MINUTE, minuts + minutes);
        return calendar.getTime();
    }

    public static Date addYears(Date date, Integer years) {
        if (date == null || years == 0) return date;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int yesr = calendar.get(Calendar.YEAR);
        calendar.set(Calendar.YEAR, yesr + years);
        return calendar.getTime();
    }

    public static Date reduceMinutes(Date date, Integer minutes) {
        if (date == null || minutes == 0) return date;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int minuts = calendar.get(Calendar.MINUTE);
        calendar.set(Calendar.MINUTE, minuts - minutes);
        return calendar.getTime();
    }

    /**
     * 比较2个日期的大小
     *
     * @param date1
     * @param date2
     * @return
     */
    public static int comparedate(Date date1, Date date2) {
        if (date1.getTime() > date2.getTime())
            return 1;
        else if (date1.getTime() < date2.getTime())
            return -1;
        else
            return 0;
    }

    public static long getTimeDifference(String dateStr1, String dateStr2) {
        long minute = 0L;
        try {
            Date date1 = parseStr2DateDefault(dateStr1);
            Date date2 = parseStr2DateDefault(dateStr2);
            long between = (date2.getTime() - date1.getTime()) / 1000;//除以1000是为了转换成秒
            minute = between % 3600 / 60;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return minute;
    }

    /**
     * 获取2个日期的时间差(精确到天)
     * @param startdate
     * @param enddate
     * @return
     */
    public static long getDayDifference(Date startdate,Date enddate) {
        long days = 0L;
        try {
            long between =(enddate.getTime()-startdate.getTime());
            days=between/(1000*60*60*24);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return days;
    }

    /**
     * 获取两个时间相差多少分钟
     */
    public static Integer getDiffDinute(Date start,Date end){
        long between =(end.getTime()-start.getTime());
        long days=between/(1000*60);
        return (int)days;
    }

    /**
     * 获取两个时间相差多少分钟
     */
    public static Integer getDiffDinute(String start,String end) throws ParseException {
        Date endDate = parseStr2DateDefault(end);
        Date startDate = parseStr2DateDefault(start);
        long between =(endDate.getTime()-startDate.getTime());
        long days=between/(1000*60);
        return (int)days;
    }

    /**
     * 获取一段时间段(起始时间-截止时间)
     *
     * @param dateStart
     * @param dateEnd
     * @return
     */
    public static List<String> getSomeDays(String dateStart, String dateEnd) {
        List<String> dateList = Lists.newArrayList();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_PATTERN_5);
        try {
            Date startDate = sdf.parse(dateStart);
            Date endDate = sdf.parse(dateEnd);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(startDate);

            dateList.add(dateStart);
            while (calendar.getTime().before(endDate)) { //倒序时间,顺序after改before其他相应的改动。
                calendar.add(Calendar.DAY_OF_MONTH, +1);
                dateList.add(sdf.format(calendar.getTime()));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dateList;
    }

    public static List<String> getSomeYears(String dateStr,int years){
        List<String> dateList = Lists.newArrayList();
        SimpleDateFormat yearformat=new SimpleDateFormat(DATE_PATTERN_12);
        try {
            Date lastdate = getlastdate(dateStr, years);
            Date date = parseStr2DateDefault(dateStr, DATE_PATTERN_5);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            while (calendar.getTime().before(lastdate)) { //倒序时间,顺序after改before其他相应的改动。
                calendar.add(Calendar.YEAR, +1);
                String year = yearformat.format(calendar.getTime());
                dateList.add(year);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return dateList;
    }

    public static Date getlastdate(String dateStr,int years) throws Exception {
        Calendar calendar = Calendar.getInstance();
        Date date = parseStr2DateDefault(dateStr, DATE_PATTERN_5);
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, years);
        Date lastdate = calendar.getTime();
        return lastdate;
    }

    public static List<String[]> getJiDuList(int year) {
        if (year > 3000 || year < 2020) {
            return null;
        }
        List<String[]> list = new ArrayList<>();
        Date date = null;
        try {
            date = DateUtil.parseStr2DateDefault(year + "-01-01 12:12:12");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        list.add(getCurrQuarter(date, 1));
        list.add(getCurrQuarter(date, 2));
        list.add(getCurrQuarter(date, 3));
        list.add(getCurrQuarter(date, 4));
        return list;
    }

    public static String[] getCurrQuarter(Date date, int num) {
        String[] s = new String[2];
        String str = "";
        // 设置本年的季
        Calendar quarterCalendar = Calendar.getInstance();
        quarterCalendar.setTime(date);
        switch (num) {
            case 1: // 本年到现在经过了一个季度，在加上前4个季度
                quarterCalendar.set(Calendar.MONTH, 3);
                quarterCalendar.set(Calendar.DATE, 1);
                quarterCalendar.add(Calendar.DATE, -1);
                str = formatDateForMonth(quarterCalendar.getTime(), "yyyy-MM-dd");
                s[0] = str.substring(0, str.length() - 5) + "01-01";
                s[1] = str;
                break;
            case 2: // 本年到现在经过了二个季度，在加上前三个季度
                quarterCalendar.set(Calendar.MONTH, 6);
                quarterCalendar.set(Calendar.DATE, 1);
                quarterCalendar.add(Calendar.DATE, -1);
                str = formatDateForMonth(quarterCalendar.getTime(), "yyyy-MM-dd");
                s[0] = str.substring(0, str.length() - 5) + "04-01";
                s[1] = str;
                break;
            case 3:// 本年到现在经过了三个季度，在加上前二个季度
                quarterCalendar.set(Calendar.MONTH, 9);
                quarterCalendar.set(Calendar.DATE, 1);
                quarterCalendar.add(Calendar.DATE, -1);
                str = formatDateForMonth(quarterCalendar.getTime(), "yyyy-MM-dd");
                s[0] = str.substring(0, str.length() - 5) + "07-01";
                s[1] = str;
                break;
            case 4:// 本年到现在经过了四个季度，在加上前一个季度
                str = formatDateForMonth(quarterCalendar.getTime(), "yyyy-MM-dd");
                s[0] = str.substring(0, str.length() - 5) + "10-01";
                s[1] = str.substring(0, str.length() - 5) + "12-31";
                break;
        }
        return s;
    }

    public static String formatDateForMonth(Date currentDate, String pattern) {
        if (currentDate == null || "".equals(pattern) || pattern == null) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(currentDate);
    }

    /**
     * 时间字符串转时间戳
     */
    public static Long getMillis(String dataStr,String pattern) throws ParseException {
        Date date = parseStr2DateDefault(dataStr,pattern);
        return date.getTime();
    }

    public static void main2(String[] args) {
        System.out.println(JSON.toJSONString(getJiDuList(2020)));
        System.out.println(JSON.toJSONString(getJiDuList(2021)));
        System.out.println(JSON.toJSONString(getJiDuList(2022)));
        System.out.println(JSON.toJSONString(getJiDuList(2023)));
        System.out.println(JSON.toJSONString(getJiDuList(2024)));
        System.out.println(JSON.toJSONString(getJiDuList(2025)));
        System.out.println(JSON.toJSONString(getJiDuList(2026)));
        System.out.println(JSON.toJSONString(getJiDuList(2027)));
        System.out.println(JSON.toJSONString(getJiDuList(2028)));
        System.out.println(JSON.toJSONString(getJiDuList(2029)));
        System.out.println(JSON.toJSONString(getJiDuList(2030)));
        System.out.println(JSON.toJSONString(getJiDuList(2125)));
        String date1Str="2020-10-01 00:00:00";
        String date2Str="2020-11-09 17:30:20";
        try {
            Date date1 = parseStr2DateDefault(date1Str, "yyyy-MM-dd HH:mm:ss");
            Date date2 = parseStr2DateDefault(date2Str, "yyyy-MM-dd HH:mm:ss");
            long days = getDayDifference(date1, date2);
            System.out.println(days);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static int getDayAge(Date birthday) {
        if (birthday == null) return 0;
        Date now = new Date();

        String birMonth = formatDate2Str(birthday, DATE_PATTERN_15);
        String nowMonth = formatDate2Str(now, DATE_PATTERN_15);

        if (Integer.parseInt(nowMonth) > Integer.parseInt(birMonth)) {
            return Integer.parseInt(formatDate2Str(now, DATE_PATTERN_12)) - Integer.parseInt(formatDate2Str(birthday, DATE_PATTERN_12));
        }

        if (Integer.parseInt(nowMonth) < Integer.parseInt(birMonth)) {
            return Integer.parseInt(formatDate2Str(now, DATE_PATTERN_12)) - Integer.parseInt(formatDate2Str(birthday, DATE_PATTERN_12)) - 1;
        }

        String birDay = formatDate2Str(birthday, DATE_PATTERN_16);
        String nowDay = formatDate2Str(now, DATE_PATTERN_16);

        if (Integer.parseInt(nowDay) >= Integer.parseInt(birDay)) {
            return Integer.parseInt(formatDate2Str(now, DATE_PATTERN_12)) - Integer.parseInt(formatDate2Str(birthday, DATE_PATTERN_12));
        }

        return Integer.parseInt(formatDate2Str(now, DATE_PATTERN_12)) - Integer.parseInt(formatDate2Str(birthday, DATE_PATTERN_12)) - 1;
    }

    public static void main(String[] args) throws ParseException {

    }

}
