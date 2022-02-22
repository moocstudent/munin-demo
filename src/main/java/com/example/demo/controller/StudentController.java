package com.example.demo.controller;

import com.example.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Frank
 * @Date: 2022-02-21 21:30
 */
@RestController
@RequestMapping("/stu")
public class StudentController {
    @Autowired
    private IStudentService studentService;


//    public Integer addOneStu()
}
