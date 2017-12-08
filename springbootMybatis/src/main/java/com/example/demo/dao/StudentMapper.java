package com.example.demo.dao;

import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {
    /**
     * 添加学生
     */
   @Insert("insert into student(user_name,age) values(#{userName},#{age})")
   int add(@Param("userName") String userName,@Param("age") String age);


    /**
     * 删除学生
     */
   @Delete("delete student where id={#id}")
    int delete(@Param("id") int id);


    /**
     * 查询全部学生
     */
    @Select("select * from student")
    List<Student> findAllStudent();

    /**
     * 根据ID查询学生
     */
    @Select("select * from student where name={#userName}")
    Student findStudentByUserName(@Param("userName") String userName);
}
