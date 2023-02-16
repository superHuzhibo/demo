package com.freedom.demo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


/**
 * Description: 时间工具类
 *
 * 需要引用pom
 *         <dependency>
 *             <groupId>org.apache.commons</groupId>
 *             <artifactId>commons-lang3</artifactId>
 *         </dependency>
 * @version 1.0
 * @author huzhibo
 * @date 2023/2/14 16:47
 */
public class DateUtil extends org.apache.commons.lang3.time.DateUtils{

    public static final String YYYY = "yyyy";

    public static final String YYYY_MM = "yyyy-MM";

    public static final String YYYY_MM_DD = "yyyy-MM-dd";

    public static final String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";

    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    private static final String[] PARSE_PATTERNS = {
            "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy-MM",
            "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm", "yyyy/MM",
            "yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm", "yyyy.MM"};

    /**
     * 格式化时间
     */
    public static String format(final Date date, final String format) {
        return new SimpleDateFormat(format).format(date);
    }

    /**
     * 日期型字符串转化为日期 格式
     */
    public static Date parseDate(Object str) {
        if (str == null) {
            return null;
        }
        try {
            return parseDate(str.toString(), PARSE_PATTERNS);
        } catch (ParseException e) {
            return null;
        }
    }
    /**
     * 计算相差天数
     */
    public static int differenceOfDays(Date date1, Date date2) {
        return Math.abs((int) ((date2.getTime() - date1.getTime()) / (1000 * 3600 * 24)));
    }
    /**
     * 指定时间所在天开始时间
     */
    public static Date beginOfDay(Date date){
        return minOfTheTime(date,Calendar.HOUR_OF_DAY,Calendar.MINUTE,Calendar.SECOND,Calendar.MILLISECOND);
    }
    /**
     * 指定时间所在天结束时间
     */
    public static Date endOfDay(Date date){
        return maxOfTheTime(date,Calendar.HOUR_OF_DAY,Calendar.MINUTE,Calendar.SECOND,Calendar.MILLISECOND);
    }
    /**
     * 指定时间所在周开始时间
     */
    public static Date beginOfWeek(Date date){
        return minOfTheTime(date,Calendar.DAY_OF_WEEK,Calendar.HOUR_OF_DAY,Calendar.MINUTE,Calendar.SECOND,Calendar.MILLISECOND);
    }
    /**
     * 指定时间所在周结束时间
     */
    public static Date endOfWeek(Date date){
        return maxOfTheTime(date,Calendar.DAY_OF_WEEK,Calendar.HOUR_OF_DAY,Calendar.MINUTE,Calendar.SECOND,Calendar.MILLISECOND);
    }
    /**
     * 指定时间所在月开始时间
     */
    public static Date beginOfMonth(Date date){
        return minOfTheTime(date,Calendar.DAY_OF_MONTH,Calendar.HOUR_OF_DAY,Calendar.MINUTE,Calendar.SECOND,Calendar.MILLISECOND);
    }
    /**
     * 指定时间所在月结束时间
     */
    public static Date endOfMonth(Date date){
        return maxOfTheTime(date,Calendar.DAY_OF_MONTH,Calendar.HOUR_OF_DAY,Calendar.MINUTE,Calendar.SECOND,Calendar.MILLISECOND);
    }
    /**
     * 指定时间所在年开始时间
     */
    public static Date beginOfYear(Date date){
        return minOfTheTime(date,Calendar.DAY_OF_YEAR,Calendar.HOUR_OF_DAY,Calendar.MINUTE,Calendar.SECOND,Calendar.MILLISECOND);
    }
    /**
     * 指定时间所在年结束时间
     */
    public static Date endOfYear(Date date){
        return maxOfTheTime(date,Calendar.DAY_OF_YEAR,Calendar.HOUR_OF_DAY,Calendar.MINUTE,Calendar.SECOND,Calendar.MILLISECOND);
    }
    /**
     * 是否是早上
     */
    public static boolean isAm(Calendar calendar) {
        return Calendar.AM == calendar.get(Calendar.AM_PM);
    }

    /**
     * 是否是周末
     */
    public static boolean isWeekend(Date date) {
        Calendar calendar = calendar(date.getTime());
        return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY;
    }

    /**
     * 查询指定时间指定天数之后(如果取之前输入负数即可)
     */
    public static Date diffDay(Date date,int diff){
        Calendar calendar = calendar(date.getTime());
        calendar.add(Calendar.DATE,diff);
        return calendar.getTime();
    }

    private static Date maxOfTheTime(Date date,int ... begins){
        Calendar calendar = calendar(date.getTime());
        for (int begin : begins) {
            calendar.set(begin,calendar.getActualMaximum(begin));
        }
        return calendar.getTime();
    }
    private static Date minOfTheTime(Date date,int ... begins){
        Calendar calendar = calendar(date.getTime());
        for (int begin : begins) {
            calendar.set(begin,calendar.getActualMinimum(begin));
        }
        return calendar.getTime();
    }
    /**
     * 根据时间戳获取Calendar
     */
    private static Calendar calendar(long millis) {
        Calendar cal = Calendar.getInstance(TimeZone.getDefault());
        cal.setTimeInMillis(millis);
        return cal;
    }

}
