package com.blog;

import com.blog.dao.BlogDao;
import com.blog.dao.FriendLinkDao;
import com.blog.dao.TypeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {
@Autowired
    BlogDao b;

    @Test
    void contextLoads() {
        System.out.println(b.getHotBlog());

    }

}
