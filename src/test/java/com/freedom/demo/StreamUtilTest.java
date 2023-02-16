package com.freedom.demo;

import com.alibaba.fastjson.JSONObject;
import com.freedom.demo.common.Student;
import com.freedom.demo.common.StudentCopy;
import com.freedom.demo.common.StudentFactory;
import com.freedom.demo.util.StreamUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * Description: 
 * @version 1.0
 * @author huzhibo
 * @date 2023/2/15 14:13
 */
public class StreamUtilTest {
    @Test
    public void test1() {
        List<Student> students = StudentFactory.gainList();
        List<String> strings = StreamUtils.toList(students, Student::getParentId);
        System.out.println(JSONObject.toJSONString(strings));

        List<StudentCopy> studentCopies = StreamUtils.toList(students, student -> {
            StudentCopy studentCopy = new StudentCopy();
            BeanUtils.copyProperties(student, studentCopy);
            return studentCopy;
        });
        System.out.println(JSONObject.toJSONString(studentCopies));
    }


}

