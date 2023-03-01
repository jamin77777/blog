package com.csxy.blog.service;

import com.csxy.blog.dao.UserDao;
import com.csxy.blog.dao.YUserDao;
import com.csxy.blog.pojo.User;
import com.csxy.blog.pojo.YUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: jamin
 * @CreatTime: 2022-11-05-3:48
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User checkUser(String username, String password) {
        User user = userDao.checkUser(username,password);
        return user;
    }

    @Autowired
    private YUserDao yUserDao;

    @Override
    public YUser checkYUser(String yName, String pwd) {
        YUser yUser = yUserDao.checkYUser(yName, pwd);
        return yUser;
    }

    @Override
    public void insertYName(String yName, String pwd) {
        yUserDao.insertYName(yName, pwd);
    }



    /*@Override
    public Map<String, Object> register(YUser user) {
        return null;
    }*/
}
