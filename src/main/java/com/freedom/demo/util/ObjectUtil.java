package com.freedom.demo.util;

import java.lang.reflect.Field;
import java.util.Objects;

/**
 * Description: 对象工具类
 * @version 1.0
 * @author huzhibo
 * @date 2023/2/15 10:28
 */
public class ObjectUtil {
    /**
     * 如果对象中存在某些属性为空字符串,则转化成null
     * 倚天类型新增时调用
     */
    public static void emptyStringHandling(Object obj) {
        try {
            //获取对象所有属性集合
            Field[] fields = obj.getClass().getDeclaredFields();
            //遍历所有属性
            for (Field field : fields) {
                //设置允许访问私有属性
                field.setAccessible(Boolean.TRUE);
                Object value = field.get(obj);
                if (value instanceof String && StringUtil.isBlank((String) value)) {
                    field.set(obj, null);
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * 判断是否不为空
     */
    public static boolean isNotNull(Object obj) {
        return !Objects.isNull(obj);
    }
}
