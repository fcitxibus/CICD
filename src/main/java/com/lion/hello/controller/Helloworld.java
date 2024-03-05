package com.lion.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Xiao Yu
 * @Date: 2024/3/5 17:09
 * @Version: v1.0.0
 * @Description: TODO
 **/
@Controller
public class Helloworld {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
