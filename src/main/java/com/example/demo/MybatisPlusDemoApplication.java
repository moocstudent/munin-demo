package com.example.demo;

import com.example.demo.entity.Person;
import com.qishenghe.munin.session.MuninSession;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@MapperScan(value = {"com.example.demo.mapper"})
public class MybatisPlusDemoApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusDemoApplication.class, args);
    }

    @Autowired
    private MuninSession muninSession;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Person person1 = new Person("AAA", "1");
        Person person2 = new Person("BBB", "2");


        System.out.println("转换前");


        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);


        personList.forEach(System.out::println);

        System.out.println();

        System.out.println("转换后");
        //转换
        muninSession.getDictTransUtil().transResultCodeToMeaning(personList);


        personList.forEach(System.out::println);
    }
}
