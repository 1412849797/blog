package com.blog;

import com.blog.config.RedisKey;
import com.blog.dao.BlogDao;
import com.blog.dao.FriendLinkDao;
import com.blog.dao.TypeDao;
import com.blog.service.RedisService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {
    @Autowired
RedisService redisService;
    @Test
    void contextLoads() {
        System.out.println(redisService.hHasKey(RedisKey.ARTCILE, String.valueOf(1)));

    }

}
