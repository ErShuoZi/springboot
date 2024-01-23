package com.furn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class hi {
    @RequestMapping("/hi")
    @ResponseBody
    public String hi() {
        return "hi~";
    }
}
