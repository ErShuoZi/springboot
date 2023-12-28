package com;

import com.springboot.bean.Furn;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class HiController {

    //website从application.properties 注入进来
    @Value("${my.website}")
    private String website;
    //装配到HiController
    @Resource
    private Furn furn;
    @RequestMapping("/hi")
    @ResponseBody
    public String hi(){
        return "hi ~" + website;
    }


    @RequestMapping("/furn")
    @ResponseBody
    public Furn furn(){
        return furn;
    }
}
