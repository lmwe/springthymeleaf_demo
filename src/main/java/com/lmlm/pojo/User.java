package com.lmlm.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName User
 * @Author: lmlm
 * @Description TODO
 * @date 2021/2/8 16:36
 * @Version 1.0
 */

@Data
public class User implements Serializable {
    private Long id;
    private String name;
    private Integer age;
}
