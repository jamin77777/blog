package com.csxy.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: jamin
 * @CreatTime: 2022-11-05-16:15
 * @Description:
 */

@Controller
public class DetailController {
    //访问
    @GetMapping("/detail1")
    public String detailPage1() {
        return "/blog_detail1";
    }
    @GetMapping("/detail2")
    public String detailPag2() {
        return "/blog_detail2";
    }
    @GetMapping("/detail3")
    public String detailPage3() {
        return "/blog_detail3";
    }

}
