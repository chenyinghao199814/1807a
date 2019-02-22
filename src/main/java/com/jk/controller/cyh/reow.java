package com.jk.controller.cyh;

import com.jk.bean.Reow;
import com.jk.bean.UserBean;
import com.jk.service.reow.ReowService;
import org.apache.catalina.mbeans.UserMBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class reow {
    @Autowired
    private ReowService reowService;

    @RequestMapping("queryReow")
    @ResponseBody
    public List<Reow> queryReow(){

        return reowService.queryReow();
    }

    @RequestMapping("queryUser")
    @ResponseBody
    public List<UserBean> queryUser(){

        return reowService.queryUser();
    }

    @RequestMapping("user")
    public String user(){

        return "user";
    }
    @RequestMapping("ardess2")
    public String ardess(){

        return "ardess";
    }
}
