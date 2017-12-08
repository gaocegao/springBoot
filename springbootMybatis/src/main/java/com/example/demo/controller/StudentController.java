package com.example.demo.controller;

import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService sc;
    @PostMapping("/save")
    public String saveStudent(@RequestParam("userName") String userName,@RequestParam("age") String age){
       int mark =  sc.Add(userName,age);
      if(mark==1){
          return "success";
      }else{
          return  "fail";
      }
    }

}
