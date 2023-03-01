package com.csxy.blog.controller;

import com.csxy.blog.pojo.YUser;
import com.csxy.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author: jamin
 * @CreatTime: 2022-11-05-16:32
 * @Description:
 */
@Controller
public class RegisterLoginController {

    @Autowired
    private UserService userService;

    @GetMapping("register")
    public String registerPage(){
        return "/blog_register";
    }

    //游客访问
    @GetMapping("/otherLogin")
    public String OtherLoginPage(){
        return "/other_login";
    }

    //游客登录
    @PostMapping("/other")
    public String login(@RequestParam String yName,
                        @RequestParam String pwd,
                        HttpSession session) {
        YUser yUser = userService.checkYUser(yName,pwd);
        if (yUser != null){
            yUser.setPwd(null);//防止密码被前端拿到
            session.setAttribute("yUser",yUser);
            return "/blog_list";
        }
        return "/other_login";
    }

    //游客注册
    @PostMapping("/reg")
    public String reg(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("username");
        String pwd = request.getParameter("password");
        YUser yUser = new YUser();
        userService.insertYName(name,pwd);
        return "/other_login";
    }
}
