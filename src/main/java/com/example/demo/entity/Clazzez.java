package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: Frank
 * @Date: 2022-02-23 15:05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("clazzez")
public class Clazzez implements Serializable {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private String claName;

    private transient Student banzhang;

    private transient List<Student> stuList;

}
