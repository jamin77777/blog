package com.csxy.blog.controller;

import com.csxy.blog.pojo.User;
import com.csxy.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @Author: jamin
 * @CreatTime: 2022-11-05-3:48
 * @Description:
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    //访问
    @GetMapping
    public String loginPage(){
        return "/blog_list";
    }

    //登录
    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        HttpSession session) {
        System.out.println("checkUser");
        User user = userService.checkUser(username,password);
        if (user != null){
            user.setPassword(null);//防止密码被前端拿到
            session.setAttribute("user",user);
            return "/back_admin";
        }
        return "/blog_login";
    }

    //注销
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("user");
        return "/blog_login";
    }
}
