package com.freedom.demo.java8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * Description: java8时间格式
 * @version 1.0
 * @author huzhibo
 * @date 2022/7/5 10:06
 */
public class LocalDateDemo {
    /*
       新版API中java.time包里的一些关键类：
        Instant：瞬时实例。
        LocalDate：本地日期，不包含具体时间 例如：2014-01-14 可以用来记录生日、纪念日、加盟日等。
        LocalTime：本地时间，不包含日期。
        LocalDateTime：组合了日期和时间，但不包含时差和时区信息。
        ZonedDateTime：最完整的日期时间，包含时区和相对UTC或格林威治的时差。
       Java 8日期时间API 使用说明:
        1）提供了javax.time.ZoneId 获取时区。
        2）提供了LocalDate和LocalTime类。
        3）Java 8 的所有日期和时间API都是不可变类并且线程安全，而现有的Date和Calendar API中的java.util.Date和SimpleDateFormat是非线程安全的。
        4）主包是 java.time,包含了表示日期、时间、时间间隔的一些类。里面有两个子包java.time.format用于格式化， java.time.temporal用于更底层的操作。
        5）时区代表了地球上某个区域内普遍使用的标准时间。每个时区都有一个代号，格式通常由区域/城市构成（Asia/Tokyo），在加上与格林威治或 UTC的时差。例如：东京的时差是+09:00。
        6）OffsetDateTime类实际上组合了LocalDateTime类和ZoneOffset类。用来表示包含和格林威治或UTC时差的完整日期（年、月、日）和时间（时、分、秒、纳秒）信息。
        7）DateTimeFormatter 类用来格式化和解析时间。与SimpleDateFormat不同，这个类不可变并且线程安全，需要时可以给静态常量赋值。 DateTimeFormatter类提供了大量的内置格式化工具，同时也允许你自定义。在转换方面也提供了parse()将字符串解析成日期，如果解析出错会抛出DateTimeParseException。DateTimeFormatter类同时还有format()用来格式化日期，如果出错会抛出DateTimeException异常。
        8）再补充一点，日期格式“MMM d yyyy”和“MMM dd yyyy”有一些微妙的不同，第一个格式可以解析“Jan 2 2014”和“Jan 14 2014”，而第二个在解析“Jan 2 2014”就会抛异常，因为第二个格式里要求日必须是两位的。如果想修正，你必须在日期只有个位数时在前面补零，就是说“Jan 2 2014”应该写成 “Jan 02 2014”。
     */

    public static void main(String[] args) {
        //格式化及类型转化
        format();
        //时间计算
        calculate();
    }

    /**
     * Description: 时间计算相关
     * @author huzhibo
     * @date 2022/7/5 10:11
     */
    private static void calculate() {
        LocalDateTime nowTime = LocalDateTime.now();
        System.out.println("当前年:"+nowTime.getYear());
        //当前年的第多少天
        System.out.println("当前年份天数:"+nowTime.getDayOfYear());
        System.out.println("当前月:"+nowTime.getMonthValue());
        System.out.println("当前时:"+nowTime.getHour());
        System.out.println("当前分:"+nowTime.getMinute());

        /*
         *  ChronoUnit 日期周期单位的标准集合。
         */
        LocalDate startDate = LocalDate.of(2017, Month.NOVEMBER, 17);
        LocalDate endDate = LocalDate.of(2018, Month.JANUARY, 05);
        System.out.println("相差月份:"+ ChronoUnit.MONTHS.between(startDate, endDate));
        System.out.println("两月之间的相差的天数   : " + ChronoUnit.DAYS.between(startDate, endDate));
        //	       相差月份:1
        //	       两天之间的差在天数   : 49
        //绝对时间查
        //取5天后
        LocalDateTime localDateTime = nowTime.plusDays(5);
        //取一个月前
        LocalDateTime localDateTime1 = nowTime.minusMonths(1);
        System.out.println("相差秒数:"+ ChronoUnit.SECONDS.between(nowTime, localDateTime));
        //  相差秒数432000
        //相对时间差
        Period p=Period.between(nowTime.toLocalDate(), localDateTime.toLocalDate());
        System.out.println("相差年: "+p.getYears()+" 相差月 :"+p.getMonths() +" 相差天:"+p.getDays());

        System.out.println("指定2099年的当前时间:"+nowTime.withYear(2099));

    }

    /**
     * Description: 时间格式化及类型转化相关
     * @author huzhibo
     * @date 2022/7/5 10:11
     */
    private static void format() {
        //本地日期,不包括时分秒
        LocalDate nowDate = LocalDate.now();
        System.out.println("当前天数：" + nowDate);
        //本地日期,包括时分秒
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("当前时间：" + nowDateTime);


        //字符串与时间互相转化
        LocalDate ld = LocalDate.parse("2017-11-17");
        System.out.println("2017-11-17转日期：" + ld);
        LocalDateTime ldt3 = LocalDateTime.parse("2018-01-04T09:19:29.499");
        System.out.println("2018-01-04T09:19:29.499转时间：" + ldt3);
        LocalDateTime ldt4 = LocalDateTime.parse("2018-01-04 09:19:29",DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("时间格式化：" + ldt4);
        String format = ldt3.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("时间格式化：" + format);

        //date与java8之间转化 ->ZoneId.systemDefault()指定时区
        Date date = Date.from(nowDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        Date date2 = Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        LocalDate localDate = localDateTime.toLocalDate();

        //指定年月日创建时间
        LocalDate ld3=LocalDate.of(2021, Month.NOVEMBER, 17);
        System.out.println("指定年月日创建时间：" + ld3);


    }

}
