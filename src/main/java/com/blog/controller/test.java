package com.blog.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 蔡梓阳
 * @Date 2022/3/13 21:15
 */
@RestController
public class test {
    @GetMapping("/index")
    public String test(){
        return "测试请求";
    }
}
