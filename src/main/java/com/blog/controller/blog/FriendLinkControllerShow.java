package com.blog.controller.blog;

import com.blog.service.FriendLinkService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

/**
 * @Author 蔡梓阳
 * @Date 2022/4/27 13:42
 */
@Controller
public class FriendLinkControllerShow {
    @Resource
    private FriendLinkService friendLinkService;

    @GetMapping("/friends")
    public String friends(Model model) {
        model.addAttribute("friendLinks",friendLinkService.listFriendLink());
        return "friends";
    }
}
