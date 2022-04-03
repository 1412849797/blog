package com.blog.controller;


import com.blog.service.BlogService;
import com.blog.service.RedisService;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 蔡梓阳
 * @Date 2022/3/13 21:15
 */

@Controller
public class test {
    @Autowired
    BlogService blogService;


    @GetMapping("/index")
    public String test(){
        return "测试请求";
    }
    @GetMapping("/time")
    public String archives(Model model) {
        model.addAttribute("archiveMap", blogService.archiveBlog());
        model.addAttribute("blogCount", blogService.countBlog());
        return "time";
    }
}
