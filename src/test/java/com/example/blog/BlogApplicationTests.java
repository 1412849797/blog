package com.example.blog;

import com.example.blog.dao.FriendLinkDao;
import com.example.blog.dao.MessageDao;
import com.example.blog.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {
    @Autowired
    FriendLinkDao friendLinkDao;
    @Autowired
    UserDao userDao;

    @Test
    void contextLoads() {
        System.out.println(friendLinkDao.getFriendLinkByBlogAddress("baidu.com"));
        System.out.println(friendLinkDao.getCount());
        System.out.println(friendLinkDao.getFriendLink(1));
        System.out.println(userDao.getAllUser());
    }

}
