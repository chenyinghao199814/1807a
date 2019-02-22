package com.jk.controller.cyh;

import com.jk.bean.Ardess;
import com.jk.service.ardess.ArdessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class main {
    @RequestMapping("treeSet")
    public String treeSet(){

        return "reow";
    }
    @RequestMapping("ardess")
    public String ardess(){

        return "user";
    }
   @Autowired
    private ArdessService ardessService;

    @RequestMapping("queryArdess")
    @ResponseBody
    public List<Ardess> queryArdess(){

        return ardessService.queryArdess();
    }
}
