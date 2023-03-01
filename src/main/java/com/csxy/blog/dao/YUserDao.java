package com.csxy.blog.dao;

import com.csxy.blog.pojo.YUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: jamin
 * @CreatTime: 2022-11-07-8:20
 * @Description:
 */
@Mapper
public interface YUserDao {
    @Select("select * from yuser where yName=#{yName} and pwd=#{pwd}")
    YUser checkYUser(@Param("yName") String yName, @Param("pwd") String pwd);

    @Insert("insert into yuser(yName,pwd) values(#{yName},#{pwd})")
    void insertYName(@Param("yName") String yName, @Param("pwd") String pwd);

}
