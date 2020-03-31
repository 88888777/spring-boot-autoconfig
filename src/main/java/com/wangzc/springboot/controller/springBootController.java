package com.wangzc.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class springBootController {

    @RequestMapping("/hello")
    @ResponseBody
    public String getShow(){
        System.out.println("这是个测试git");
        System.out.println("hahhaha....");
        return "Hello World";
    }

}
