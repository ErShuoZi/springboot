package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HiController {

    //website从application.properties 注入进来
    @Value("${my.website}")
    private String website;
    @RequestMapping("/hi")
    @ResponseBody
    public String hi(){

        return "hi ~" + website;
    }
}
