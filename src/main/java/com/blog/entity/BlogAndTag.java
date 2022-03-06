package com.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author 蔡梓阳
 * @Date 2022/3/4 19:05
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BlogAndTag implements Serializable {
    private Integer tagId;
    private Long blogId;
}
