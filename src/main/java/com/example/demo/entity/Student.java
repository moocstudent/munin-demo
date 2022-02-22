package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;

/**
 * @Author: Frank
 * @Date: 2022-02-21 21:13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("student")
public class Student implements Serializable {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private String studentName;

}
