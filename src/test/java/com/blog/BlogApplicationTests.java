package com.blog;

import com.blog.dao.FriendLinkDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {
    @Autowired
    FriendLinkDao friendLinkDao;

    @Test
    void contextLoads() {
        System.out.println(friendLinkDao.getFriendLinkByBlogAddress("baidu.com"));
        System.out.println(friendLinkDao.getCount());
        System.out.println(friendLinkDao.getFriendLink(1));

    }

}
