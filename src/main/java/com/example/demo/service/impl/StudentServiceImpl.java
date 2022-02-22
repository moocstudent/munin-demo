package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.IStudentService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Frank
 * @Date: 2022-02-21 21:28
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {
    @Override
    public Integer addOne(Student student) {
        return baseMapper.insert(student);
    }

    @Override
    public Integer insertList(List<Student> list) {
        return baseMapper.insertList(list);
    }
}
