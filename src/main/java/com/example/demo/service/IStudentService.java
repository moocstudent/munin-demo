package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;

/**
 * @Author: Frank
 * @Date: 2022-02-21 21:28
 */
public interface IStudentService {

    Integer addOne(Student student);

    Integer insertList(List<Student> list);
}
