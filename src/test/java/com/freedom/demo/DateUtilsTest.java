package com.freedom.demo;

import com.freedom.demo.util.DateUtil;
import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * Description: 
 * @version 1.0
 * @author huzhibo
 * @date 2023/2/14 18:35
 */
public class DateUtilsTest {

    @Test
    void contextLoads() {
        System.out.println(DateUtil.format(DateUtil.diffDay(new Date(), 10), DateUtil.YYYY_MM_DD_HH_MM_SS));
        System.out.println(DateUtil.format(DateUtil.diffDay(new Date(), -10), DateUtil.YYYY_MM_DD_HH_MM_SS));
    }
}
