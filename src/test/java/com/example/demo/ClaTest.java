package com.example.demo;

import com.example.demo.entity.Clazzez;
import com.example.demo.mapper.ClazzezMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: Frank
 * @Date: 2022-02-23 15:44
 */
@Slf4j
public class ClaTest extends MybatisPlusDemoApplicationTests{
    @Autowired
    private ClazzezMapper clazzezMapper;
    @Test
    public void test(){
        List<Clazzez> clazzez = clazzezMapper.listClazzList();
        log.info("clazzez:{}",clazzez);
    }
}
