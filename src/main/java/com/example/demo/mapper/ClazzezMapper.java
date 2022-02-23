package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Clazzez;
import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Frank
 * @Date: 2022-02-23 15:09
 */
@Mapper
public interface ClazzezMapper extends BaseMapper<Student> {

    /**
     * 查询班级以及对应班级中的班长和其他学生列表
     * @return
     */
    List<Clazzez> listClazzList();
}
