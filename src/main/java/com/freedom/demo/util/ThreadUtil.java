package com.freedom.demo.util;

/**
 * Description: 线程工具类
 * @version 1.0
 * @author huzhibo
 * @date 2023/2/16 14:08
 */
public class ThreadUtil {

    /**
     * 线程休眠
     */
    public static void sleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
