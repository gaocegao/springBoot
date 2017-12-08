package com.example.demo.controller;

import com.example.demo.dao.StudentRepository;
import com.example.demo.entity.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRepository  studentDao;
    /**
     * 添加学生
     */
    @PostMapping("/save")
    @ApiOperation(value="添加学生",notes = "添加学生")
    public Student save(@RequestBody Student user){
    return studentDao.save(user);
    }

    /**
     *
     *
     * 查询学生集合
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ApiOperation(value="查询学生哦",notes = "查询全部学生")
    @ApiImplicitParam()
    public List<Student> getStudentList(){
        return studentDao.findAll();
    }

    /**
     * 根据ID查询指定学生
     */
    @GetMapping(value = "/{id}")
    public Student getStudentById(@PathVariable(value = "id") int id){
        return studentDao.findOne(id);
    }

    /**
     * 删除学生
     * @param id
     * @return
     */
    @GetMapping(value="/del/{id}")
    public int deleteStudentById(@PathVariable(value = "id") int id){
        studentDao.delete(id);
        return 1;
    }

}
