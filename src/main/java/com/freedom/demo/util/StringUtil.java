package com.freedom.demo.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONValidator;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Description: 字符串处理工具类
 *
 * 需要引用pom
 *         <dependency>
 *             <groupId>org.apache.commons</groupId>
 *             <artifactId>commons-lang3</artifactId>
 *         </dependency>
 * @version 1.0
 * @author huzhibo
 * @date 2023/2/15 9:54
 */
public class StringUtil extends StringUtils {

    /**
     * Description: 去除字符串左右两端的大括号及双引号
     * @author huzhibo
     * @date 2022/7/11 11:30
     */
    public static String deleteBracket(String str) {
        return isBlank(str) ? str : str.replaceAll("\\[", "").replaceAll("]", "").replaceAll("\"", "");
    }

    /**
     * Description: 为字符串添加双引号及括号
     * @author huzhibo
     * @date 2022/7/11 11:30
     */
    public static String insertBracket(String str) {
        return isBlank(str) ? str : "[\"" + str + "\"]";
    }
    /**
     * Description: 将数组转化为字符串数组
     * @author huzhibo
     * @date 2022/7/11 11:30
     */
    public static String insertListBracket(Collection<String> stringList){
        return JSONObject.toJSONString(stringList);
    }
    /**
     * Description: 将字符串数组转化为list
     * @author huzhibo
     * @date 2022/7/11 11:30
     */
    public static List<String> deleteListBracket(String str){
        if (isBlank(str)) {
            return new ArrayList<>();
        }
        if (JSONValidator.Type.Array != JSONValidator.from(str).getType()) {
            throw new ClassCastException("string is can't convert jsonArray");
        }

        return JSONArray.parseArray(str,String.class);
    }
}
