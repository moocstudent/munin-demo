package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.qishenghe.munin.util.MuninPoint;
import lombok.*;

import java.io.Serializable;

/**
 * @Author: Frank
 * @Date: 2022-02-28 15:01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person implements Serializable {

    private String personName;

    @MuninPoint(dictCode = "sex")
    private String personSex;
}
