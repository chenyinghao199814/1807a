package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ToViewController {

    @RequestMapping("toLogin")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("toTree")
    public String toTree(){
        return "tree";
    }
}
