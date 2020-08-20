package com.jk.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("hello")
    public void hello(){}

    @RequestMapping("hi")
    public String hi(){
        return "hi";
    }
}
