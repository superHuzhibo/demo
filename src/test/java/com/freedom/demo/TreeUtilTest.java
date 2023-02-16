package com.freedom.demo;

import com.freedom.demo.common.Student;
import com.freedom.demo.common.StudentFactory;
import com.freedom.demo.util.TreeUtil;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 
 * @version 1.0
 * @author huzhibo
 * @date 2023/2/14 18:39
 */
public class TreeUtilTest {

    @Test
    void test() {
        List<Student> students = StudentFactory.gainList();
        System.out.println(TreeUtil.buildTree(students, Student::getId, Student::getParentId, Student::setStudents));
    }
}

