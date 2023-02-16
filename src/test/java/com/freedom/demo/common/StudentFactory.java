package com.freedom.demo.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 
 * @version 1.0
 * @author huzhibo
 * @date 2023/2/15 14:16
 */
public class StudentFactory {

    /**
     * 生成随机的学生list
     */
    public static List<Student> gainList() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("1", ""));
        students.add(new Student("2", "1"));
        students.add(new Student("3", "1"));
        students.add(new Student("4", ""));
        return students;
    }
}
