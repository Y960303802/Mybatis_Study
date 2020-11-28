package com.xizi.dao;

import com.xizi.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //查询所有得学生信息，以及对应得老师得信息
    List<Student> getStudent();

     List<Student> getStudent2();
}
