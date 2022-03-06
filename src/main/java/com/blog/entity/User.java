package com.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 蔡梓阳
 * @Date 2022/3/4 19:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private Integer id;
    private String nickname;
    private String username;
    private String password;
    private String email;
    private String avatar;
    private List<Blog> blogs = new ArrayList<>();
}
