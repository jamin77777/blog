package com.csxy.blog;

import com.csxy.blog.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {
        System.out.println(userDao.checkUser("admin","123"));
    }
}
