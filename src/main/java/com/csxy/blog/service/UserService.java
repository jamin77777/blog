package com.csxy.blog.service;

import com.csxy.blog.pojo.User;
import com.csxy.blog.pojo.YUser;

/**
 * @Author: jamin
 * @CreatTime: 2022-11-05-3:26
 * @Description:
 */
public interface UserService {
    User checkUser(String username, String password);
    YUser checkYUser(String yName, String pwd);
    void insertYName(String yName, String pwd);

    //Map<String, Object> register(YUser user);
}
