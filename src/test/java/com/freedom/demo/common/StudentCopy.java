package com.freedom.demo.common;

import lombok.Data;

import java.util.List;

@Data
public class StudentCopy {
    String name;
    String age;
    String id;
    String parentId;
    List<StudentCopy> students;
}