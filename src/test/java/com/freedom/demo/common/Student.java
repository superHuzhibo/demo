package com.freedom.demo.common;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Student {
    String name;
    String age;
    String id;
    String parentId;
    List<Student> students;

    public Student(String id, String parentId) {
        this.id = id;
        this.parentId = parentId;
    }

}