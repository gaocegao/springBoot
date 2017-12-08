package com.example.demo.service;

import com.example.demo.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {
    @Autowired
    StudentMapper studentDao;

    @Transactional
    public int Add(String userName, String age)
    {
    return  studentDao.add(userName,age);
    }

}
