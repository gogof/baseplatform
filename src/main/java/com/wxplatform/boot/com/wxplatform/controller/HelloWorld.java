package com.wxplatform.boot.com.wxplatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by fanxx on 1/20 0020.
 */

@Controller
public class HelloWorld {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }
}
