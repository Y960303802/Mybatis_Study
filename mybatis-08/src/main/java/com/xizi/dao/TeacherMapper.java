package com.xizi.dao;

import com.xizi.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {

    //获取老师
   List<Teacher> getTeacher();

   //获取指定老师下所有得学生及老师得信息
    Teacher getTeacher1(@Param("tid") int id);

    Teacher getTeacher2(@Param("tid") int id);
}
