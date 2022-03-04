package com.example.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author 蔡梓阳
 * @Date 2022/3/4 19:05
 */
@Data
@AllArgsConstructor
public class RequestLog {
    private String url;
    private String ip;
    private String classMethod;
    private Object[] args;
}
