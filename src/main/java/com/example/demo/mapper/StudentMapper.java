package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Frank
 * @Date: 2022-02-21 21:27
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

    Integer insertList(List<Student> list);

    Student getBanzhangByClaId(Long claId);

    List<Student> getStuList(@Param("claId") Long claId);
}
