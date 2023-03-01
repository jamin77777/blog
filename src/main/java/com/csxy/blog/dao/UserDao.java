package com.csxy.blog.dao;

import com.csxy.blog.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: jamin
 * @CreatTime: 2022-11-05-3:27
 * @Description:
 */

@Mapper
public interface UserDao {
    @Select("select * from user where username=#{username} and password=#{password}")
    User checkUser(@Param("username") String username, @Param("password") String password);
}
