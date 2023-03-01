package com.csxy.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: jamin
 * @CreatTime: 2022-11-09-12:37
 * @Description:
 */
@Controller
public class ForwardController {
    @GetMapping("/edit")
    public String edit(){
        return "/blog_edit";
    }

    @GetMapping("/index")
    public String index(){
        return "/blog_list";
    }

    @GetMapping("/back")
    public String back(){
        return "/blog_login";
    }

    @GetMapping("/user")
    public String user1(){
        return "/user.html";
    }

    @GetMapping("/wel")
    public String wel(){
        return "/welcome.html";
    }

    @GetMapping("/pro")
    public String pro(){
        return "/product.html";
    }

    @GetMapping("/comments")
    public String comments(){
        return "/comments.html";
    }

    @GetMapping("/article")
    public String article(){
        return "/article.html";
    }
}
