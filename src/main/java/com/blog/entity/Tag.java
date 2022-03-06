package com.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 蔡梓阳
 * @Date 2022/3/4 18:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tag implements Serializable {
    private Integer id;
    private String name;
    private List<Blog> blogs = new ArrayList<>();
}
