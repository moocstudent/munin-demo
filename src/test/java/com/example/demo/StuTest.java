package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.service.IStudentService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Frank
 * @Date: 2022-02-21 21:32
 */
@Slf4j
public class StuTest extends MybatisPlusDemoApplicationTests{
    @Autowired
    private IStudentService studentService;

    @Test
    public void testAdd(){
        Integer addCode = studentService.addOne(Student.builder().studentName("ukyo").build());
        if (addCode>0){
            log.info("add ok");
        }
    }

    @Test
    public void testAddList(){
        Student ukyo = Student.builder().studentName("ukyo").build();
        Student mooc = Student.builder().studentName("mooc").build();
        Student good = Student.builder().studentName("good").build();
        List<Student> students = Arrays.asList(ukyo, mooc, good);
        Integer code = studentService.insertList(students);
        if (code>0){
            log.info("批量插入:{}",code);
        }
    }
}
