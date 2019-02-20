package com.jk.controller;

import com.jk.bean.UserBean;
import com.jk.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;


    @GetMapping(value = "loginUser")
    public String loginUser(UserBean userBean, HttpSession session){

        if(userBean == null){
            return "请输入";
        }

        UserBean user = loginService.loginUser(userBean.getUserName());

        if(userBean.getUserName() != null && !user.getUserName().equals(userBean.getUserName())){
            return "请确认是否有此账号？";
        }
        if(userBean.getUserPwd() != null && !user.getUserPwd().equals(userBean.getUserPwd())){
            return "请确认您的密码是正确的！";
        }
        session.setAttribute("user",user);
        return "登陆成功！";
    }

}
